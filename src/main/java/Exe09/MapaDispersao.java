/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe09;

import Exe06.ListaEncadeada;
import Exe06.NoLista;

/**
 *
 * @author nklaraujo
 */
public class MapaDispersao <T> {
    private ListaEncadeada<NoMapa<T>> info[];
    private int tamanhoMapa;

    public MapaDispersao(int tamanho)
    {
       this.info =  new ListaEncadeada[tamanho];
       this.tamanhoMapa = 0;
    }
    
    private int calcularHash(int chave)
    {
      int tamanho = info.length;
      return chave % tamanho;
    }
    
    public void inserir(int chave, T dado)
    {
      int indice = calcularHash(chave);
      
      if(info[indice] == null)
      {
          info[indice] = new ListaEncadeada<>();
      }
      
      NoMapa<T> noMapa = new NoMapa<>();
      noMapa.setChave(chave);
      noMapa.setInfo(dado);
      info[indice].inserir(noMapa);
      tamanhoMapa ++;
    }

    public T buscar(int chave){
        int indice = calcularHash(chave);

        if(info[indice] != null){
            NoMapa<T> noMapa = new NoMapa<>();
            noMapa.setChave(chave);
            
            NoLista<NoMapa<T>> no;
            no = info[indice].buscar(noMapa);
            if(no != null){
            return no.getInfo().getInfo();
           }
        }
        return null;
    }

    // ter um atributo do tamanho do mapa para melhor performance
    public double calcularFatorCarga(){
//        int qtdeObjetosAdicionados = 0;
//        for (ListaEncadeada<NoMapa<T>> info1 : info) {
//            if (info1 != null) {
//                qtdeObjetosAdicionados = qtdeObjetosAdicionados + info1.obterComprimento();
//            }
//        }
//
//        return (1.0) * qtdeObjetosAdicionados / info.length;
        return (1.0) * tamanhoMapa / info.length;
    }
    
    public void remover(int chave){
      int indice = calcularHash(chave);
      
      if(info[indice] != null){
        NoMapa no = new NoMapa<>();
        no.setChave(chave);
        info[indice].retirar(no);
        tamanhoMapa --;
      }
    }

    public void includeAll(MapaDispersao<T> mapToInclude) {
        for (ListaEncadeada<NoMapa<T>> position : mapToInclude.info) {
            if (position != null) {
                NoLista<NoMapa<T>> item = position.getPrimeiro();
                while(item != null) {
                    inserir(item.getInfo().getChave(), item.getInfo().getInfo());
                    item = item.getProximo();
                }
            }
        }
    }
}

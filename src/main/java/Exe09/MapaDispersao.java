/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe09;

import Exe06.ListaEncadeada;

/**
 *
 * @author nklaraujo
 */
public class MapaDispersao <T> {
    private ListaEncadeada<NoMapa<T>> info[];

    public MapaDispersao(int tamanho)
    {
       this.info =  new ListaEncadeada[tamanho];
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
          info[indice] = new ListaEncadeada();
      }
      
      NoMapa<T> noMapa = new NoMapa<>();
      noMapa.setChave(chave);
      noMapa.setInfo(dado);
      info[indice].inserir(noMapa);
     
    }

    public T buscar(int chave){
        int indice = calcularHash(chave);

        if(info[indice] != null){
            NoMapa<T> noMapa = new NoMapa<>();
            noMapa.setChave(chave);
            NoMapa<T> no = info[indice].buscar(noMapa);
            return  no.getInfo();
        }
        return null;
    }

    public double calcularFatorCarga(){

    }
    
    
    
}

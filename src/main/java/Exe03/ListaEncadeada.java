/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe03;

/**
 *
 * @author nicol
 */
public class ListaEncadeada<T> {
    private NoLista<T> primeiro;
    private int qtdeNos;

    public void setPrimeiro(NoLista<T> primeiro) {
        this.primeiro = primeiro;
    }

    public ListaEncadeada(){
       this.primeiro = null;
    }

    public NoLista<T> getPrimeiro() {
        return primeiro;
    }

    public void inserir(T info){;
       NoLista<T> novo = new NoLista<>();
       novo.setInfo(info);
       novo.setProximo(primeiro);
       this.primeiro = novo;
       qtdeNos ++;
    }
    
    public boolean estaVazia()
    {
        return primeiro == null;
    }

    public NoLista<T> buscar(T info){
       NoLista<T> p = primeiro;
       
       while(p != null){
         if(p.getInfo().equals(info)){
            return p;
         }
         p = p.getProximo();
       }
      return null;
    }

    public void retirar(T info){
        NoLista<T> anterior = null;
        NoLista<T> p = primeiro;

        while(p != null && !p.getInfo().equals(info)){
            anterior = p;
            p = p.getProximo();
        }

        if(p != null){
            if(p == primeiro){
                primeiro = p.getProximo();
            } else {
                anterior.setProximo(p.getProximo());
            }
        }
    }

    public int obterComprimento(){
        NoLista<T> p = primeiro;
        int comprimento = 0;

      
      while(p != null){
        comprimento ++;
        p = p.getProximo();
      }
      
      return comprimento;
      // ou apenas return qteNos;
    }

    public NoLista<T> obterNo(int idx){
        if(idx < 0){
          throw new IndexOutOfBoundsException();
        }        

       NoLista<T> p = primeiro;
       
       while((p != null) && (idx > 0)){
          idx --;
          p = p.getProximo();
       }

       if(p == null){
             throw new IndexOutOfBoundsException();
       }
      return p;
    }
}

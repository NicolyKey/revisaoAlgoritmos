/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe05;
import Exe03.ListaEncadeada;

/**
 *
 * @author nklaraujo
 */
public class PilhaLista<T> implements Pilha<T>{

    private ListaEncadeada<T> lista = new ListaEncadeada<>();
    @Override
    public void push(T info) {
     lista.inserir(info);
    }

    @Override
    public T peek() {
    if(estaVazia()){
      throw new PilhaVaziaException();
    }
      return  lista.getPrimeiro().getInfo(); 
    }
    
    @Override
    public T pop() {
      T valor = peek();
      lista.retirar(valor);
      
      return valor;
    }

    @Override
    public boolean estaVazia() {
      return lista.estaVazia();
    }

    @Override
    public void liberar() {
      lista = new ListaEncadeada();
      
      /*
      while(!estaVazia()){
         try{
         while(true){
            pop(); 
           }
         }catch(PilhaVazia e){
         
         }
      }
      */
    }
    
    public String toString(){
       return lista.toString();
    }
    
}

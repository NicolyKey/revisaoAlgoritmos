/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe05;
import Exe03.ListaEncadeada;
import Exe03.NoLista;

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

      while(!estaVazia()){
         try{
         while(true){
            pop(); 
           }
         }catch(PilhaVaziaException e){
         
         }
      }

    }
    public String toString(){
        return  lista.toString();
    }
    
    //[10,20,30] - 10,10,20,20,30,30
    public void duplicarEntrada(){
        NoLista<T> p = new NoLista<>();
        p.setInfo(peek()); // pega o ponteiro e fala que ele é o primeiro
        T primeiro = peek(); // declara o primeirp

        while(p != null){
            if(p == primeiro){
                p.setProximo(p); //
            }
            NoLista<T> proximo = p.getProximo(); // pega o proximo do ponteiro
            p.setProximo(p); // declara que o prox do ponteiro é ele mesmo
            p.getProximo().setProximo(proximo); // pega o proximo e declara que o proximo é o proximo
            p = p.getProximo(); // pra conseguir andar
        }

    }

    
}

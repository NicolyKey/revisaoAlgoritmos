/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe05;

/**
 *
 * @author nklaraujo
 */
public class PilhaVetor<T> implements Pilha<T> {
    
    private Object[] info;
    private int limite;
    private int tamanho;

    public PilhaVetor(int limite) {
        this.limite = limite;
        this.tamanho = 0;
        this.info = new Object[limite];
    }
    

    @Override
    public void push(T valor) {
      if( limite == tamanho){
         throw new RuntimeException();
      }
       info[tamanho] = valor;
       tamanho ++;
      
    }

    @Override
    public T pop() {
      T valor;
      valor = peek();
      
      //precisa apagar a referencia do objeto
      tamanho --;
      return valor;      
    }

    @Override
    public T peek() {
     if(estaVazia()){
       throw new RuntimeException();
     }
     
     return (T) info[tamanho - 1];
    }

    @Override
    public boolean estaVazia() {
    }

    @Override
    public void liberar() {
    }
    
    
    public String toString(){
       return String;
    };
    
    public void concatenar(PilhaVetor<T> p){
    
    }    
}

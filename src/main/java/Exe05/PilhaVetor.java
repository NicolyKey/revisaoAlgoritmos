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
         throw new PilhaCheiaException();
      }
       info[tamanho] = valor;
       tamanho ++;
      
    }
    
    @Override
    public T peek() {
     if(estaVazia()){
       throw new PilhaVaziaException();
     }
     
     return (T) info[tamanho - 1];
    }

    @Override
    public T pop() {
      T valor = peek();     
      info[tamanho -1] = null;
      tamanho --;
      
      return valor;      
    }

    @Override
    public boolean estaVazia() {
       return tamanho == 0;
    }

    @Override
    public void liberar() {
      info = new Object[limite];
      tamanho = 0;
      
      /*
      ou 
      for(int i=0; i< tamanho -1; i++){
         info[i] = null;
      }
      tamanho = 0;
      */

    }

    @Override
    public String toString() {
      String resultado = "";
      
      for(int i= tamanho -1; i>=0; i--){
         resultado += info[i];
         if(i>0){
           resultado = resultado + ",";
         }
      }
      
     return resultado;
    }
    
    public void concatenar(PilhaVetor<T> p){
       if(this.tamanho + p.tamanho > this.limite){
         throw new PilhaCheiaException();
       }
       
       for(int i =0; i<p.tamanho; i++){
       this.push((T)p.info[i]);
       }
    } 

        public void concatenarAlterado(PilhaVetor<T> p) {
        if (this.tamanho + p.tamanho > this.limite) {
            throw new PilhaCheiaException();
        }

        // Cria um vetor auxiliar para armazenar os elementos na ordem correta
        Object[] elementos = new Object[p.tamanho];
        for (int i = p.tamanho - 1; i >= 0; i--) {
            elementos[i] = p.info[i];
        }

        // Insere os elementos na ordem original da pilha fornecida
        for (int i = 0; i < p.tamanho; i++) {
            this.push((T) elementos[i]);
        }
    }



    public Object[] getInfo() {
        return info;
    }

    public void setInfo(Object[] info) {
        this.info = info;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
  
}

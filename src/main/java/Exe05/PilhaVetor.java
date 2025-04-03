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
        if(tamanho == 0){
          return true;
        }
        return false;
    }

    @Override
    public void liberar() {
      tamanho = 0;
    }

    @Override
    public String toString() {
    String resultado = " ";
    
    for(int i =0; i< tamanho; i++){
       resultado = info[i] + ", ";
    }
        return resultado;
    }
    
    //    concatenar(PilhaVetor):este método deverá concatenar os dados da pilha fornecida como argumento (p) na
    //pilha corrente . O novo topo da pilha deve ser igual ao topo de p. Após a operação, a pilha p deve permanecer com
    //o mesmo conteúdo antes da invocação de concatenar(). Se a pilha corrente não tiver capacidade de armazenar
    //todos os dados da pilha p, deve ser lançada uma exceção.
    public void concatenar(PilhaVetor<T> p){
        if(p.getTamanho() + this.getTamanho() >= this.getLimite()){
           throw new IndexOutOfBoundsException();
        }
        
        T[] elementos =  (T[]) p.getInfo();
        
        for (int i = 0; i < p.getTamanho(); i++) {
        this.push(elementos[i]);
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

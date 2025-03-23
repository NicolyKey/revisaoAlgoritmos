/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe02;

/**
 *
 * @author nicol
 */
public class ListaEstatica<T>{
     private Object info[];
    private int tamanho;
    
    public ListaEstatica(){
      this.tamanho = 0;
      this.info =new Object[tamanho];
    }
    
  
    private void redimensionar(){
    Object[] novoVetor = new Object[info.length + 10];
       
       if(info.length == tamanho){
           for(int i =0; i < info.length; i ++){
              novoVetor[i] = info[i];
           }
       }
       
       info = novoVetor;
    }
    
    public int inserir(T valor){
       if (tamanho == info.length) {
            redimensionar();
        }
             
        info[tamanho] = valor;
     
        return tamanho++;
    }

    
    public void exibir(){
        for(int i = 0; i < tamanho; i++){
            System.out.println(info[i]);
        }
    }
    
    
    public int buscar(int valor){
        for(int i = 0; i < tamanho; i++){
           if(info[i].equals(valor)){
             return i;
           }
        }
        return -1;
    }
    
     public void retirar(int valor){
        int posicao = buscar(valor);
        
        if(posicao > -1){
           for(int i = posicao+1; i<tamanho; i++){
             info[i-1] = info[i];
           }
           tamanho --;
        }
    }
    
     
    public void liberar(){
       tamanho = 0;
       info = new Object[10];
    }
    
    public T obterElemento(int posicao){
      if(posicao >= 0  && (posicao < tamanho)){
        return (T) info[posicao];
      }else{
        throw new IndexOutOfBoundsException();
      }
    }
    
    public boolean estaVazia(){
      return info.length == 0;
    }

    public int getTamanho() {
        return tamanho;
    }
    
     public void retirarEmIntervalos(int inicio, int fim) {
        if (inicio < 0 || fim >= tamanho || inicio > fim) {
            System.out.println("Intervalo inválido");
            return;
        }

        for (int i = fim + 1; i < tamanho; i++) {
            info[i - (fim - inicio + 1)] = info[i];  
        }

        tamanho -= (fim - inicio + 1);
    }
    
    public String toString() {
        String resultado = String.valueOf(this.info[0]);
        for (int i = 1; i < this.tamanho; i++) {
            resultado += ", " + this.info[i];
        }
        return resultado;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe01;

/**
 *
 * @author nicol
 */
public class ListaEstatica {
    private int info[];
    private int tamanho;
    
    public ListaEstatica(){
      this.tamanho = 0;
      this.info =new int[tamanho];
    }
    
  
    private void redimensionar(){
    int[] novoVetor = new int[info.length + 10];
       
       if(info.length == tamanho){
           for(int i =0; i < info.length; i ++){
              novoVetor[i] = info[i];
           }
       }
       
       info = novoVetor;
    }
    
    public int inserir(int valor){
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
           if(info[i] == valor){
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
       info = new int[10];
    }
    
    public int obterElemento(int posicao){
      if(posicao >= 0  && (posicao < tamanho)){
        return info[posicao];
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
    
//    public void inverter(){
//    for(int i = 0; i < tamanho/2; i++){
//        Object aux =  info[i];
//         info[i] = info[tamanho - 1 - i];
//         info[tamanho - 1 - i] = (int) aux;
//    }
//}
//    public void inverter(){
//        int esquerda = 0;
//        int direita = tamanho - 1;
//
//        int qteTrocas = tamanho / 2;
//
//        Object backup;
//
//        while(qteTrocas > 0){
//            backup = info[esquerda];
//            info[esquerda] = indo[direita]
//            info[direita] = backup;
//
//            esquerda ++;
//            direita --;
//
//            qteTrocas --;
//        }
//        
//    }
    
}

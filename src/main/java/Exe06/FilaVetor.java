/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe06;

/**
 *
 * @author nklaraujo
 */
public class FilaVetor<T> implements Fila<T> {
    
    private  Object[] info;
    private int limite;
    private int tamanho;
    private int inicio;

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

    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public FilaVetor(int limite) {
        this.info = new  Object[limite];
        this.limite = limite;
        this.tamanho = 0;
        this.inicio = 0;
    }

    @Override
    public void inserir(T valor) {
      if(tamanho == limite){
        throw new FilaCheiaException();
      }
      
      int posicaoInserir;
      posicaoInserir = (inicio + tamanho) % limite;
      info[posicaoInserir] = valor;
      tamanho --;
    }

    @Override
    public boolean estaVazia() {
       return tamanho == 0;
    }

    @Override
    public int peek() {
      //TODO: fazer método peek
    }

    @Override
    public int retirar() {
    //TODO: fazer método peek
    }

    @Override
    public void liberar() {
       info = new Object[limite];
       tamanho = 0;
    }    
    
    public FilaVetor<T> criarFilaConcatenada(FilaVetor<T> f2){
      FilaVetor<T> f3 = new FilaVetor<>(this.limite + f2.limite);
      
      int posicao = this.inicio;
      for(int i =0; i< this.tamanho; i++){
        f3.inserir((T) this.info[posicao]);
        posicao = (posicao + 1) % f2.limite;
      }
      
      return f3;
    }
}

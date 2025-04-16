/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe07;

/**
 *
 * @author nklaraujo
 */
public class NoArvoreBinaria<T> {
    
    private NoArvoreBinaria<T> esquerda;
    private NoArvoreBinaria<T> direita;
    private T info;

    public NoArvoreBinaria(T info, NoArvoreBinaria<T> esquerda, NoArvoreBinaria<T> direita ) {
        this.esquerda = esquerda;
        this.direita = direita;
        this.info = info;
    }

    public NoArvoreBinaria(T info) {
        this.esquerda = null;
        this.direita = null;
        this.info = info;
    }

    public NoArvoreBinaria<T> getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(NoArvoreBinaria<T> esquerda) {
        this.esquerda = esquerda;
    }

    public NoArvoreBinaria<T> getDireita() {
        return direita;
    }

    public void setDireita(NoArvoreBinaria<T> direita) {
        this.direita = direita;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe07;

/**
 *
 * @author nklaraujo
 *
 */
public class ArvoreBinaria<T> {
    private NoArvoreBinaria<T> raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public NoArvoreBinaria<T> getRaiz() {
        return raiz;
    }

    public void setRaiz(NoArvoreBinaria<T> raiz) {
        this.raiz = raiz;
    }

    public boolean estaVazia(){
        return raiz == null;
    }

    public boolean pertence(T info)
    {
        return pertence(raiz, info);
    }

    private boolean pertence(NoArvoreBinaria<T> no, T info)
    {
      if(no == null){
          return false;
      }

      return no.getInfo().equals(info) ||
      pertence(no.getEsquerda(), info) ||
      pertence(no.getDireita(), info);

    }

    @Override
    public String toString() {
        return ArvorePre(raiz);
    }

    private String ArvorePre(NoArvoreBinaria<T> no) {
        if (no == null) {
            return "<>";
        }
        return "<" + no.getInfo() + ArvorePre(no.getEsquerda()) + ArvorePre(no.getDireita()) + ">";
    }

    public int contar(){
        return  contar(raiz);
    }

    private int contar(NoArvoreBinaria<T> no){
        int contador = 0;

        if(no == null){
           return contador;
        }
        contador ++;
        return contador + contar(no.getEsquerda()) + contar(no.getDireita());
    }
}

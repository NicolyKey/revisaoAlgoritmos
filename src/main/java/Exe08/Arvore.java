/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe08;

/**
 *
 * @author nklaraujo
 */
public class Arvore <T>{
    private NoArvore<T> raiz;

    public Arvore(){
        this.raiz = null;
    }

    public NoArvore<T> getRaiz() {
        return raiz;
    }

    public void setRaiz(NoArvore<T> raiz) {
        this.raiz = raiz;
    }

    public String toString(){
        String resultado = "";
        if(raiz == null){
            return resultado;
        }
        return  obterRepresentacaoTextual(this.raiz);
    }
    private String obterRepresentacaoTextual(NoArvore<T> no){
        String resultado = "<";
        resultado += no.getInfo();
        NoArvore<T> p = no.getPrimeiro();
        while(p != null){
            resultado += obterRepresentacaoTextual(p);
            p = p.getProximo();
        }
        resultado += ">";
        return  resultado;
    }

    public boolean pertence(T info){
        return  raiz == null ? false : pertence(this.raiz, info);
    }

    private boolean pertence(NoArvore<T> no, T info){
        if(no.getInfo().equals(info)){
            return  true;
        }
        NoArvore<T> p = no.getPrimeiro();

        while(p != null){
            if(pertence(p, info)){
                return  true;
            }
            p = p.getProximo();
        }
        return false;
    }

    public int contarNos(){
        if(this.raiz == null){
            return 0;
        }
        return contarNos(this.raiz);
    }

    private int contarNos(NoArvore<T> no) {
        int contador = 1;
        NoArvore<T> p = no.getPrimeiro();

        while (p != null) {
            contador += contarNos(p);
            p = p.getProximo();
        }

        return contador;
    }

}

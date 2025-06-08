package Exe11.ArvoreBinariaBusca;

import Exe07.NoArvoreBinaria;

public abstract class ArvoreBinariaAbstract<T> {
    private NoArvoreBinaria<T> raiz;

    public ArvoreBinariaAbstract() {
        this.raiz = null;
    }

    public NoArvoreBinaria<T> getRaiz() {
        return raiz;
    }

    protected void setRaiz(NoArvoreBinaria<T> raiz) {
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

    //obter altura
    public int obterAltura(){
        return obterAltura(this.raiz);
    }

    private int obterAltura(NoArvoreBinaria<T> no) {
        if (no == null) {
            return -1;
        }
        int alturaEsquerda = obterAltura(no.getEsquerda());
        int alturaDireita = obterAltura(no.getDireita());
        return 1 + Math.max(alturaEsquerda, alturaDireita);
    }
    //contar folhasA
    public int contarFolhas(){
        return contarFolhas(raiz);
    }

    private int contarFolhas(NoArvoreBinaria<T> no){
        int contador = 0;
        if(no == null){
            return contador;
        }

        int contarFolhasEsquerda = contarFolhas(no.getEsquerda());
        int contarFolhasDireita = contarFolhas(no.getDireita());
        if(no.getEsquerda() == null && no.getDireita() == null){
            contador ++;
        }

        contador += contarFolhasEsquerda + contarFolhasDireita;

        return contador;
    }

    public String arvorePos(NoArvoreBinaria<T> no){
        String resultado = "<";
        if(no != null){
            resultado += arvorePos(no.getEsquerda()) +
                    arvorePos(no.getDireita()) +
                    no.getInfo();
        }

        return resultado += ">";
    }

    public String arvoreOrdem(NoArvoreBinaria<T> no){
        String resultado = "<";
        if(no != null){
            resultado += arvoreOrdem(no.getEsquerda()) +
                    no.getInfo() +
                    arvoreOrdem(no.getDireita());
        }

        return resultado += ">";
    }

    public boolean isBalanced() {
        if (this.raiz == null){
            return true;
        }
        return estaBalanceada(this.raiz);
    }

    private boolean estaBalanceada(NoArvoreBinaria<T> no) {
        int alturaEsquerda = getAltura(no.getEsquerda());
        int alturaDireita = getAltura(no.getDireita());

        return Math.abs(alturaEsquerda - alturaDireita) <= 1 && estaBalanceada(no.getEsquerda()) && estaBalanceada(no.getDireita());
    }

    private int getAltura(NoArvoreBinaria<T> no) {
        if (no == null){
            return 0;
        }

        return Math.max(getAltura(no.getEsquerda()), getAltura(no.getDireita())) + 1;
    }

    public void inverter(){
        inverter(raiz);
    }

    private void inverter(NoArvoreBinaria<T> no){
        if(no == null){
            throw new RuntimeException();
        }
        NoArvoreBinaria<T> temp = no.getEsquerda();
        no.setEsquerda(no.getDireita());
        no.setDireita(temp);

        inverter(no.getEsquerda());
        inverter(no.getDireita());
    }

    public boolean isDegenerada(){
        if(raiz == null){
            return false;
        }
        return isDEgenerada(this.raiz);
    }

    private boolean isDEgenerada(NoArvoreBinaria<T> no){
        if(no.getEsquerda() != null && no.getDireita() != null){
            return false;
        }
        return isDEgenerada(no.getEsquerda()) &&
                isDEgenerada(no.getDireita());
    }


    public abstract NoArvoreBinaria<T> buscar(T valor);
}

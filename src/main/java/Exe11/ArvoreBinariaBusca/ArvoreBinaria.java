package Exe11.ArvoreBinariaBusca;

import Exe07.NoArvoreBinaria;

public class ArvoreBinaria<T> extends ArvoreBinariaAbstract<T> {
    @Override
    public NoArvoreBinaria<T> buscar(T valor) {
        return null;
    }

    //    Algoritmo: buscar(NoArvore no, int valor)
//    se (no = null) então
//    retornar null;
//    fim-se
//    se (valor = no.info) então
//    retornar no;
//    senão
//    se (valor < no.info) então
//    retornar buscar(no.esquerda, valor);
//    senão
//    retornar buscar(no.direita, valor);
//    fim-se
//    fim-se
    private  NoArvoreBinaria<T> buscar(NoArvoreBinaria<T> no, T valor){
     return null;
    }

    public void setRaiz(NoArvoreBinaria<T> raiz){
        super.setRaiz(raiz);
    }
}

package Exe11.ArvoreBinariaBusca;

import Exe07.NoArvoreBinaria;

public class ArvoreBinariaBusca<T extends Comparable<T> extends ArvoreBinariaAbstract<T> {

//    Negativo: O objeto atual é menor.
//    Zero: Os objetos são iguais.
//    Positivo: O objeto atual é maior.
    @Override
    public NoArvoreBinaria<T> buscar(T valor) {
        NoArvoreBinaria<T> p = this.getRaiz();
        while(p != null && p.getInfo().compareTo(valor) != 0){
            if(valor.compareTo(p.getInfo()) < 0){
                p = p.getEsquerda();
            }else{
                p = p.getDireita();
            }
        }
        return p;
    }

    public void inserir(T info){

    }
}

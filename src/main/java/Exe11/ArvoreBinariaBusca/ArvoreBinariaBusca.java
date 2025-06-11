package Exe11.ArvoreBinariaBusca;

import Exe07.NoArvoreBinaria;

public class ArvoreBinariaBusca<T extends Comparable<T>> extends ArvoreBinariaAbstract<T> {

//    Negativo: O objeto atual é menor.
//    Zero: Os objetos são iguais.
//    Positivo: O objeto atual é maior.
    @Override
    public NoArvoreBinaria<T> buscar(T valor) {
        NoArvoreBinaria<T> p = this.getRaiz();
        // o compare é mais custoso que o equals 
        while (p != null && p.getInfo().compareTo(valor) != 0) {
            if (valor.compareTo(p.getInfo()) < 0) {
                p = p.getEsquerda();
            } else {
                p = p.getDireita();
            }
        }
        return p;
    }

    public void retirar(T valor) {
        NoArvoreBinaria<T> ponteiro = this.getRaiz();
        NoArvoreBinaria<T> pai = null;
        boolean filhoEsquerdo = false;

        while (ponteiro != null && !ponteiro.getInfo().equals(valor)) {
            pai = ponteiro;
            if (valor.compareTo(ponteiro.getInfo()) < 0) {
                filhoEsquerdo = true;
                ponteiro = ponteiro.getEsquerda();
            } else {
                filhoEsquerdo = false;
                ponteiro = ponteiro.getDireita();
            }
        }

        if (ponteiro != null) {
            if (ponteiro.getEsquerda() == null && ponteiro.getDireita() == null) {
                if (ponteiro.equals(getRaiz())) {
                    setRaiz(null);
                } else {
                    if (filhoEsquerdo) {
                        pai.setEsquerda(null);
                    } else {
                        pai.setDireita(null);
                    }
                }
            } else {

                if (ponteiro.getDireita() == null) {
                    if (ponteiro == getRaiz()) {
                        setRaiz(ponteiro.getEsquerda());
                    } else {
                        if (filhoEsquerdo) {
                            pai.setEsquerda(ponteiro.getDireita());
                        } else {
                            pai.setDireita(ponteiro.getDireita());
                        }
                    }
                    
                } else {
                    NoArvoreBinaria<T> sucessor = extrairSucessor(ponteiro);

                    if (ponteiro == getRaiz()) {
                        setRaiz(sucessor);
                    } else {
                        if (filhoEsquerdo) {
                            pai.setEsquerda(sucessor);
                        } else {
                            pai.setDireita(sucessor);
                        }
                        sucessor.setEsquerda(ponteiro.getEsquerda());
                    }
                }
            }
        }

        // só vai cair aqui se caso o ponteiro for nulo
    }

    public NoArvoreBinaria<T> extrairSucessor(NoArvoreBinaria<T> ponteiro) {
        NoArvoreBinaria<T> atual = ponteiro.getDireita();
        NoArvoreBinaria<T> paiSucessor = ponteiro;
        NoArvoreBinaria<T> sucessor = ponteiro;

        while (atual != null) {
            paiSucessor = sucessor;
            sucessor = atual;
            atual = atual
        }

    }

    public void inserir(T info) {
        NoArvoreBinaria<T> novoNo = new NoArvoreBinaria<>(info);

        if (getRaiz() == null) {
            setRaiz(novoNo);
            return;
        }

        NoArvoreBinaria<T> p = getRaiz();

        while (true) {
            NoArvoreBinaria<T> pai = p;
            int comparacao = info.compareTo(p.getInfo());

            if (comparacao < 0) {
                p = p.getEsquerda();
                if (p == null) {
                    pai.setEsquerda(novoNo);
                    return;
                }
            } else {
                p = p.getDireita();
                if (p == null) {
                    pai.setDireita(novoNo);
                    return;
                }
            }
        }
    }

    public boolean estaCheia() {
        return estaCheia(getRaiz());
    }

    private boolean estaCheia(NoArvoreBinaria<T> no) {
        if (no == null) {
            return true;
        }

        NoArvoreBinaria<T> esq = no.getEsquerda();
        NoArvoreBinaria<T> dir = no.getDireita();

        if ((esq == null && dir != null) || (esq != null && dir == null)) {
            return false;
        }

        return estaCheia(esq) && estaCheia(dir);
    }

    public boolean estaBalanceada() {
        return estaBalanceada(getRaiz());
    }

    private boolean estaBalanceada(NoArvoreBinaria<T> no) {
        if (no == null) {
            return true;
        }

        int alturaEsq = altura(no.getEsquerda());
        int alturaDir = altura(no.getDireita());

        if (Math.abs(alturaEsq - alturaDir) > 1) {
            return false;
        }

        return estaBalanceada(no.getEsquerda()) && estaBalanceada(no.getDireita());
    }

    private int altura(NoArvoreBinaria<T> no) {
        if (no == null) {
            return 0;
        }
        return 1 + Math.max(altura(no.getEsquerda()), altura(no.getDireita()));
    }

    public boolean estaDegenerada() {
        return estaDegenerada(getRaiz());
    }

    private boolean estaDegenerada(NoArvoreBinaria<T> no) {
        if (no == null) {
            return true;
        }

        NoArvoreBinaria<T> esq = no.getEsquerda();
        NoArvoreBinaria<T> dir = no.getDireita();

        if (esq != null && dir != null) {
            return false;
        }

        if (esq != null) {
            return estaDegenerada(esq);
        } else if (dir != null) {
            return estaDegenerada(dir);
        }

        return true;
    }

}

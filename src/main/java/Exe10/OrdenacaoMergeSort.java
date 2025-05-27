package Exe10;

public class OrdenacaoMergeSort <T extends Comparable<T>> extends OrdenacaoAbstract<T>{
    public void ordenar(){
        int n = getInfo().length -1;
        mergeSort(0, n);
    }

    private void mergeSort(int inicio, int fim){
     if(inicio < fim){
         int meio = (inicio + fim)/fim;
         mergeSort(inicio, meio);
         mergeSort(meio + 1, fim);
         merge(inicio, fim, meio);
     }
    }

    private void merge(int inicio, int fim, int meio){
       T[] info = getInfo();
       int tamEsquerda = meio - inicio + fim;
       T[] esquerda = (T[]) new Object[tamEsquerda];

       for(int i =0; i < tamEsquerda; i++){
           esquerda[i] = info[inicio + i];
       }

        int tamDireita = meio - inicio + fim;
        T[] direita = (T[]) new Object[tamEsquerda];

        for(int i =0; i < tamDireita; i++){
            direita[i] = info[meio + 1 + i];
        }

        int cEsq = 0;
        int cDir = 0;
        for(int i = inicio; i<= fim; i++){
            if(cEsq < tamEsquerda && cDir < tamDireita){
                if(esquerda[cEsq].compareTo(direita[cDir])<0){
                    info[i] = esquerda[cEsq];
                    cEsq ++;
                }else{
                    info[i] = direita[cDir];
                    cDir ++;
                }
            }else{
                break;
            }
        }

        while(cEsq < tamEsquerda){
            info[0] = esquerda[cEsq];
            cEsq ++;
            // i ++;
        }

        while(cDir < tamDireita){
            info[0] = direita[cDir];
            cDir ++;
            // i ++;
        }
    }
}

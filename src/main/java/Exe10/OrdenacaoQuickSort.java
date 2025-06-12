package Exe10;

public class OrdenacaoQuickSort <T extends Comparable<T>> extends OrdenacaoAbstract<T> {
    public void ordernar(){
        int n = getInfo().length - 1;
        quickSort(0,n);
    }

        private void quickSort(int inicio, int fim){
            if(inicio < fim){
                int idxPivo = particionar(inicio, fim);
                quickSort(inicio, idxPivo - 1);
                quickSort(idxPivo + 1, fim);
            }
        }

            private int particionar(int inicio, int fim) {
            T[] info = getInfo();
            T pivo = selecionarPivo(inicio, fim); 
            int a = inicio;
            int b = fim;

            while (a <= b) {
                while (info[a].compareTo(pivo) < 0) {
                    a++;
                }
                while (info[b].compareTo(pivo) > 0) {
                    b--;
                }
                if (a <= b) {
                    trocar(a, b);
                    a++;
                    b--;
                }
            }

            return a;
        }

        private T selecionarPivo(int inicio, int fim) {
            int meio = calcularIndiceMeio(inicio, fim);
            ordenarTresElementos(inicio, meio, fim); // Garante que info[meio] é a mediana
            trocar(meio, inicio); // Move a mediana para o início
            return getInfo()[inicio];
        }

        private int calcularIndiceMeio(int inicio, int fim) {
            return (inicio + fim) / 2;
        }

        private void ordenarTresElementos(int i, int j, int k) {
            T[] info = getInfo();

            if (info[i].compareTo(info[j]) > 0) {
                trocar(i, j);
            }
            if (info[i].compareTo(info[k]) > 0) {
                trocar(i, k);
            }
            if (info[j].compareTo(info[k]) > 0) {
                trocar(j, k);
            }
        }

}

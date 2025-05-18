package Exe10;

public class OrdenacaoBolhaOtimizado <T extends Comparable<T>> extends OrdenacaoAbstract<T> {
   public void ordenar(){
        T[] info = getInfo();

   }

    private void ordenarPorBolha(T[] info) {
        int n = info.length;
        boolean trocou;

        for (int i = n - 1; i > 1; i--) {
            trocou = false;

            for (int j = 0; j < i - 1; j++) {
                if (info[j].compareTo(info[j + 1]) > 0) {
                    trocar(j, j + 1);
                    trocou = true;
                }
            }

            if (!trocou) {
                return;
            }
        }
    }
}

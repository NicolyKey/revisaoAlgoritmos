package Exe11;

public class BuscaBinaria<T extends Comparable<T>> extends BuscaAbstract {
    public int buscar(T valor) {
        int inicio = 0;
        int fim = getInfo().length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            T meioValor = (T) getInfo()[meio];

            if (meioValor.compareTo(valor) > 0) {
                fim = meio - 1;
            } else if (meioValor.compareTo(valor) < 0) {
                inicio = meio + 1;
            } else {
                return meio;
            }
        }

        return -1; // valor não encontrado
    }

}

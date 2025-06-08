package Exe11;

public class BuscaBinaria<T extends Comparable<T>> extends BuscaAbstract {
    public int buscar(T valor) {
        int infoSize = getInfo().length;
        int inicio = 0;
        int fim = infoSize - 1;

        while(inicio <= fim){
            int meio = (inicio + fim)/ 2;

            if(((T)getInfo()[meio]).compareTo(valor)>0){
                fim = meio - 1;
            }
            if(((T)getInfo()[meio]).compareTo(valor)<0){
                inicio = meio + 1;
            }else{
                return meio;
            }
        }
        return -1;
    }
}

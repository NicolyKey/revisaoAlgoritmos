package Exe11;

public class BuscaLinearVetorOrdenado<T extends Comparable<T>> extends BuscaAbstract{
    public int buscar(T valor){
        for(int i = 0; i < getInfo().length-1; i++){
            if(getInfo()[i].equals(valor)){
                return i;
            }else if(valor.compareTo((T) getInfo()[i])<0){
                break;
            }
        }
        return -1;
    }

}

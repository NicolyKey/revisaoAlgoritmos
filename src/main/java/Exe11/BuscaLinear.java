package Exe11;

public class BuscaLinear<T>  extends BuscaAbstract{

    public int buscar( T valor){
        for(int i = 0; i < getInfo().length-1; i++){
            if(getInfo()[i].equals(valor)){
                return i;
            }

        }
        return -1;
    }
}

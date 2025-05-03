package Exe06;



public class ListaEncadeada<T> {
    private NoLista<T> primeiro;
    private NoLista<T> ultimo;
    private int qtdeNos;

    public void setPrimeiro(NoLista<T> primeiro) {
        this.primeiro = primeiro;
    }

    public ListaEncadeada(){
        this.primeiro = null;
    }

    public NoLista<T> getPrimeiro() {
        return primeiro;
    }

    public void inserir(T info){;
        NoLista<T> novo = new NoLista<>();
        novo.setInfo(info);
        novo.setProximo(primeiro);
        this.primeiro = novo;
        qtdeNos ++;
    }

    void inserirNoFinal(T valor){
        NoLista<T> novo = new NoLista<>();
        novo.setInfo(valor);
        novo.setProximo(null);
        if(estaVazia()){
            primeiro = novo;
        }else{
            ultimo.setProximo(novo);
        }

        ultimo = novo;
    }

    public boolean estaVazia()
    {
        return primeiro == null;
    }

    public NoLista<T> buscar(T info){
        NoLista<T> p = primeiro;

        while(p != null){
            if(p.getInfo().equals(info)){
                return p;
            }
            p = p.getProximo();
        }
        return null;
    }

    public void retirar(T info){
        NoLista<T> anterior = null;
        NoLista<T> p = primeiro;

        while(p != null && !p.getInfo().equals(info)){
            anterior = p;
            p = p.getProximo();
        }

        if(p != null){
            if(p == primeiro){
                primeiro = p.getProximo();
            } else {
                anterior.setProximo(p.getProximo());
            }
        }
    }

    public int obterComprimento(){
       NoLista<T> p = primeiro;
        int comprimento = 0;


        while(p != null){
            comprimento ++;
            p = p.getProximo();
        }

        return comprimento;
        // ou apenas return qteNos;
    }

    public NoLista<T> obterNo(int idx){
        if(idx < 0){
            throw new IndexOutOfBoundsException();
        }

        NoLista<T> p = primeiro;

        while((p != null) && (idx > 0)){
            idx --;
            p = p.getProximo();
        }

        if(p == null){
            throw new IndexOutOfBoundsException();
        }
        return p;
    }

    @Override
    public String toString() {
        StringBuilder resultado = new StringBuilder();
        NoLista<T> p = primeiro;

        while (p != null) {
            resultado.append(p.getInfo());
            if (p.getProximo() != null) {
                resultado.append(",");
            }
            p = p.getProximo();
        }

        return resultado.toString();
    }

}

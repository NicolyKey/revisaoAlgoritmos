package Exe06;

public class FilaLista<T>  implements Fila<T> {
    ListaEncadeada<T> lista = new ListaEncadeada<>();

    public FilaLista(ListaEncadeada<T> lista) {
        this.lista = lista;
    }

@Override
  public void inserir(T valor){
        lista.inserirNoFinal(valor);
  }
@Override
    public boolean estaVazia() {
        return lista.estaVazia();
    }

@Override
    public T peek() {
        return lista.getPrimeiro().getInfo();
    }

@Override
    public T retirar() {
       T valor = peek();
       lista.retirar(peek());
       return  valor;
    }
@Override
    public void liberar() {
      this.lista = new ListaEncadeada<>();
    }
}

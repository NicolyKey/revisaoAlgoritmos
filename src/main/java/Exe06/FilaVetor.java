package Exe06;

public class FilaVetor<T> {
    private Object[] info;
    private int limite;
    private int tamanho;
    private int inicio;

    FilaVetor(int limite){
        this.info = new Object[limite];
        this.limite= limite;
        this.tamanho = 0;
        this.inicio = 0;
    }

    public void inserir(T valor){
       if(tamanho == limite){
           throw new FilaCheiaException();
       }
       int posicaoInserir = (inicio + tamanho) % limite;
       info[posicaoInserir] = valor;
       tamanho ++;
    }

   boolean estaVazia(){
        return tamanho == 0;
   }

    T peek(){
        if(estaVazia()){
            throw  new FilaCheiaException();
        }
        return (T) info[inicio];
    }

    T retirar(){
        if(estaVazia()){
            throw  new FilaVaziaexception();
        }
        T valor = peek();
        info[inicio] = null;
        inicio = (inicio + 1) % limite;
        tamanho --;
        return valor;
    }

    public void liberar() {
            /*info = (T[])new Object[limite];
            tamanho = 0*/

        try{
            while(true){
                retirar();
            }
        } catch(FilaVaziaexception e){

        }
    }
//            • criarFilaConcatenada(f2: FilaVetor): FilaVetor
//    Este método deve criar uma nova fila, a partir da concatenação de duas filas previamente existentes: a fila do
//    objeto que executar o método criarFilaConcatenada(),aqui denominada de f1, e a fila recebida como
//    argumento, denominada de f2. Observe a ilustração abaixo, que apresenta duas filas originais e seus elementos
//    corretamente inseridos numa nova fila resultante (f3).

    FilaVetor<T> criarFilaConcatenada(FilaVetor<T> f2) {
        FilaVetor<T> f3 = new FilaVetor<T>(this.limite + f2.getLimite());

        int indicador = this.inicio;
        for (int i = 0; i < this.tamanho; i++) {
            f3.inserir((T) info[indicador]);
            indicador = (indicador + 1) % this.limite;
        }

        indicador = f2.getInicio();
        for (int i = 0; i < f2.getTamanho(); i++) {
            f3.inserir((T) f2.info[indicador]);
            indicador = (indicador + 1) % f2.getLimite();
        }

        return f3;
    }

    public void encolher() {
        T[] novoInfo = (T[]) new Object[tamanho];
        int indicador = inicio;

        for (int i = 0; i < tamanho; i++) {
            novoInfo[i] = (T) info[indicador];
            indicador = (indicador + 1) % limite;
        }

        info = novoInfo;
        inicio = 0;
        limite = tamanho;
    }



    public String toString(){
        String resultado = "";

        int posicao = inicio;
        for (int i = 0; i < tamanho; i++) {
            if(i > 0){
                resultado += ",";
            }
            resultado = resultado + info[posicao];
            posicao = (posicao +1) % limite;
        }

        return resultado;
    }

    public int getLimite() {
        return limite;
    }

    public Object[] getInfo() {
        return info;
    }

    public void setInfo(Object[] info) {
        this.info = info;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }
}

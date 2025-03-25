/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe04;

/**
 *
 * @author nicol
 * @param <T>
 */
public class ListaDupla<T> {
    private NoListaDupla primeiro;
   
//a) ListaDupla():construtor da classe. Deve estabelecer que a lista está vazia;
    public ListaDupla(){
      this.primeiro = null;
    }
    
//b) getPrimeiro(): método getter da variável primeiro;
     public NoListaDupla getPrimeiro() {
        return primeiro;
    }
//a) inserir(T): Deve armazenar o dado fornecido como argumento na estrutura de dados;
     public void inserir(T valor){
       NoListaDupla<T> novoNo = new NoListaDupla<>();
       
       novoNo.setInfo(valor);
       novoNo.setProximo(primeiro);
       novoNo.setAnterior(null);
       if(primeiro != null){
         primeiro.setAnterior(novoNo);
       }
       
       primeiro = novoNo;
     }
//b) buscar(T): Deve procurar na lista encadeada se há um nó cujo conteúdo seja igual à variável valor (utilizar
//igualdade de valores). Caso seja localizado, deverá retornar este nó (objeto da classe NoListaDupla). Se não for
//localizado, deverá retornar null;
     public NoListaDupla<T> buscar(T valor){
       NoListaDupla<T> p = primeiro;
       
       while(p != null){
           if(p.getInfo() != valor){
             return p;
           }
           p = p.getProximo();
       }
       
       return null;
     }
     
//c) retirar(T): Deve retirar um nó da lista que contenha o valor informado como parâmetro para este método;
     public void retirar(T valor){
         NoListaDupla<T> p = buscar(valor);
         
         if(p != null){
           if(primeiro.getInfo().equals(p)){
             primeiro.setInfo(p.getProximo());
           }else{
              p.getAnterior().setProximo(p.getProximo());
           }
           
           if(p.getProximo() != null){
             p.getProximo().setAnterior(p.getAnterior());
           }
         }
         
     }
     
//d) exibirOrdemInversa(): deve exibir o conteúdo armazenado nos nós da lista encadeada de forma que primeiro
//seja exibido o valor do último nó da lista e por último seja exibido o valor do primeiro nó da lista.
     
     public void exibirOrdemInversa(){
       NoListaDupla<T> p = primeiro;
       
       while(p.getProximo() != null){
         p = p.getProximo();
       }
        
       while(p != null){
           System.out.println(p.getInfo() +",");
           p = p.getAnterior();
       }
     }
//e) liberar(): Deverá limpar a estrutura de dados. Ao invés de simplesmente atribuir null para a variável de
//instância primeiro, remova todos os encadeamentos dos nós, isto é, atribua null para a associação proximo e
//anterior em todos os nós da lista;
     public void liberar(){
        primeiro = null;
     }
//f) toString(): deve retornar os valores armazenados na lista, desde o primeiro nó até o último, separando-os por
//vírgula.
     public String toString(){
         if (primeiro == null) {
        return "Lista vazia";
    }

    String resultado = "";
    NoListaDupla<T> atual = primeiro;

    while (atual != null) {
        resultado += atual.getInfo();
        if (atual.getProximo() != null) {
            resultado += ", ";
        }
        atual = atual.getProximo();
    }

    return resultado;
     }
     
//     g) concatenando uma lista duplamente encadeada
//         MÉTODO concatenar(ListaDuplamenteEncadeada outraLista)
//        SE (cabeça for nulo) ENTAO
//            cabeça = outraLista.cabeça
//            cauda = outraLista.cauda
//        SENÃO SE (outraLista.cabeça for nulo) ENTAO
//            RETORNAR (nada a fazer)
//        SENÃO
//            cauda.próximo = outraLista.cabeça
//            outraLista.cabeça.anterior = cauda
//            cauda = outraLista.cauda
//        FIM SE

   
}

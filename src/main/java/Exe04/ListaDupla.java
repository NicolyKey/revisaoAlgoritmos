/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe04;

/**
 *
 * @author nicol
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
       NoListaDupla<T> novoNo = new NoListaDupla<T>();
       novoNo.setInfo(valor);
       novoNo.setProximo(primeiro);
       primeiro.setAnterior(novoNo);
       
       primeiro = novoNo;
     }
//b) buscar(T): Deve procurar na lista encadeada se há um nó cujo conteúdo seja igual à variável valor (utilizar
//igualdade de valores). Caso seja localizado, deverá retornar este nó (objeto da classe NoListaDupla). Se não for
//localizado, deverá retornar null;
     
     
//c) retirar(T): Deve retirar um nó da lista que contenha o valor informado como parâmetro para este método;
//d) exibirOrdemInversa(): deve exibir o conteúdo armazenado nos nós da lista encadeada de forma que primeiro
//seja exibido o valor do último nó da lista e por último seja exibido o valor do primeiro nó da lista.
//e) liberar(): Deverá limpar a estrutura de dados. Ao invés de simplesmente atribuir null para a variável de
//instância primeiro, remova todos os encadeamentos dos nós, isto é, atribua null para a associação proximo e
//anterior em todos os nós da lista;
//f) toString(): deve retornar os valores armazenados na lista, desde o primeiro nó até o último, separando-os por
//vírgula.

   
}

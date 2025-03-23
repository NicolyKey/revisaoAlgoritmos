/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe03;

/**
 *
 * @author nicol
 */
public class ListaEncadeada<T> {
    private NoLista<T> primeiro;
    // private int qtdeNos;
    
    //    a) ListaEncadeada(): construtor da classe. Deve definir que a lista está vazia.
    public ListaEncadeada(){
       this.primeiro = null;
    }

    //b) getPrimeiro(): método getter da variável primeiro.
    public NoLista<T> getPrimeiro() {
        return primeiro;
    }

    

//c) inserir(T): Deve inserir um novo nó no início da lista. Este novo nó deve armazenar o valor recebido
//na variável paramétrica info.
  
    public void inserir(T info){;
       NoLista<T> novo = new NoLista();
       novo.setInfo(info);
       novo.setProximo(primeiro);
       this.primeiro = novo;
       //qteNos ++;
    }
    
//d) estaVazia(): Deve retornar true se a lista estiver vazia ou false se tiver algum nó encadeado.
    public boolean estaVazia(){
        return primeiro == null;
    }
//e) buscar(T): Deve procurar na lista encadeada se há um nó cujo conteúdo seja igual à variável info. Caso
//seja localizado, deverá retornar este nó (objeto da classe NoLista). Se não for localizado, deverá
//retornar null.
    public T buscar(T info){
       NoLista<T> p = new NoLista<T>();
       
       while(p != null){
         if(p.getInfo().equals(info)){
            return (T) p;
         }
         p.getProximo();
       }
      return null;
    }
//f) retirar(T): Deve remover o primeiro nó que for encontrado que contiver o dado fornecido como
//argumento.

    public void retirar(T info){
      NoLista<T> anterior = new NoLista<T>();
      NoLista<T> p = new NoLista<T>();
      
      while(p != null && (p.getInfo() != info)){
          anterior = p;
          p.getProximo();
      }
      
      if(p != null){
        if(p == primeiro){
          this.primeiro = p;
        }
        anterior.setProximo(p.getProximo());
        //qteNos --;
      }
    }
//g) obterComprimento(): Deverá retornar a quantidade de nós encadeados na lista. Implemente este
//método sem criar nova variável de instância (atributos) na classe ListaEncadeada.
    public int obterComprimento(){
        NoLista<T> p = new NoLista<T>();
        int comprimento = 0;
        p = primeiro;
      
      while(p != null){
        comprimento ++;
        p.getProximo();
      }
      
      return comprimento;
      // ou apenas return qteNos;
    }
//h) obterNo(int): o método deverá retornar o nó que está na posição fornecida como argumento.
//Considere que o primeiro nó tem posição igual à 0 e que o último nó (aquele que está na extremidade
//oposta ao primeiro), está na posição Comprimento-1. Caso o argumento fornecido ao método
//obterNo() seja negativo ou maior que o comprimento da lista, deverá ser lançada a exceção
//java.lang.IndexOutOfBoundsException. O algoritmo não pode percorrer a lista mais de uma vez.
                               
    public NoLista<T> obterNo(int idx){
        int comprimento = obterComprimento();
        
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
    
//i) toString(): este método deve retornar o conteúdo armazenado na lista, separando os dados por
//vírgula.
//     public String toString() {
//        if (primeiro == null) return ""; // Se a lista estiver vazia, retorna string vazia
//
//        String resultado = "";
//        NoLista<T> current = primeiro;
//        int i = 0;
//
//        while (current != null) {
//            resultado += current.getInfo();
//            if (i < tamanho - 1) {
//                resultado += ", ";
//            }
//            current = current.next;
//            i++;
//        }
//
//        return resultado;
//    }
     // Método para adicionar um nó ao final da lista
//    public void append(int value) {
//        Node newNode = new Node(value);
//        if (head == null) {
//            head = newNode;
//            return;
//        }
//        Node current = head;
//        while (current.next != null) {
//            current = current.next;
//        }
//        current.next = newNode;
//    }

    // Método para inverter a lista encadeada
//    public void reverse() {
//        Node prev = null;
//        Node current = head;  head é o primeiro
//        Node next = null;
//
//        while (current != null) {
//            next = current.next; // Guarda referência do próximo nó
//            current.next = prev; // Inverte o ponteiro do nó atual
//            prev = current; // Move prev para frente
//            current = next; // Avança o nó atual
//        }
//        
//        head = prev; // Atualiza a cabeça da lista
//    }
    
    
}

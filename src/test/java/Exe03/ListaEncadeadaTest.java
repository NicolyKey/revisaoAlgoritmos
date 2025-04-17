package Exe03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListaEncadeadaTest {
    @Test
    void obterNo(){
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.inserir(10);
        lista.inserir(20);
        lista.inserir(22);
        NoLista<Integer> no = lista.obterNo(2);
        assertEquals(10, no.getInfo() );
    }

    @Test
    void retirar(){
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.inserir(10);
        lista.inserir(20);
        lista.inserir(22);
        lista.inserir(15);
        lista.retirar(10);
        NoLista<Integer> no = lista.obterNo(2);

        assertEquals(20, no.getInfo());
    }

    @Test
    void obtercomprimento(){
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.inserir(10);
        lista.inserir(20);
        lista.inserir(22);
        lista.inserir(15);
        lista.retirar(10);

        assertEquals(3, lista.obterComprimento());
    }
}
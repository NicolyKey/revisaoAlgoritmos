package Exe06;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilaVetorTest {

    @Test
    void inserir() {
        FilaVetor<Integer> f1 = new FilaVetor<>(10);
        f1.inserir(1);
        f1.inserir(2);
        f1.inserir(3);

        assertEquals("1,2,3", f1.toString());
    }

    @Test
    void estaVazia() {
        FilaVetor<Integer>  f1 = new FilaVetor<>(10);

        assertTrue(f1.estaVazia());
    }

    @Test
    void peek() {
        FilaVetor<Integer> f1 = new FilaVetor<>(10);
        f1.inserir(1);
        f1.inserir(2);
        f1.inserir(3);

        assertEquals(1, f1.peek());
    }

    @Test
    void retirar() {
        FilaVetor<Integer> f1 = new FilaVetor<>(10);
        f1.inserir(1);
        f1.inserir(2);
        f1.inserir(3);
        f1.retirar();

        assertEquals("2,3", f1.toString());
    }

    @Test
    void liberar() {
        FilaVetor<Integer> f1 = new FilaVetor<>(10);
        f1.inserir(1);
        f1.inserir(2);
        f1.inserir(3);
        f1.liberar();

        assertTrue(f1.estaVazia());
    }

    @Test
    void criarFilaConcatenada() {
        FilaVetor<Integer> f1 = new FilaVetor<>(10);
        f1.inserir(1);
        f1.inserir(2);
        f1.inserir(3);

        FilaVetor<Integer> f2 = new FilaVetor<>(10);
        f2.inserir(4);
        f2.inserir(5);
        f2.inserir(6);

        FilaVetor<Integer> f3 = f1.criarFilaConcatenada(f2);
        assertEquals("1,2,3,4,5,6", f3.toString());
    }

    @Test
    void encurtar() {
        FilaVetor<Integer> f1 = new FilaVetor<>(10);
        f1.inserir(1);
        f1.inserir(2);
        f1.inserir(3);
        f1.inserir(4);
        f1.inserir(5);
        f1.inserir(6);
        f1.inserir(7);
        f1.inserir(8);
        f1.inserir(9);
        f1.inserir(10);

        f1.retirar();
        f1.retirar();
        f1.retirar();

        f1.encolher();

        assertEquals(7, f1.getInfo().length);
    }
}
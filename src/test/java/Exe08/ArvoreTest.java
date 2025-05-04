package Exe08;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArvoreTest {

    @Test
    void testToString() {
        NoArvore<Integer> no8 = new NoArvore<>(1);
        NoArvore<Integer> no7 = new NoArvore<>(7);
        NoArvore<Integer> no6 = new NoArvore<>(3);
        NoArvore<Integer> no5 = new NoArvore<>(4);
        NoArvore<Integer> no4 = new NoArvore<>(6);
        NoArvore<Integer> no3 = new NoArvore<>(5);
        NoArvore<Integer> no2 = new NoArvore<>(9);
        NoArvore<Integer> no1 = new NoArvore<>(8);

        no1.inserirFilho(no7);
        no1.inserirFilho(no3);
        no1.inserirFilho(no4);

        no7.inserirFilho(no6);

        no3.inserirFilho(no5);

        no6.inserirFilho(no2);
        no6.inserirFilho(no8);

        Arvore<Integer> arvore = new Arvore<>();

        arvore.setRaiz(no1);

        assertEquals("<8<6><5<4>><7<3<1><9>>>>", arvore.toString());

    }

    @Test
    void pertence() {
        NoArvore<Integer> no8 = new NoArvore<>(1);
        NoArvore<Integer> no7 = new NoArvore<>(7);
        NoArvore<Integer> no6 = new NoArvore<>(3);
        NoArvore<Integer> no5 = new NoArvore<>(4);
        NoArvore<Integer> no4 = new NoArvore<>(6);
        NoArvore<Integer> no3 = new NoArvore<>(5);
        NoArvore<Integer> no2 = new NoArvore<>(9);
        NoArvore<Integer> no1 = new NoArvore<>(8);

        no1.inserirFilho(no7);
        no1.inserirFilho(no3);
        no1.inserirFilho(no4);

        no7.inserirFilho(no6);

        no3.inserirFilho(no5);

        no6.inserirFilho(no2);
        no6.inserirFilho(no8);

        Arvore<Integer> arvore = new Arvore<>();

        arvore.setRaiz(no1);

        assertTrue(arvore.pertence(1));
    }

    @Test
    void contarNos() {
        NoArvore<Integer> no8 = new NoArvore<>(1);
        NoArvore<Integer> no7 = new NoArvore<>(7);
        NoArvore<Integer> no6 = new NoArvore<>(3);
        NoArvore<Integer> no5 = new NoArvore<>(4);
        NoArvore<Integer> no4 = new NoArvore<>(6);
        NoArvore<Integer> no3 = new NoArvore<>(5);
        NoArvore<Integer> no2 = new NoArvore<>(9);
        NoArvore<Integer> no1 = new NoArvore<>(8);

        no1.inserirFilho(no7);
        no1.inserirFilho(no3);
        no1.inserirFilho(no4);

        no7.inserirFilho(no6);

        no3.inserirFilho(no5);

        no6.inserirFilho(no2);
        no6.inserirFilho(no8);

        Arvore<Integer> arvore = new Arvore<>();

        arvore.setRaiz(no1);

        assertEquals(8, arvore.contarNos());
    }
}
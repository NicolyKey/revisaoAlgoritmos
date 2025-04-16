package Exe07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArvoreBinariaTest {

    @Test
    void pertence() {
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<>(4);
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<>(5);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<>(2, no4, no5);
        NoArvoreBinaria<Integer> no7 = new NoArvoreBinaria<>(7);
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<>(6, no7, null);
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<>(3, null, no6);

        NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<>(1, no2, no3);

        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();

        arvore.setRaiz(no1);

        assertTrue(arvore.pertence(6));
    }

    @Test
    void pertenceFalse() {
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<>(4);
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<>(5);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<>(2, no4, no5);
        NoArvoreBinaria<Integer> no7 = new NoArvoreBinaria<>(7);
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<>(6, no7, null);
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<>(3, null, no6);

        NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<>(1, no2, no3);

        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();

        arvore.setRaiz(no1);

        assertFalse(arvore.pertence(88));
    }

    @Test
    void testToString() {
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<>(4);
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<>(5);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<>(2, no4, no5);
        NoArvoreBinaria<Integer> no7 = new NoArvoreBinaria<>(7);
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<>(6, no7, null);
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<>(3, null, no6);

        NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<>(1, no2, no3);

        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();

        arvore.setRaiz(no1);

        assertEquals("<1<2<4<><>><5<><>>><3<><6<7<><>><>>>>", arvore.toString());
    }

    @Test
    void testContar() {
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<>(2);
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<>(3);
        NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<>(4, no2, no3);
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();

        arvore.setRaiz(no1);

        assertEquals(3, arvore.contar());
    }
}
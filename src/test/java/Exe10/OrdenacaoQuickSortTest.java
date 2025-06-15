package Exe10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrdenacaoQuickSortTest {

    @Test
    void ordenar() {
        Integer[] entrada = { 10, 15, 4, 6, 2, 0, 11 };
        Integer[] esperado = { 0, 2, 4, 6, 10, 11, 15 };

        OrdenacaoQuickSort<Integer> quickSort = new OrdenacaoQuickSort<>();
        quickSort.setInfo(entrada);
        quickSort.ordernar();

        assertArrayEquals(esperado, quickSort.getInfo());
    }

}
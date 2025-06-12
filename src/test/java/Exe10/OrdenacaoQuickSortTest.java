package Exe10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrdenacaoQuickSortTest {

    @Test
    void ordenar() {
        Integer[] entrada = { 10, 20, 4, 35, 12, 42, 2};

        Integer[] esperado = { 2, 4, 10, 12, 20, 35, 42 };

        OrdenacaoQuickSort<Integer> quickSort = new OrdenacaoQuickSort<>();
        quickSort.setInfo(entrada);
        quickSort.ordernar();

        assertArrayEquals(esperado, quickSort.getInfo());
    }

}
package Exe10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class OrdenacaoMergeSortTest {
   @Test
    void ordenar() {
        Integer[] entrada = { 10, 15, 4, 6, 2, 0, 11 };
        Integer[] esperado = { 0, 2, 4, 6, 10, 11, 15 };

       OrdenacaoMergeSort<Integer> mergeSort = new OrdenacaoMergeSort<>();
        mergeSort.setInfo(entrada);
        mergeSort.ordenar();

       assertArrayEquals(esperado, mergeSort.getInfo());
    }

}
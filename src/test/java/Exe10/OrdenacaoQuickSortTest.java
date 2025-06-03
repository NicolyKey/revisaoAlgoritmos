package Exe10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrdenacaoQuickSortTest {

    @Test
    void ordenar() {
        String[] entrada = { "Lucas", "Ana", "Pedro", "Beatriz", "João", "Carlos" };

        String[] esperado = { "Ana", "Beatriz", "Carlos", "João", "Lucas", "Pedro" };

        OrdenacaoQuickSort<String> quickSort = new OrdenacaoQuickSort<>();
        quickSort.setInfo(entrada);
        quickSort.ordernar();

        assertArrayEquals(esperado, quickSort.getInfo());
    }

}
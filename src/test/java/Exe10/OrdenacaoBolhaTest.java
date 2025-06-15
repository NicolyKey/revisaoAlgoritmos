package Exe10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrdenacaoBolhaTest {

    @Test
    void ordenar(){
        Integer[] entrada = { 10, 15, 4, 6, 2, 0, 11 };
        Integer[] esperado = { 0, 2, 4, 6, 10, 11, 15 };

        OrdenacaoBolha<Integer> bolha = new OrdenacaoBolha<>();
        bolha.setInfo(entrada);
        bolha.ordenar();

        assertArrayEquals(esperado, bolha.getInfo());
    }

}
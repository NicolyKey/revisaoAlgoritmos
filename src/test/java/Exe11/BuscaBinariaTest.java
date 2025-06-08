package Exe11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuscaBinariaTest {
    @Test
    public void buscar() {
        Integer[] vetor = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        BuscaBinaria<Integer> buscaBinaria = new BuscaBinaria<>();
        buscaBinaria.setInfo(vetor);
        buscaBinaria.buscar(80);

        assertEquals(8, buscaBinaria.buscar(80));
    }

}
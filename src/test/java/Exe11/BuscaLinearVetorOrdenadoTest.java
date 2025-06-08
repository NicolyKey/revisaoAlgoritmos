package Exe11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuscaLinearVetorOrdenadoTest {

    @Test
    void buscar() {
        Integer[] vetor = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        BuscaLinearVetorOrdenado<Integer> buscaLinearVetorOrdenado = new BuscaLinearVetorOrdenado<>();
        buscaLinearVetorOrdenado.setInfo(vetor);
        buscaLinearVetorOrdenado.buscar(20);

        assertEquals(2, buscaLinearVetorOrdenado.buscar(20));
    }
}
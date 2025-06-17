package Exe11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuscaBinariaTest {
    @Test
    public void buscar() {
        String[] vetor = {"Ana", "Daniel", "Eduardo", "Fabricio", "Gustavo", "Henrique", "Ivanir", "Joao", "Ktelen", "Ktellyn", "Maria", "Marlene"  };
        BuscaBinaria<String> buscaBinaria = new BuscaBinaria<>();
        buscaBinaria.setInfo(vetor);
        buscaBinaria.buscar("Ktelen");

        assertEquals(8, buscaBinaria.buscar("Ktelen"));
    }

}
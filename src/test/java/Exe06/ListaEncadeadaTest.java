package Exe06;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListaEncadeadaTest {

    @Test
    void inerirNoFinal(){
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        lista.inserirNoFinal(1);
        lista.inserirNoFinal(2);
        lista.inserirNoFinal(3);

        assertEquals("1,2,3", lista.toString());
    }

}
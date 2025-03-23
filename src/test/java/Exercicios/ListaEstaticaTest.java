/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Exercicios;

import Exe01.ListaEstatica;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author nicol
 */
public class ListaEstaticaTest {
    

    /**
     * Test of inserir method, of class ListaEstatica.
     */
    @org.junit.jupiter.api.Test
    public void testInserir() {
        ListaEstatica lista = new ListaEstatica();
        
        lista.inserir(1);
        lista.inserir(2);
        lista.inserir(4);
        
        assertEquals(3, lista.getTamanho());
    }

    /**
     * Test of exibir method, of class ListaEstatica.
     */
    @org.junit.jupiter.api.Test
    public void testExibir() {
         ListaEstatica lista = new ListaEstatica();
        
        lista.inserir(1);
        lista.inserir(2);
        lista.inserir(3);
        
        // Chama o método exibir
        lista.exibir();
        
        // Verifica se a saída é a esperada (valores impressos)
        String expectedOutput = "1\n2\n3\n";
        assertEquals(expectedOutput, lista.toString());
    }

    /**
     * Test of buscar method, of class ListaEstatica.
     */
    @org.junit.jupiter.api.Test
    public void testBuscar() {
        ListaEstatica lista = new ListaEstatica();
        
        lista.inserir(1);
        lista.inserir(2);
        lista.inserir(3);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(0, lista.buscar(1));
    }

    /**
     * Test of retirar method, of class ListaEstatica.
     */
    @org.junit.jupiter.api.Test
    public void testRetirar() {
        ListaEstatica lista = new ListaEstatica();
        
        lista.inserir(1);
        lista.inserir(2);
        lista.inserir(3);
        lista.retirar(3);

        assertEquals("1, 2", lista.toString());
    }


    /**
     * Test of obterElemento method, of class ListaEstatica.
     */
    @org.junit.jupiter.api.Test
    public void testObterElemento() {
    ListaEstatica lista = new ListaEstatica();
        
        lista.inserir(1);
        lista.inserir(2);
        lista.inserir(3);
        lista.inserir(5);
       

        assertEquals(3, lista.obterElemento(2));
    }
}

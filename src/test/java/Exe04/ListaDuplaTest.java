/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Exe04;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Premiersoft
 */
public class ListaDuplaTest {
    

    /**
     * Test of inserir method, of class ListaDupla.
     */
    @org.junit.jupiter.api.Test
    public void testInserir() {
        ListaDupla<Integer> listaDupla = new ListaDupla<>();
        
        listaDupla.inserir(12);
        listaDupla.inserir(14);
        listaDupla.inserir(10);
        
        assertEquals("10, 14, 12" , listaDupla.toString());
        
    }

    /**
     * Test of buscar method, of class ListaDupla.
     */
    @org.junit.jupiter.api.Test
    public void testBuscar() {
        System.out.println("buscar");
        Object valor = null;
        ListaDupla instance = new ListaDupla();
        NoListaDupla expResult = null;
        NoListaDupla result = instance.buscar(valor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retirar method, of class ListaDupla.
     */
    @org.junit.jupiter.api.Test
    public void testRetirar() {
        System.out.println("retirar");
        Object valor = null;
        ListaDupla instance = new ListaDupla();
        instance.retirar(valor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of exibirOrdemInversa method, of class ListaDupla.
     */
    @org.junit.jupiter.api.Test
    public void testExibirOrdemInversa() {
        System.out.println("exibirOrdemInversa");
        ListaDupla instance = new ListaDupla();
        instance.exibirOrdemInversa();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of liberar method, of class ListaDupla.
     */
    @org.junit.jupiter.api.Test
    public void testLiberar() {
        System.out.println("liberar");
        ListaDupla instance = new ListaDupla();
        instance.liberar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ListaDupla.
     */
    @org.junit.jupiter.api.Test
    public void testToString() {
        System.out.println("toString");
        ListaDupla instance = new ListaDupla();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

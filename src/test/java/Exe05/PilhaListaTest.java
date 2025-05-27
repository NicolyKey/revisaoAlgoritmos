package Exe05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class PilhaListaTest {
  @Test
    void duplicar(){
      PilhaLista<Integer> pilha = new PilhaLista<>();
      pilha.push(30);
      pilha.push(20);
      pilha.push(10);

      pilha.duplicarEntrada();

      assertEquals("10,10,20,20,30,30", pilha.toString());
  }
}
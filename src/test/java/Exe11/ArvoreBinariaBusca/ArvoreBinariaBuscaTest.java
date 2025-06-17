package Exe11.ArvoreBinariaBusca;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArvoreBinariaBuscaTest {

    @Test
    public void buscar(){
        ArvoreBinariaBusca<Integer> arvore = new ArvoreBinariaBusca<>();
        arvore.inserir(69);
        arvore.inserir(70);
        arvore.inserir(72);
        arvore.inserir(80);
        arvore.inserir(69);
        arvore.inserir(17);
        arvore.inserir(58);

        assertEquals(17, arvore.buscar(17).getInfo());
    }

    @Test
    public void removeNoComFilhos(){
        ArvoreBinariaBusca<Integer> arvore = new ArvoreBinariaBusca<>();
        arvore.inserir(80);
        arvore.inserir(52);
        arvore.inserir(48);
        arvore.inserir(71);
        arvore.inserir(63);
        arvore.inserir(67);
        arvore.inserir(90);
        arvore.inserir(79);
        arvore.inserir(72);
        arvore.retirar(71);

        String esperado = "<80<52<48<><>><72<63<><67<><>>><79<><>>>><90<><>>>";

        assertEquals(esperado, arvore.toString());

    }

}
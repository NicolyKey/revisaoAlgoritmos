package Exe09;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class MapaDispersaoTest {

    @Test
    void inserir() {
        LocalDate dataNascimento = LocalDate.of(2025, 2, 13);
        Aluno aluno = new Aluno(1200,"Jean", dataNascimento);
        Aluno aluno2 = new Aluno(1201,"Carlos", dataNascimento);

        MapaDispersao<Aluno> mapa = new MapaDispersao<>(53);
        int chave = aluno.hashCode();
        mapa.inserir(chave, aluno);
        int chave2 = aluno2.hashCode();
        mapa.inserir(chave2, aluno2);

        assertEquals(mapa.buscar(chave2), aluno2);
    }

    @Test
    void testeInsercaoEBuscaComColisoes() {
        MapaDispersao<Aluno> mapa = new MapaDispersao<>(53);

        Aluno a1 = new Aluno(12000, "Jean", LocalDate.of(2000, 1, 1));
        Aluno a2 = new Aluno(14000, "Pedro", LocalDate.of(1999, 1, 20));
        Aluno a3 = new Aluno(14226, "Marta", LocalDate.of(2001, 2, 18)); // colide com 12000
        Aluno a4 = new Aluno(17180, "Lucas", LocalDate.of(1998, 11, 25)); // colide com 14000

        mapa.inserir(a1.getMatricula(), a1);
        mapa.inserir(a2.getMatricula(), a2);
        mapa.inserir(a3.getMatricula(), a3);
        mapa.inserir(a4.getMatricula(), a4);

        assertEquals(a1, mapa.buscar(12000));
        assertEquals(a2, mapa.buscar(14000));
        assertEquals(a3, mapa.buscar(14226));
        assertEquals(a4, mapa.buscar(17180));
    }

    @Test
    void remover() {
        MapaDispersao<Aluno> mapa = new MapaDispersao<>(53);

        Aluno a1 = new Aluno(12000, "Jean", LocalDate.of(2000, 1, 1));
        Aluno a2 = new Aluno(14000, "Pedro", LocalDate.of(1999, 1, 20));
        Aluno a3 = new Aluno(14226, "Marta", LocalDate.of(2001, 2, 18)); // colide com 12000
        Aluno a4 = new Aluno(17180, "Lucas", LocalDate.of(1998, 11, 25)); // colide com 14000

        mapa.inserir(a1.getMatricula(), a1);
        mapa.inserir(a2.getMatricula(), a2);
        mapa.inserir(a3.getMatricula(), a3);
        mapa.inserir(a4.getMatricula(), a4);
        mapa.remover(a1.getMatricula());

        assertEquals(null, mapa.buscar(12000));
    }

    @Test
    void includeAll() {
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe09;

import java.time.LocalDate;

/**
 *
 * @author nklaraujo
 */
public class Aluno {
    private int matricula;
    private String nome;

    public Aluno(int matricula, String nome, LocalDate dataNascimento) {
        this.matricula = matricula;
        this.nome = nome;
    }
   

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}

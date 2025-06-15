package Exe09;


import java.util.Objects;

public class Funcionario {
    private String nome;
    private String dataNascimento;
    private int matricula;

    public Funcionario(String nome, String dataNascimento, int matricula) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public int getMatricula() {
        return matricula;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Funcionario that = (Funcionario) o;
        return matricula == that.matricula && Objects.equals(nome, that.nome) && Objects.equals(dataNascimento, that.dataNascimento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, dataNascimento, matricula);
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}


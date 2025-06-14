package Exe09;


public class Funcionario {
    private String nome;
    private String dataNascimento;
    private String matricula;

    public Funcionario(String nome, String dataNascimento, String matricula) {
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

    public String getMatricula() {
        return matricula;
    }

    @Override
    public int hashCode() {
        if (matricula != null) {
            return matricula.hashCode();
        } else if (nome != null) {
            return nome.hashCode();
        } else if (dataNascimento != null) {
            return dataNascimento.hashCode();
        }
        return 0; // caso todos sejam nulos
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Funcionario)) {
            return false;
        }
        Funcionario outro = (Funcionario) obj;

        // Comparação com base no primeiro campo não nulo (na mesma ordem do hashCode)
        if (this.matricula != null) {
            return this.matricula.equals(outro.matricula);
        } else if (this.nome != null) {
            return this.nome.equals(outro.nome);
        } else if (this.dataNascimento != null) {
            return this.dataNascimento.equals(outro.dataNascimento);
        }
        return false;
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


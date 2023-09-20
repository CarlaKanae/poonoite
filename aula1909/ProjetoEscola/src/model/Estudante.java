package model;

public class Estudante {
    private String nome;
    private int idade;
    private int numeroIdentificacao;

    public Estudante(String nome, int idade, int numeroIdentificacao){
        this.nome = nome;
        this.idade = idade;
        this.numeroIdentificacao = numeroIdentificacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNumeroIdentificacao() {
        return numeroIdentificacao;
    }

    public void setNumeroIdentificacao(int numeroIdentificacao) {
        this.numeroIdentificacao = numeroIdentificacao;
    }

}

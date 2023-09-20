package model;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nomeCurso;
    private List<Estudante> estudanteList;

    public Curso(String nomeCurso){
        this.nomeCurso = nomeCurso;
        estudanteList = new ArrayList<>();
    }

    public void adicionarEstudante(Estudante estudante){
        estudanteList.add(estudante);
    }

    public void removerEstudante(int numeroIdentificacao){
        for(Estudante e : estudanteList){
            if(e.getNumeroIdentificacao()==numeroIdentificacao){
                estudanteList.remove(e);
                System.out.println("Aluno removido do curso " + nomeCurso);
                return;
            }
        }
        System.out.println("Estudante nao encontrado");
    }

    public void listarEstudante(){
        System.out.println("Dados dos estudantes do curso: " + nomeCurso);
        for(Estudante e : estudanteList){
            System.out.println("Num. Id: " + e.getNumeroIdentificacao());
            System.out.println("Nome: " + e.getNome());
            System.out.println("Idade: " + e.getIdade());
            System.out.println("---------------------------");
        }
        System.out.println("Fim da lista");
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public List<Estudante> getEstudanteList() {
        return estudanteList;
    }

    public void setEstudanteList(List<Estudante> estudanteList) {
        this.estudanteList = estudanteList;
    }
}

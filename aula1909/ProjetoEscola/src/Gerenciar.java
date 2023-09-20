import model.Curso;
import model.Estudante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Gerenciar {

    public List<Curso>cursoList = new ArrayList<>();

    public static void main(String[] args) {
        Gerenciar gerenciar = new Gerenciar();
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        do{
            //Menu para cadastrar estudantes e curso
            System.out.println("1. Cadastrar curso");
            System.out.println("2. Cadastrar aluno em curso");
            System.out.println("3. Remover aluno de curso");
            System.out.println("4. Listar alunos do curso");
            System.out.println("9. Sair");
            System.out.println("Sua escolha: ");
            opcao = Integer.parseInt(sc.nextLine());
            switch (opcao){
                case 1:
                    gerenciar.execCadastrarCurso();
                    break;
                case 2:
                    gerenciar.execCadastrarAluno();
                    break;
                case 3:
                    gerenciar.execRemoverAluno();
                    break;
                case 4:
                    gerenciar.execConsultarLista();
                    break;
                case 9:
                    System.out.println("Fim");
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        }while(opcao!=9);
    }

    private void execConsultarLista() {
        System.out.println("Exibindo a lista de curso com os respectivos alunos");
        for(Curso curso : cursoList){
            System.out.println("Nome do curso: " + curso.getNomeCurso());
            System.out.println("Aluno deste curso: ");
            curso.listarEstudante();
            System.out.println("=.=.=.=.=.=.=.=.=.=.=.=.=.=.==.=.=.=.=.=");
        }
    }

    private void execRemoverAluno() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero de identificacao do aluno a excluir: ");
        int numeroIdentificacao = Integer.parseInt(sc.nextLine());
        System.out.println("Digite o nome do curso do qual ele faz parte: ");
        String nomeCurso = sc.nextLine();
        for (Curso curso : cursoList){
            if(curso.getNomeCurso().equalsIgnoreCase(nomeCurso)){
                System.out.println("Curso encontrado... procurando aluno para excluir");
                curso.removerEstudante(numeroIdentificacao);
            }
        }
    }

    private void execCadastrarAluno() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        String nome = sc.nextLine();
        System.out.println("Digite a idade do aluno:  ");
        int idade = Integer.parseInt(sc.nextLine());
        System.out.println("Digite o num. de identificacao:  ");
        int numeroIdentificacao = Integer.parseInt(sc.nextLine());
        Estudante estudante = new Estudante(nome, idade, numeroIdentificacao);
        System.out.println("Atenção: Em qual curso deseja cadastrar ?");
        String nomeCurso = sc.nextLine();
        for (Curso curso : cursoList){
            if(curso.getNomeCurso().equalsIgnoreCase(nomeCurso)){
                curso.adicionarEstudante(estudante);
                System.out.println("Estudante matriculado no curso " + curso.getNomeCurso());
                return;
            }
        }
        System.out.println("Curso nao encontrado");
    }

    private void execCadastrarCurso() {
        System.out.println("Cadastrando novo curso");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do curso: ");
        Curso curso = new Curso(sc.nextLine());
        cursoList.add(curso);
        System.out.println("Curso cadastradocom sucesso");
    }
}
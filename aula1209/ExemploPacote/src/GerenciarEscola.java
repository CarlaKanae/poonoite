import modelo.Aluno;
import negocios.AlunoBus;

public class GerenciarEscola {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(10, "Carlos", 26);
        //matricular é uma regra de negocio
        AlunoBus negocio = new AlunoBus();
        boolean ok = negocio.matricular(aluno);
        if(ok){
            System.out.println("Matriculado com sucesso");
        }else{
            System.out.println("Idade invalida para matricula");
        }
    }
}
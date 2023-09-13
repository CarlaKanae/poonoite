package negocios;

import modelo.Aluno;

public class AlunoBus {

    public boolean matricular(Aluno aluno){
        if(aluno.getIdade() >= 18){
            //logica para mandar para o dao fazer a insercao
            //no banco
            return true;
        }
        return false;
    }
}

import model.Conta;
import model.Corrente;
import model.GerenciarContas;
import model.Poupanca;

public class Main {
    public static void main(String[] args) {
        GerenciarContas gc = new GerenciarContas();

        //Conta corrente da Carla
        Corrente cc = new Corrente(11, "Carla", 0, 1000);
        cc.depositar(500);
        System.out.println(cc);

        //Poupanca do Thiago
        Poupanca poupanca = new Poupanca(22, "Thiago", 0, 3);
        poupanca.depositar(2000);
        poupanca.sacar(300);
        System.out.println(poupanca);

        //Conta corrente do ZE
        Corrente cc1 = new Corrente(33, "Ze", 0, 1000);
        cc1.depositar(1000);
        cc1.sacar(100);

        gc.adicionarConta(cc);
        gc.adicionarConta(poupanca);
        gc.adicionarConta(cc1);

        System.out.println("Saldo de todas as contas: " + gc.getTotalPatrimonioLiquido());
    }
}
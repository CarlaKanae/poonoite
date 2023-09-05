import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContaGerenciar {
    public List<Conta> lista = new ArrayList<>();
    public static void main(String[] args) {
        //Montar o menu do programa
        int opcao = 0;
        Scanner sc = new Scanner(System.in);
        ContaGerenciar contaGerenciar = new ContaGerenciar();
        do{
            System.out.println("Menu Principal");
            System.out.println("1. Cadastrar");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Consultar Saldo");
            System.out.println("5. Consultar Contas");
            System.out.println("9. Sair");
            System.out.println("Escolha sua opcao: ");
            opcao = Integer.parseInt(sc.nextLine());
            switch (opcao){
                case 1:
                    contaGerenciar.execCadastrar();
                    break;
                case 2:
                    contaGerenciar.execDepositar();
                    break;
                case 3:
                    contaGerenciar.execSacar();
                    break;
                case 4:
                    contaGerenciar.execConsultarSaldo();
                    break;
                case 5:
                    contaGerenciar.execConsultarContas();
                    break;
                case 9:
                    System.out.println("Fim do Programa");
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        }while(opcao!=9);
    }
    public void execCadastrar(){
        //cadastrar um nova conta
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero da conta: ");
        int numConta = Integer.parseInt(sc.nextLine());
        System.out.println("Digite o nome do cliente da conta: ");
        String nomeCliente = sc.nextLine();
        Conta conta = new Conta(numConta, nomeCliente);
        //adicionar esta conta na lista
        lista.add(conta);
        System.out.println("Conta Cadastrada com Sucesso");
    }
    public void execDepositar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero da conta a depositar: ");
        int numConta = Integer.parseInt(sc.nextLine());
        for (Conta conta: lista) {
            if(conta.getNumConta() == numConta){
                //achei a conta
                System.out.println("Digite o valor do deposito: ");
                double valor = Double.parseDouble(sc.nextLine());
                boolean ok = conta.depositar(valor);
                if(ok){
                    System.out.println("Deposito efetuado com sucesso");
                }else{
                    System.out.println("Valor invalido para o deposito");
                }
                return;
            }
        }
        System.out.println("Conta nao encontrada");
    }
    public void execSacar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero da conta a sacar: ");
        int numConta = Integer.parseInt(sc.nextLine());
        for (Conta conta: lista) {
            if(conta.getNumConta() == numConta){
                //achei a conta
                System.out.println("Digite o valor do saque: ");
                double valor = Double.parseDouble(sc.nextLine());
                boolean ok = conta.sacar(valor);
                if(ok){
                    System.out.println("Saque efetuado com sucesso");
                }else{
                    System.out.println("Sem saldo para o saque");
                }
                return;
            }
        }
        System.out.println("Conta nao encontrada");
    }
    public void execConsultarSaldo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero da conta a consultar: ");
        int numConta = Integer.parseInt(sc.nextLine());
        for(Conta conta : lista){
            //achei
            if(conta.getNumConta() == numConta){
                System.out.println(conta.emitirExtrato());
                return;
            }
        }
        System.out.println("Conta nao encontrada");

    }
    public void execConsultarContas(){
        System.out.println("DADOS DE TODAS AS CONTAS");
        for(Conta conta : lista){
            System.out.println(conta.emitirExtrato());
        }
    }

}

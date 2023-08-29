import java.util.Scanner;

public class ContaTeste {
    public Conta cc = new Conta();

    public static void main(String[] args) {
        ContaTeste gerenciarConta = new ContaTeste();
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        do{
            //monta o menu
            System.out.println("Menu Conta");
            System.out.println("1. Cadastrar");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Consultar");
            System.out.println("9. Sair");
            System.out.println("Escolha sua opcao: ");
            opcao = Integer.parseInt(sc.nextLine());
            switch (opcao){
                case 1:
                    gerenciarConta.execCadastrar();
                    break;
                case 2:
                    gerenciarConta.execDepositar();
                    break;
                case 3:
                    gerenciarConta.execSacar();
                    break;
                case 4:
                    gerenciarConta.execConsultar();
                    break;
                case 9:
                    System.out.println("Fim");
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        }while(opcao!=9);
    }

    public void execCadastrar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero da conta");
        cc.setConta(sc.nextLine());
        System.out.println("Digite o nome da agencia");
        cc.setAgencia(sc.nextLine());
        System.out.println("Digite o nome do cliente");
        cc.setNomeCliente(sc.nextLine());
        System.out.println("Conta cadastrada com sucesso");
    }
    public void execConsultar(){
        cc.imprimir();
    }
    public void execSacar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor a ser sacado: ");
        double valor = Double.parseDouble(sc.nextLine());
        if(cc.sacar(valor)){
            System.out.println("Saque efetuado com sucesso");
        }else{
            System.out.println("Sem saldo suficiente");
        }
    }
    public void execDepositar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor a ser depositado:");
        double valor = Double.parseDouble(sc.nextLine());
        cc.depositar(valor);
        System.out.println("Deposito efetuado com sucesso");
    }
}
import java.util.Scanner;

public class ComputadorTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Computador comp1 = new Computador();
        System.out.println("Digite a marca do computador");
        comp1.setMarca(sc.nextLine());
        System.out.println("Digite o modelo do computador");
        comp1.setModelo(sc.nextLine());
        System.out.println("Digite a cor do computador");
        comp1.setCor(sc.nextLine());
        System.out.println("Digite o num. serie do computador");
        comp1.setNumeroSerie(Long.parseLong(sc.nextLine()));
        System.out.println("Digite o preco do computador");
        comp1.setPreco(Double.parseDouble(sc.nextLine()));
        comp1.imprimir();
        comp1.calcularValor();
        comp1.imprimir();

        //testar alteração do preco do produto
        System.out.println("Digite o novo preco: ");
        double novo = Double.parseDouble(sc.nextLine());
        if(comp1.alterarValor(novo)){
            System.out.println("Preco alterado");
        }else{
            System.out.println("Preco invalido");
        }
        comp1.imprimir();
    }
}
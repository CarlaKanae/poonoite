import java.util.Scanner;

public class Teste2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double valor;
        System.out.println("Digite um valor: ");
        valor = Double.parseDouble(leitor.nextLine());
        double conta = valor / 2;
        System.out.println("Resultado: " + conta);
    }
}

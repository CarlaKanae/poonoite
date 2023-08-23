import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, soma;
        System.out.println("Digite primeiro valor");
        a = Integer.parseInt(sc.nextLine());
        System.out.println("Digite segundo valor");
        b = Integer.parseInt(sc.nextLine());
        soma = a + b;
        System.out.println("Resultado: " + soma);
    }
}
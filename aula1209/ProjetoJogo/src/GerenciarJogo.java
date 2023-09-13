import java.util.Scanner;

public class GerenciarJogo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] palpites = new int[2];
        System.out.println("Digite o primeiro palpite: ");
        palpites[0] = Integer.parseInt(sc.nextLine());
        System.out.println("Digite o segundo palpite: ");
        palpites[1] = Integer.parseInt(sc.nextLine());
        Tabuleiro tabu = new Tabuleiro();
        double resultado = tabu.jogar(palpites);
        System.out.println("Seu premio: " + resultado);
    }
}
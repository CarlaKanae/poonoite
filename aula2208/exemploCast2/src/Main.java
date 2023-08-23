import java.util.Scanner;

/**
 * @version 1.0 Beta
 * @author Maromo
 * Classe Main - Responsável pelo ponto de
 * entrada do programa
 */
public class Main {
    /**
     * Método Main - bla bla bla
     * @param args Argumentos vindo do teclado
     */
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        char x, y;
        System.out.println("Digite uma letra: ");
        //Leitura de um char
        x = sc.nextLine().charAt(0);
        /*
        comentário de várias linhas
         */
        System.out.println("Digite outra letra: ");
        y = sc.nextLine().charAt(0);
        System.out.println("Letra x: " + x);
        System.out.println("Letra y: " + y);

    }

    /**
     * Método depositar - realiza depósito do valor
     * na conta
     * @param valor refere-de a um valor do tipo double passado como
     *              argumento para depósito
     * @return 0.0
     */
    public static double depositar(double valor){
        System.out.println("Dep");
        return 0.0;
    }
}
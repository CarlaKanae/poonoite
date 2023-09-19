import java.util.Arrays;
import java.util.Scanner;

public class TesteVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[5];
        //alimentar
        for (int i = 0; i < v.length; i++) {
            System.out.println("Digite valor: ");
            v[i] = Integer.parseInt(sc.nextLine());
        }
        Arrays.sort(v);
        for(int x : v){
            System.out.printf("%d ", x);
        }
        System.out.println();
        int [] v1 = new int[10];
        Arrays.fill(v1, 15);
        for(int x : v1){
            System.out.println(x);
        }
        int [] vetor1 = {21, 14, 13, 85, 10, 81, 14, 15, 28, 31};
        int [] vetor2 = new int[10];
        System.arraycopy(vetor1, 2, vetor2, 6, 4);
        for (int i = 0; i < vetor2.length; i++) {
            System.out.printf("[%d] --> [%d] \n", i, vetor2[i]);
        }
    }
}

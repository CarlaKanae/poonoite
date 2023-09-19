import java.util.Random;

public class TesteMatriz {
    public static void main(String[] args) {
        int[][] matriz = new int[7][7];
        Random random = new Random();
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                matriz[i][j] = random.nextInt(1,10);
            }
        }
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.printf("[%2d] ", matriz[i][j]);
            }
            System.out.println();
        }
    }
}

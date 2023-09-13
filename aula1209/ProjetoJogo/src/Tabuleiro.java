import java.util.Random;

public class Tabuleiro {
    private int[][] matriz = new int[10][10];
    private int[] palpites = new int[2];

    public Tabuleiro(){
        //montar a logica para definir os valores
        montarTabuleiro();

    }

    private void montarTabuleiro() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = random.nextInt(1,101);
            }
        }
    }

    public double jogar(int[] palpites){
        this.palpites = palpites;
        double total = checarResultados(palpites);
        exibirTabuleiro();
        return total;
    }

    private void exibirTabuleiro() {
        //imprimir o tabuleiro marcando os palpites acertados
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(palpites[0] == matriz[i][j] || palpites[1] == matriz[i][j]){
                    System.out.printf("[%3d]* ", matriz[i][j]);
                }else{
                    System.out.printf("[%3d]  ", matriz[i][j]);
                }
            }
            System.out.println();
        }
    }

    private double checarResultados(int[] palpites){
        //procurar palpites dados no tabuleiro
        double total = 0;
        int qtdAcertos = 0;
        //varrer os dois palpites
        for(int palpite : palpites){
            //procurar na matriz pelo palpite
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    //se bate o palpite com o valor da posicao
                    if(palpite == matriz[i][j]) qtdAcertos++;
                }
            }
        }
        if(qtdAcertos >= 3){
            total = qtdAcertos * 1000;
        }
        return total;
    }
}

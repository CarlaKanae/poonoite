import model.Baralho;

public class GerenciarJogo {

    public static void main(String[] args) {
        Baralho baralho = new Baralho();
        baralho.exibir();
        System.out.println("Mostrar embaralhado");
        baralho.embaralhar();
        baralho.exibir();
    }
}
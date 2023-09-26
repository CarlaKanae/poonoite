import model.Jogador;
import model.Time;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Resposta da Questao 1 e Questao 4

public class PrjAvaliacaoTest {
    public static void main(String[] args) {
        Time time1 = new Time();
        time1.setIdTime(1);
        time1.setNomeTime("SPFC");
        Scanner sc = new Scanner(System.in);

        List<Jogador> lista = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            Jogador j = new Jogador();
            System.out.println("Jogador " + (i+1));
            System.out.println("Digite o id do Jogador: ");
            j.setIdJogador(Integer.parseInt(sc.nextLine()));
            System.out.println("Digite o nome do Jogador: ");
            j.setNomeJogador(sc.nextLine());
            System.out.println("Digite a posicao do Jogador: ");
            j.setPosicao(sc.nextLine());
            System.out.println("Digite o num. da camisa do Jogador: ");
            j.setNumCamisa(Integer.parseInt(sc.nextLine()));
            lista.add(j);
        }
        time1.setJogadorList(lista);
        System.out.println(time1.listarJogadores());

        //questao 4
        System.out.println(time1.listarDados());

        Jogador jogProcurado = new Jogador();
        jogProcurado.setIdJogador(1);
        if(time1.encontrarjogador(jogProcurado)){
            System.out.println("Faz parte do time");
        }else{
            System.out.println("Nao faz parte do time");
        }

    }
}
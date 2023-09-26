package model;

import java.util.ArrayList;
import java.util.List;

public class Time {
    private int idTime;
    private String nomeTime;
    private List<Jogador> jogadorList = new ArrayList<>();

    public int getIdTime() {
        return idTime;
    }

    public void setIdTime(int idTime) {
        this.idTime = idTime;
    }

    public String getNomeTime() {
        return nomeTime;
    }

    public void setNomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    public List<Jogador> getJogadorList() {
        return jogadorList;
    }

    public void setJogadorList(List<Jogador> jogadorList) {
        this.jogadorList = jogadorList;
    }

    public String listarJogadores(){
        String jogadoresString = "Jogadores do Time\n";
        for (Jogador j : jogadorList){
            jogadoresString += "Nome: " + j.getNomeJogador() + "\n";
            jogadoresString += "Posicao: " + j.getPosicao() + "\n";
            jogadoresString += "Camisa: " + j.getNumCamisa() + "\n";
            jogadoresString += "=-=-=-=-=-=-=-=-=-=-=-=-=-=\n";
        }
        return jogadoresString;
    }

    //questao 4
    public String listarDados() {
        return "Nome do time: " + nomeTime + "\n" +
                "Identificacao " + idTime + "\n";
    }

    public boolean encontrarjogador(Jogador j){
        for (Jogador jogador : jogadorList){
            if(j.getIdJogador() == jogador.getIdJogador()){
                return true;
            }
        }
        return false;
    }
}

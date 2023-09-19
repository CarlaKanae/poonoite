package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {
    private List<Carta> cartas;

    public Baralho(){
        //lista de cartas vazia
        cartas = new ArrayList<>();
        montar();

    }

    private void montar() {
        for(Naipe n : Naipe.values()){
            for(Valor v : Valor.values()) {
                Carta carta = new Carta();
                carta.setValor(v);
                carta.setNaipe(n);
                cartas.add(carta);
            }
        }
    }
    public void exibir(){
        for(Carta carta : cartas){
            System.out.println(carta);
        }
    }
    public void embaralhar(){
        Collections.shuffle(cartas);
    }
}

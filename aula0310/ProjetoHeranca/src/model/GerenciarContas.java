package model;

import java.util.ArrayList;
import java.util.List;

public class GerenciarContas {
    private List<Conta> lista = new ArrayList<>();

    private double totalPatrimonioLiquido;

    public void adicionarConta(Conta conta){
        lista.add(conta);

    }

    public double getTotalPatrimonioLiquido() {
        double total = 0;
        for(Conta c: lista){
            total += c.getSaldo();
        }
        return total;
    }
}

package model;

public class Poupanca extends Conta {
    private int diaAniversario;
    public Poupanca(int numConta, String nomeCliente, double saldo, int diaAniversario) {
        super(numConta, nomeCliente, saldo);
        this.diaAniversario = diaAniversario;
    }

    public int getDiaAniversario() {
        return diaAniversario;
    }

    public void setDiaAniversario(int diaAniversario) {
        this.diaAniversario = diaAniversario;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Dia de Aniversário: " + diaAniversario + "\n";
    }
}

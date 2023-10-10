package model;

public class Corrente extends Conta{
    private double limiteCheque;
    public Corrente(int numConta, String nomeCliente, double saldo, double limiteCheque) {
        super(numConta, nomeCliente, saldo);
        this.limiteCheque = limiteCheque;
    }

    public double getLimiteCheque() {
        return limiteCheque;
    }

    public void setLimiteCheque(double limiteCheque) {
        this.limiteCheque = limiteCheque;
    }

    @Override
    public boolean sacar(double valor) {
        if(valor <= (limiteCheque + getSaldo())){
            setSaldo(getSaldo() - valor);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Limite do cheque: " + limiteCheque + "\n";
    }
}

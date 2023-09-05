public class Conta {
    private int numConta;
    private String nomeCliente;
    private double saldo;

    //Método construtor personalizado
    public Conta(int numConta, String nomeCliente) {
        this.numConta = numConta;
        this.nomeCliente = nomeCliente;
    }

    //Métodos getters and setters
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Métodos personalizados
    public boolean sacar(double valor){
        if(valor < saldo){
            saldo -= valor;
            return true;
        }
        return false;
    }
    public boolean depositar(double valor){
        if(valor <= 0){
            return false;
        }
        saldo += valor;
        return true;
    }
    public String emitirExtrato(){
        return "Dados da conta: " + numConta + "\n" +
            "Nome do Cliente: " + nomeCliente + "\n" +
            "Saldo da Conta: " + saldo + "\n";
    }
}

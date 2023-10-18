package model;

public abstract class Conta 
{
    private int numConta;
    private String nomeCliente;
    private double saldo;

    //Construtor personalizado
    public Conta(int numConta, String nomeCliente, double saldo) 
    {
        this.numConta = numConta;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }
    
    //Getters and Setters
    public int getNumConta() 
    {
        return numConta;
    }

    public void setNumConta(int numConta) 
    {
        this.numConta = numConta;
    }

    public String getNomeCliente() 
    {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) 
    {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() 
    {
        return saldo;
    }

    public void setSaldo(double saldo) 
    {
        this.saldo = saldo;
    }

    public void depositar(double valor)
    {
        this.saldo += valor;
    }

    public boolean sacar(double valor)
    {
        if(saldo >= valor)
        {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    @Override
    public String toString() 
    {
        return "Dados da conta " + numConta + "\n" +
                "Nome Cliente: " + nomeCliente + "\n" +
                "Saldo da Conta: " + saldo + "\n";

    }
}

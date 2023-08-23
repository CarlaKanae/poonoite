public class ContaCorrente {
    public int conta;
    public String agencia;
    public double saldo;
    public String nome;
    public static double cpmf = 0.0038;

    public void sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
            double desconto = valor * cpmf;
            saldo -= desconto;
        }

    }
}

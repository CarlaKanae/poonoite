public class Main {
    public static void main(String[] args) {
        ContaCorrente c1;
        ContaCorrente c2;
        System.out.println(ContaCorrente.cpmf);
        c1 = new ContaCorrente();
        c1.agencia = "mogi";
        c1.conta = 123;
        c1.saldo = 200;
        c2 = new ContaCorrente();
        c2.saldo = 200;
        c2.sacar(199);

        System.out.println(c2.saldo);
    }
}
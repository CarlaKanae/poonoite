public class Main {
    public static void main(String[] args) {
        Meses mes = Meses.janeiro;
        Meses[] novo = Meses.values().clone();
        System.out.println(novo[3]);
    }
}
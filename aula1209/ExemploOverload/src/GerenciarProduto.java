public class GerenciarProduto {
    public static void main(String[] args) {
         Produto prod1 = new Produto();
         Produto prod2 = new Produto(1, "Bola", 15.89);
         prod2.registrarEntrada(15);
         prod2.registrarEntrada(20);
         prod2.registrarSaida(5);
        System.out.println("Quantidade em estoque de " + prod2.getDescricao());
        System.out.println("Quantidade atual: " + prod2.getQtd());
        Produto prod3 = new Produto(1, "Bola 2", 10, 15.90);
        System.out.println(prod3.getDescricao());
    }
}
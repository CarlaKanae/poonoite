public class ApoliceTeste {
    public static void main(String[] args) {
        Apolice apolice = new Apolice();
        apolice.setNomeSegurado("João da Silva");
        apolice.setIdade(43);
        apolice.setValorPremio(1500f);
        //invocar o método imprimir
        apolice.imprimir();
    }
}
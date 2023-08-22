/**
 *
 */
public class GerenciarProduto {
    //montar um cenário
    //Cadastrar (registrar) 03 produtos diferente
    //e apresentar estes dados na tela

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Produto produto1, produto2, produto3;
        //montar o objeto na memoria (instanciar)
        produto1 = new Produto();
        produto1.codigo = "A1";
        produto1.descricao = "Papel sulfite";
        produto1.validade = 36;
        produto1.preco = 26.89;
        produto1.registrar();
        produto1.listar();
        produto2 = null;
        //da merda
       //produto2.registrar();

    }
}
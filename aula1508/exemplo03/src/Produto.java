public class Produto {
    //1. atributos
    public String codigo;
    public String descricao;
    public double preco;
    public int validade;

    //2. métodos
    public void registrar(){
        System.out.println("Produto " + descricao);
        System.out.println("registrado com sucesso");
    }

    /**
     * Método listar - resposável por listar os dados
     * do produto da papelaria.
     */
    public void listar(){
        System.out.println("Codigo: " + codigo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Preço: " + preco);
        System.out.println("Validade em meses: " + validade);
        System.out.println("-------------------------------");
    }
    //3. Método construtor
    public Produto(){
        System.out.println("Construi uma area na memoria");
    }
}

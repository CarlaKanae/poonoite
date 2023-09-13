public class Produto {
    private int codigo;
    private String descricao;
    private int qtd;
    private double valor;

    //método construtor padrao
    public Produto(){

    }
    public Produto(int codigo, String descricao, double valor){
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
    }
    public Produto(int codigo, String descricao, int qtd, double valor){
        this(codigo, descricao, valor);
        this.qtd = qtd;

    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQtd() {
        return qtd;
    }

    public double getValor() {
        return valor;
    }

    public void registrarEntrada(int qtd){
        this.qtd += qtd;
    }
    public void registrarSaida(int qtd){
        if(qtd <= this.qtd){
            this.qtd -= qtd;
        }else{
            throw new IllegalArgumentException("Sem quantidade " +
                    "disponível");
        }
    }
}

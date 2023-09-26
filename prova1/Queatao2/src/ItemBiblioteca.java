/**
 * Sobrecarga de Métodos:
 * Sobrecarga de métodos ocorre quando
 * temos múltiplos métodos na mesma classe
 * com o mesmo nome, mas com diferentes listas
 * de parâmetros (diferente número, tipo ou ambos).
 **
 * Exemplo prático:
 * Ainda no sistema de gerenciamento de bibliotecas,
 * a classe Biblioteca pode ter um método
 * pesquisarItem sobrecarregado para permitir
 * diferentes tipos de pesquisa. Uma versão do
 * método pode aceitar um título para
 * pesquisa, enquanto outra versão pode aceitar um ID.
 */

public class ItemBiblioteca {
    private int id;
    private String titulo;
    private java.time.LocalDateTime dataAquisicao;


    public ItemBiblioteca pesquisarItem(int id){
        //logica aqui para retornar o item encontrado
        return null; // so para salvar
    }

    public ItemBiblioteca pesquisaritem(String nome){
        //logica aqui para retornar o item encontrado pelo nome
        return null; //so para salvar
    }
}

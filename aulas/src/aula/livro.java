public class Livro {
    private String autor;
    private String descricao;

    // Construtor
    public Livro(String autor, String descricao) {
        this.autor = autor;
        this.descricao = descricao;
    }

    // Métodos para acessar os atributos
    public String getAutor() {
        return autor;
    }

    public String getDescricao() {
        return descricao;
    }

    // Método para mostrar informações do livro
    public void mostrarInfo() {
        System.out.println("Autor: " + autor);
        System.out.println("Descrição: " + descricao);
    }
}

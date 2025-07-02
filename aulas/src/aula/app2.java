package aula;

public class app2 {
    
    public static void main(String[] args) {
        app livro = new app();

        livro.nome = "The Seven Deadly Sins";
        livro.descricao = "Uma obra literaria de fantasia";
        livro.isbn = "97889544590";
        livro.preco = 35.90;
        livro.autor = "Nakaba Suzuki";
        livro.datapub = "2012";

        System.out.println(livro.nome);
    }
}

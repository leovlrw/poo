package Exercicio11;

public class TesteLivro {
    public static void main(String[] args) {
        // Criando objetos da classe Livro
        Livro livro1 = new Livro("1984", "George Orwell", 328);
        Livro livro2 = new Livro("Dom Casmurro", "Machado de Assis", 256);

        System.out.println("Detalhes do Livro 1:");
        livro1.exibirDetalhes();

        System.out.println("\nDetalhes do Livro 2:");
        livro2.exibirDetalhes();
    }
}

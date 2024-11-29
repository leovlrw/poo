package Exercicio13;

// Classe TesteAnimal
public class TesteAnimal {
    public static void main(String[] args) {
        // Criando objetos de cada classe
        Animal animalGenerico = new Animal();
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();

        // Chamando os métodos
        System.out.println("Som do Animal Genérico:");
        animalGenerico.fazerSom();

        System.out.println("\nSom do Cachorro:");
        cachorro.fazerSom();

        System.out.println("\nSom do Gato:");
        gato.fazerSom();
    }
}

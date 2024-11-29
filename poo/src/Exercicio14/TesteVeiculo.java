package Exercicio14;

public class TesteVeiculo {
    public static void main(String[] args) {
        // Criando objetos das classes Carro e Bicicleta
        Veiculo carro = new Carro();
        Veiculo bicicleta = new Bicicleta();

        // Chamando os métodos mover()
        System.out.println("Comportamento do Carro:");
        carro.mover();

        System.out.println("\nComportamento da Bicicleta:");
        bicicleta.mover();
    }
}

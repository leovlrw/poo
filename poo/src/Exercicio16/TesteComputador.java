package Exercicio16;

public class TesteComputador {
    public static void main(String[] args) {
        Processador processador = new Processador("Intel i7", 3.8);
        Memoria memoria = new Memoria(16);
        Computador computador = new Computador(processador, memoria);

        System.out.println("Características do Computador:");
        computador.exibirCaracteristicas();
    }
}
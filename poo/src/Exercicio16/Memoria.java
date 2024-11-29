package Exercicio16;

public class Memoria {
    private int capacidade;

    public Memoria(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getDetalhes() {
        return "Capacidade: " + capacidade + "GB";
    }
}
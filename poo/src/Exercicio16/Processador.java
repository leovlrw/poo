package Exercicio16;

public class Processador {
    private String modelo;
    private double velocidade;

    public Processador(String modelo, double velocidade) {
        this.modelo = modelo;
        this.velocidade = velocidade;
    }

    public String getDetalhes() {
        return "Modelo: " + modelo + ", Velocidade: " + velocidade + "GHz";
    }
}
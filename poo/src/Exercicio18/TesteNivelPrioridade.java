package Exercicio18;

public class TesteNivelPrioridade {
    public static void main(String[] args) {
        for (NivelPrioridade nivel : NivelPrioridade.values()) {
            nivel.exibirDetalhes();
        }
    }
}
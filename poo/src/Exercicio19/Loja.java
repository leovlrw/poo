package Exercicio19;

public class Loja {
    public double calcularPreco(double precoBase, int quantidade) {
        return precoBase * quantidade;
    }

    public double calcularPreco(double precoBase, int quantidade, double descontoPercentual) {
        double total = precoBase * quantidade;
        double desconto = total * (descontoPercentual / 100);
        return total - desconto;
    }
}
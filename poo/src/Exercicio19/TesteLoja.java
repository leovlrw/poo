package Exercicio19;

public class TesteLoja {
    public static void main(String[] args) {
        Loja loja = new Loja();

        double precoSemDesconto = loja.calcularPreco(50.0, 3);
        double precoComDesconto = loja.calcularPreco(50.0, 3, 10.0);

        System.out.println("Preço sem desconto: R$" + precoSemDesconto);
        System.out.println("Preço com desconto: R$" + precoComDesconto);
    }
}
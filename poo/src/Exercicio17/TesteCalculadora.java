package Exercicio17;

public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double soma = calculadora.somar(10, 5);
        double subtracao = calculadora.subtrair(10, 5);
        double multiplicacao = calculadora.multiplicar(10, 5);
        double divisao = calculadora.dividir(10, 5);

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
    }
}
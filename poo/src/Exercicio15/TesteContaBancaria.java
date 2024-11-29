package Exercicio15;

public class TesteContaBancaria {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria(12345);


        System.out.println("Detalhes da Conta:");
        conta.exibirDetalhes();


        System.out.println("\nRealizando depósitos:");
        conta.depositar(500.0);
        conta.depositar(200.0);
        conta.depositar(-50.0);


        System.out.println("\nSaldo Atual:");
        conta.exibirDetalhes();
    }
}
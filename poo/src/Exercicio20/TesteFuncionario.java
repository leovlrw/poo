package Exercicio20;

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Carlos", 3000.0);
        Gerente gerente = new Gerente("Ana", 5000.0, 1500.0);

        System.out.println(funcionario.getNome() + " - Salário: R$" + funcionario.calcularSalario());
        System.out.println(gerente.getNome() + " - Salário: R$" + gerente.calcularSalario());
    }
}
package atividade_4;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Carlos", 35, "Gerente");
        Cliente cliente = new Cliente("Ana", 28, "ana@email.com");

        System.out.println("Dados do Funcionário:");
        funcionario.exibirDados();

        System.out.println();

        System.out.println("Dados do Cliente:");
        cliente.exibirDados();
    }
}
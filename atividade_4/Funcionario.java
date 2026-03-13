package atividade_4;

public class Funcionario extends Pessoa {
    String cargo;

    public Funcionario(String nome, int idade, String cargo) {
        super(nome, idade);
        this.cargo = cargo;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Cargo: " + cargo);
    }
}
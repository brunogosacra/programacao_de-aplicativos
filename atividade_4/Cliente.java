package atividade_4;

public class Cliente extends Pessoa {
    String email;

    public Cliente(String nome, int idade, String email) {
        super(nome, idade);
        this.email = email;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Email: " + email);
    }
}
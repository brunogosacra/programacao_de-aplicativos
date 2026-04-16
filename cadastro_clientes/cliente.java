package cadastro_clientes;

public class cliente extends pessoa {

    String email;

    public cliente(String nome, int idade, String email) {
        super(nome, idade);
        this.email = email;
    }

    public void exibirDados() {
        super.exibirDados();
        System.out.println("Email: " + email);
    }
}
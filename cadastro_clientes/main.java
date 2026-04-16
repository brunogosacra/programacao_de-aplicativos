package cadastro_clientes;

public class main {

    public static void main(String[] args) {

        funcionario f1 = new funcionario("Carlos", 30, "Gerente");
        cliente c1 = new cliente("Ana", 25, "ana@email.com");

        System.out.println("=== Funcionário ===");
        f1.exibirDados();

        System.out.println("\n=== Cliente ===");
        c1.exibirDados();
    }

}

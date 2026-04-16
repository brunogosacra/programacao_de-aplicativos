package cadastro_clientes;

public class funcionario extends pessoa{

    String cargo;

    public funcionario(String nome, int idade, String cargo){
        super(nome,idade);
        this.cargo = cargo;
    }

    public void exibirDados(){
        super.exibirDados();
        System.out.println("Cargo: " + cargo);
    }
}
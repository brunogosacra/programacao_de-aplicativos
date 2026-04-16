package cadastro_de_Veiculos;

public class Moto extends Veiculo {

    int cilindradas;

    public Moto(String marca, int ano, int cilindradas) {
        super(marca, ano);
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Cilindradas: " + cilindradas);
    }
}
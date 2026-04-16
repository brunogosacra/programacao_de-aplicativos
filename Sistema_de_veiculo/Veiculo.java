package Sistema_de_veiculo;

public class Veiculo {
    public String marca;

    public Veiculo(String marca){
        this.marca = marca;
    }

    public void ligar(){
        System.out.println("O veiculo está ligando");
    }
}
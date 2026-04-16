package Atividade_06.exercicio_02;

public class Moto implements Veiculo {

    @Override
    public void ligar() {
        System.out.println("Moto ligada.");
    }

    @Override
    public void desligar() {
        System.out.println("Moto desligada.");
    }
}
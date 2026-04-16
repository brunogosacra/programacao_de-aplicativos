package Atividade_06.exercicio_06;

public class Computador implements Dispositivo {

    @Override
    public void ligar() {
        System.out.println("Computador ligado.");
    }

    @Override
    public void desligar() {
        System.out.println("Computador desligado.");
    }
}
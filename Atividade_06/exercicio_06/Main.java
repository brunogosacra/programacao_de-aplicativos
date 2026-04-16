package Atividade_06.exercicio_06;

public class Main {
    public static void main(String[] args) {
        Dispositivo tv = new Televisao();
        Dispositivo pc = new Computador();

        tv.ligar();
        pc.ligar();

        tv.desligar();
        pc.desligar();
    }
}
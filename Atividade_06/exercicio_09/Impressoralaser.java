package Atividade_06.exercicio_09;

public class Impressoralaser implements Impressora {

    @Override
    public void imprimir(String texto) {
        System.out.println("Impressão a laser: " + texto);
    }
}
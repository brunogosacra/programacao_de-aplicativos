package Atividade_06.exercicio_09;

public class Main {
    public static void main(String[] args) {
        Impressora laser = new Impressoralaser();
        Impressora jato = new impressorajatotinta();

        laser.imprimir("Documento importante");
        jato.imprimir("Foto colorida");
    }
}
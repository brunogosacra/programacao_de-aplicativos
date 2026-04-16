package Atividade_06.exercicio_09;

public class impressorajatotinta implements Impressora {

    @Override
    public void imprimir(String texto) {
        System.out.println("Impressão jato de tinta: " + texto);
    }
}
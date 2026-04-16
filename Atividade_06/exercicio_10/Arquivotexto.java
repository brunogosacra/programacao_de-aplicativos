package Atividade_06.exercicio_10;

public class Arquivotexto implements Arquivo {

    @Override
    public void abrir() {
        System.out.println("Abrindo arquivo de texto.");
    }

    @Override
    public void fechar() {
        System.out.println("Fechando arquivo de texto.");
    }
}
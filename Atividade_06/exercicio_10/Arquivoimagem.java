package Atividade_06.exercicio_10;

public class Arquivoimagem implements Arquivo {

    @Override
    public void abrir() {
        System.out.println("Abrindo arquivo de imagem.");
    }

    @Override
    public void fechar() {
        System.out.println("Fechando arquivo de imagem.");
    }
}
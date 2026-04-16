package Atividade_06.exercicio_10;

public class Main {
    public static void main(String[] args) {
        Arquivo texto = new Arquivotexto();
        Arquivo imagem = new Arquivoimagem();

        texto.abrir();
        imagem.abrir();

        texto.fechar();
        imagem.fechar();
    }
}
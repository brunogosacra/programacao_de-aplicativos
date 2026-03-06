package atividade_3;

public class main {

    public static void main(String[] args) {

       notas aluno1 = new notas("Carlos");

        double[] notas = {8.5, 7.0, 6.5, 9.0};

        aluno1.setNotas(notas);

        double media = aluno1.calcularMedia();

        aluno1.resultado(media);
    }
}
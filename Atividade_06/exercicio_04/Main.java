package Atividade_06.exercicio_04;

public class Main {
    public static void main(String[] args) {
        Forma f1 = new Quadrado(4);
        Forma f2 = new Circulo(3);

        System.out.println("Área do quadrado: " + f1.calcularArea());
        System.out.println("Área do círculo: " + f2.calcularArea());
    }
}
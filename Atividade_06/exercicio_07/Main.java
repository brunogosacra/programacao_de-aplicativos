package Atividade_06.exercicio_07;

public class Main {
    public static void main(String[] args) {
        Entrega correios = new Correios();
        Entrega transportadora = new Transportadora();

        double peso = 4.5;

        System.out.println("Frete pelos Correios: R$" + correios.calcularFrete(peso));
        System.out.println("Frete pela Transportadora: R$" + transportadora.calcularFrete(peso));
    }
}
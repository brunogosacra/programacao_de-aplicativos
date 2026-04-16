package Atividade_06.exercicio_07;

public class Transportadora implements Entrega {

    @Override
    public double calcularFrete(double peso) {
        // Exemplo: R$ 5 fixo + R$ 3 por kg
        return 5 + (peso * 3);
    }
}
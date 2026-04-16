package Atividade_06.exercicio_07;

public class Correios implements Entrega {

    @Override
    public double calcularFrete(double peso) {
        // Exemplo: R$ 10 fixo + R$ 2 por kg
        return 10 + (peso * 2);
    }
}
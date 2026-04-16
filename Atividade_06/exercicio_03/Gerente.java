package Atividade_06.exercicio_03;

public class Gerente implements Bonus {

    @Override
    public double calcularBonus(double salario) {
        // Exemplo: gerente recebe 20% de bônus
        return salario * 0.20;
    }
}
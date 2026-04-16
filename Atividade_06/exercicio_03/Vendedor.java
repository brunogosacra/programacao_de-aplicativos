package Atividade_06.exercicio_03;

public class Vendedor implements Bonus {

    @Override
    public double calcularBonus(double salario) {
        // Exemplo: vendedor recebe 10% de bônus
        return salario * 0.10;
    }
}
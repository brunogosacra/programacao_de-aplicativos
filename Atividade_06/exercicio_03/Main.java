package Atividade_06.exercicio_03;

public class Main {
    public static void main(String[] args) {
        Bonus gerente = new Gerente();
        Bonus vendedor = new Vendedor();

        double salario = 3000.0;

        System.out.println("Bônus do gerente: R$" + gerente.calcularBonus(salario));
        System.out.println("Bônus do vendedor: R$" + vendedor.calcularBonus(salario));
    }
}
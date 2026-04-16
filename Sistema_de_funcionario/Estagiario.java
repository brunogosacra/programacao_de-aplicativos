package Sistema_de_funcionario;

public class Estagiario extends Funcionario{

    public Estagiario(String nome, double salario){
        super(nome, salario);
    }

    @Override
    public double calcularSalario(){
        return salario * 0.8;
    }

    @Override
    public double calcularSalario(double bonus){
        return (salario * 0.8) + bonus;
    }
}
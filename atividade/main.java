package atividade;

public class main {
    public static void main(String[] args) {

        conta_bancaria conta = new conta_bancaria("12345", "João", 500);

        conta.depositar(200);

        conta.sacar(256);

        System.out.println("Saldo final: " + conta.getSaldo());

        conta.depositar(-50);

        conta.sacar(1000);
    }
}
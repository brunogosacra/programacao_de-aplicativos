package atividade;

 class conta_bancaria {
    private String numeroConta;
    private String titular;
    private double saldo;

    public conta_bancaria(String numeroConta, String titular, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {

        if (valor <= 0) {
            System.out.println("Depósito inválido. O valor deve ser positivo.");
            return;
        }

        saldo += valor;
        System.out.println("Depósito realizado com sucesso!");
        System.out.println("Saldo atual: " + saldo);
    }

    public void sacar(double valor) {

        if (valor <= 0) {
            System.out.println("Valor de saque inválido.");
            return;
        }

        if (valor > saldo) {
            System.out.println("Saque não permitido. Saldo insuficiente.");
            return;
        }

        saldo -= valor;

        int saque = (int) valor;

        int ced100 = saque / 100;
        saque = saque % 100;

        int ced50 = saque / 50;
        saque = saque % 50;

        int ced10 = saque / 10;
        saque = saque % 10;

        int ced5 = saque / 5;
        saque = saque % 5;

        int ced1 = saque;

        System.out.println("Saque realizado com sucesso!");

        System.out.println("Cédulas utilizadas:");

        if (ced100 > 0)
            System.out.println(ced100 + " cédula(s) de 100");

        if (ced50 > 0)
            System.out.println(ced50 + " cédula(s) de 50");

        if (ced10 > 0)
            System.out.println(ced10 + " cédula(s) de 10");

        if (ced5 > 0)
            System.out.println(ced5 + " cédula(s) de 5");

        if (ced1 > 0)
            System.out.println(ced1 + " cédula(s) de 1");

        System.out.println("Saldo restante: " + saldo);
    }

    public double getSaldo() {
        return saldo;
    }
}

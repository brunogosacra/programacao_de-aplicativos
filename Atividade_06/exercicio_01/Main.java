package Atividade_06.exercicio_01;

public class Main {
    public static void main(String[] args) {
        Pagamento pagamento1 = new CartaoCredito();
        Pagamento pagamento2 = new Pix();

        pagamento1.pagar(150.0);
        pagamento2.pagar(75.5);
    }
}
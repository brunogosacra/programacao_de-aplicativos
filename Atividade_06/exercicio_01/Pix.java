package Atividade_06.exercicio_01;


public class Pix implements Pagamento {

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado via Pix.");
    }
}
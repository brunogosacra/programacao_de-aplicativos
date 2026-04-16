package Atividade_06.exercicio_05;

public class Email implements Notificacao {

    @Override
    public void enviarMensagem(String msg) {
        System.out.println("Enviando e-mail: " + msg);
    }
}
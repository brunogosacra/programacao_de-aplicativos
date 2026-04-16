package Atividade_06.exercicio_05;

public class SMS implements Notificacao {

    @Override
    public void enviarMensagem(String msg) {
        System.out.println("Enviando SMS: " + msg);
    }
}
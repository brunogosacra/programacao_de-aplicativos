package Atividade_06.exercicio_05;

public class Main {
    public static void main(String[] args) {
        Notificacao email = new Email();
        Notificacao sms = new SMS();

        email.enviarMensagem("Olá por e-mail!");
        sms.enviarMensagem("Olá por SMS!");
    }
}
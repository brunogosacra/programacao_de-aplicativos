package ATIVIDADE_PONTUADA;

public class Main {
    public static void main(String[] args) {
        IPhone iphone = new IPhone();

        iphone.tocar();
        iphone.selecionarMusica("Imagine - John Lennon");
        iphone.pausar();

        iphone.ligar("123456789");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("https://www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
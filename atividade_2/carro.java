package atividade_2;

public class carro {

    private String marca;
    private int velocidadeAtual;
    private int velocidadeMaxima;

    public carro(String marca, int velocidadeMaxima) {
        this.marca = marca;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = 0;
    }

    public void acelerar(int valor) {
        if (valor > 0) {
            velocidadeAtual += valor;

            if (velocidadeAtual > velocidadeMaxima) {
                velocidadeAtual = velocidadeMaxima;
            }
        }
    }

    public void frear(int valor) {
        if (valor > velocidadeAtual) {
            System.out.println("Erro: não é possível frear mais do que a velocidade atual.");
        } else if (valor > 0) {
            velocidadeAtual -= valor;
        }
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public String getMarca() {
        return marca;
    }
}




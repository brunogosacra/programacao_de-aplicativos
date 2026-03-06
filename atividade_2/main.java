package atividade_2;

public class main {
    public static void main(String[] args) {

        carro carro = new carro("Toyota", 200);

        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Velocidade máxima: " + carro.getVelocidadeMaxima());

        carro.acelerar(50);
        System.out.println("Velocidade atual: " + carro.getVelocidadeAtual());

        carro.acelerar(180);
        System.out.println("Velocidade atual após acelerar muito: " + carro.getVelocidadeAtual());

        carro.frear(30);
        System.out.println("Velocidade atual após frear: " + carro.getVelocidadeAtual());

        carro.frear(300);
        System.out.println("Velocidade atual final: " + carro.getVelocidadeAtual());
    }
}

package sistema_de_animais;

public class Main {
    public static void main(String[] args){
        Cachorro cachorro = new Cachorro ("Marley");
        Gato gato = new Gato ("Gorda");

        cachorro.emitirSom();
        gato.emitirSom();

        cachorro.emitirSom(3);
    }
}
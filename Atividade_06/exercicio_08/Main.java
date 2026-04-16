package Atividade_06.exercicio_08;

public class Main {
    public static void main(String[] args) {
        Autenticacao user = new UsuarioComum();
        Autenticacao admin = new Administrador();

        user.login("user", "123");
        admin.login("admin", "admin123");
    }
}
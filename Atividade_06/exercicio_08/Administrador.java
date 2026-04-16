package Atividade_06.exercicio_08;

// Classe Administrador
public class Administrador implements Autenticacao {

    private String usuarioCorreto = "admin";
    private String senhaCorreta = "admin123";

    @Override
    public boolean login(String usuario, String senha) {
        if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
            System.out.println("Login de administrador realizado com sucesso.");
            return true;
        } else {
            System.out.println("Falha no login de administrador.");
            return false;
        }
    }
}
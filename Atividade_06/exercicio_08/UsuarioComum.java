package Atividade_06.exercicio_08;

public class UsuarioComum implements Autenticacao {

    private String usuarioCorreto = "user";
    private String senhaCorreta = "123";

    @Override
    public boolean login(String usuario, String senha) {
        if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
            System.out.println("Login de usuário comum realizado com sucesso.");
            return true;
        } else {
            System.out.println("Falha no login de usuário comum.");
            return false;
        }
    }
}
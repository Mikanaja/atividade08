class LoginInvalidoException extends Exception {
    public LoginInvalidoException(String mensagem) {
        super(mensagem);
    }
}

public class Login {
    private String usuario;
    private String senha;

    public Login(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public boolean fazer_login(String usuario, String senha) throws LoginInvalidoException {
        if (this.usuario.equals(usuario) && this.senha.equals(senha)) {
            return true;
        } else {
            throw new LoginInvalidoException("Usuário ou senha incorretos.");
        }
    }
}

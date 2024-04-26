import java.util.Scanner;

public class TesteLogin {
    public static void main(String[] args) {
        Login login = new Login("usuario", "senha");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o usuário: ");
        String usuario = scanner.nextLine();

        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        try {
            if (login.fazer_login(usuario, senha)) {
                System.out.println("Login bem-sucedido!");
            }
        } catch (LoginInvalidoException e) {
            System.out.println("Erro ao fazer login: " + e.getMessage());
        }
    }
}

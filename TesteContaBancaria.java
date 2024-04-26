import java.util.Scanner;

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1000);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor a sacar: ");
        double valorSaque = scanner.nextDouble();

        try {
            conta.sacar(valorSaque);
            System.out.println("Saque realizado com sucesso! Saldo atual: " + conta.getSaldo());
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro ao sacar: " + e.getMessage());
        }
    }
}

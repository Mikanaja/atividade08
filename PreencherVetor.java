import java.util.InputMismatchException;
import java.util.Scanner;

public class PreencherVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        int indice = 0;
        
        try {
            while (true) {
                System.out.print("Digite um número (0 para parar): ");
                int numero = scanner.nextInt();
                
                if (numero == 0) {
                    vetor[indice] = numero;
                    break;
                }
                
                vetor[indice] = numero;
                indice++;
                
                if (indice == 10) {
                    System.out.println("Número máximo de elementos atingido.");
                    break;
                }
            }
            
            System.out.println("Elementos do vetor:");
            for (int i = 0; i < indice; i++) {
                System.out.println(vetor[i]);
            }
        } catch (InputMismatchException e) {
            System.out.println("Por favor, digite um valor numérico.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Número máximo de elementos atingido.");
        }
    }
}

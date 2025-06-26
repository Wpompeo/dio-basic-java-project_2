
import Dio.com.br.Exception.ParametrosInvalidosException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("===========Bem-vindo ao Contador==========");
        System.out.println("Informe o primeiro número:");
        int numberOne = sc.nextInt();
        System.out.println("Informe o segundo número:");
        int numberTwo = sc.nextInt();
        System.out.println("==========================================");

        try {
            contar(numberOne, numberTwo);
        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    public static void contar(int numberOne, int numberTwo) throws ParametrosInvalidosException {
        if (numberOne < 0 || numberTwo < 0) {
            throw new ParametrosInvalidosException("Os números devem ser positivos.");
        }
        if (numberOne > numberTwo) {
            throw new ParametrosInvalidosException("O primeiro número deve ser menor que o segundo.");
        }
        for (int i = numberOne; i <= numberTwo; i++) {
            System.out.println("Imprmindo numeros contador: ");
            System.out.println(i);
        }
    }
}

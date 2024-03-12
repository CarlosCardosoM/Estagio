
import java.util.Scanner;


/**
 *
 * @author Carlo
 */
public class Fibonacci {
    
    public static boolean isFibonacci(int number) {
        int a = 0, b = 1;
        while (a < number) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return a == number;
    }
    public static void printFibonacciSequence(int number) {
        int a = 0, b = 1;
        System.out.print("Sequência de Fibonacci até " + number + ": " + a + ", " + b);

        while (a + b <= number) {
            int temp = b;
            b = a + b;
            a = temp;
            System.out.print(", " + b);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int number = scanner.nextInt();

        if (isFibonacci(number)) {
            System.out.println(number + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(number + " não pertence à sequência de Fibonacci.");
        }
        printFibonacciSequence(number);

    }
}


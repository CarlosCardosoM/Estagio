
import java.util.Scanner;


public class Questao5 {
    public static String reverteString(String input) {
        char[] charArray = input.toCharArray();
        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {
            // Troca os caracteres no início e no final da string
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            // Move os ponteiros para o próximo par de caracteres
            start++;
            end--;
        }

        // Cria uma nova string a partir do array de caracteres invertido
        return new String(charArray);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //permitir  a entrada de uma string do usuário
        System.out.print("Digite uma string para inverter: ");
        String input = scanner.nextLine();

        String reversedString = reverteString(input);
        System.out.println("String invertida: " + reversedString);
    }
}
    


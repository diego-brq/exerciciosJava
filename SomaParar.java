import java.util.Scanner;

public class SomaParar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os números e some eles abaixo: ");

        int numeros = scanner.nextInt();
        int total = 0;

        while (numeros != 0) {
            total = total + numeros;
            numeros = scanner.nextInt();
        }

        System.out.println("A soma total é: " + total);

        scanner.close();
        
    }
    
}

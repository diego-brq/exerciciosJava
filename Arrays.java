import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] numeros = new double[5];

        // PARTE 1: LÊ os 5 preços
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Preço do produto " + (i + 1) + ": R$ ");
            numeros[i] = scanner.nextDouble();   // ← AQUI é onde guarda no array
        }

        System.out.println("\n--- Preços cadastrados ---");

        // PARTE 2: MOSTRA os 5 preços
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Produto " + (i + 1) + ": R$ " + numeros[i]);
        }

        scanner.close();
    }
}
import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadora CLI, digite algo o que você deseja calcular: ");

        while (true) {
            String entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("sair")) {
                System.out.println("Até logo!");
                break;
            } 
        }

    }
}

import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args){

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Digite o primeiro número: ");
            int num1 = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Digite a operação: ");
            String operador = scanner.nextLine();

            System.out.print("Digite o segundo número: ");
            int num2 = scanner.nextInt();

            int resultado = 0;
            boolean operadorValido = true;

            switch (operador) {
                case "+":
                    resultado = num1 + num2;
                    break;
                case "-":
                    resultado = num1 - num2;
                    break;
                case "/":
                    resultado = num1 / num2;
                    break;
                case "*":
                    resultado = num1 * num2;
                    break;
                default:
                    operadorValido = false;
                    System.out.println("Operador inválido");
                    break;
            }

            if (operadorValido) {
                System.out.println("O resultado final da operação é: " + resultado);
            }
        }
    } 
}

    


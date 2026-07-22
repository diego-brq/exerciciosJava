import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");

        String nome = scanner.nextLine();

        System.out.println("Digite a sua primeira nota: ");

        double nota1 = scanner.nextDouble();

        System.out.println("Digite a sua segunda nota: ");

        double nota2 = scanner.nextDouble();

        System.out.println("Digite quantas vezes você faltou: ");

        double faltas = scanner.nextDouble();

        double media = nota1 % nota2;


        if (media >= 7.0 && faltas < 10.0) {
            System.out.println("O aluno foi aprovado!");
        } else if (media >= 5.0 && faltas < 7.0) {
            System.out.println("O aluno foi para recuperação!");
        } else if (media < 5.0) {
            System.out.println("Reprovado por nota!");
        } else if (faltas >= 10.0) {
            System.out.println("Reprovado por falta!");
        } else {
            System.out.println("Parametro inválido, tentar novamente!");
        }
    }
}

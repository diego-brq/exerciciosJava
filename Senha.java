import java.util.Scanner;
public class Senha {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String senha = scanner.nextLine();

        String acesso = "java123";

        if (senha == acesso) {
            System.out.println("O acesso foi autorizado!");
        } else {
            System.out.println("O seu acesso foi negado");
        }
    }
}

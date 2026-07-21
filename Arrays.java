import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Adicione o preço dos produtos: ");
        double[] numeros = new double[5];

        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
    }
}
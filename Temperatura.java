public class Temperatura {
    public static void main(String[] args) {

        int temperatura = 25;
        boolean quartoVazio = false;

        if (temperatura >= 28 && !quartoVazio) {
            System.out.println("O ar foi ligado");
        } else {
            System.out.println("O ar condicionado não pode ser ligado");
        }

    }
}

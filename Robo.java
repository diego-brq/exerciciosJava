public class Robo {

    String nome;
    void falar() {
        System.out.println("Olá, eu sou o " + nome);
    }

    void dancar() {
        System.out.println("O robô faz um moonwalk");
    }
}

class Main{

    public static void main(String[] args){
        Robo astro = new Robo();
        astro.nome = "Astro";
        astro.falar();
        astro.dancar();

        
    }
    
}

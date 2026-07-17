public class Cinema {
    public static void main(String[] args) {

        int idadeCliente = 13;
        boolean acompanhadoDosPais = true;

        if (idadeCliente >= 18 || acompanhadoDosPais) {
            System.err.println("Pode participar da sessão");
        } else {
            System.out.println("Não pode participar da sessão");
        }
        
    }
}



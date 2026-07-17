public class Alarme {

    public static void main(String[] args) {

        boolean alarmeAtivado = true;
        boolean portaAberta = false;
        boolean movimentoDetectado = true;

        boolean alarmeDisparo = alarmeAtivado && (portaAberta || movimentoDetectado);
        
        if (alarmeDisparo) {
            System.out.println("O alarme foi disparado");
        } else {
            System.out.println("O alarme não foi disparado");
        }
            

    }
    
}

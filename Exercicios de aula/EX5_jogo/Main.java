package EX5_jogo;

public class Main {
    public static void main(String[] args) {
        Personagen Character = new Personagen("Josias", 100);
        Arma armaP = new Arma("MEGA FACA DE PAO SUPREMA", 200, 500);
        
        armaP.descricao = "Uma faca de pao tao poderosa que pode cortar mainteiga!";

        Character.arma = armaP;

        Character.UsarArma();

        Character.arma.MostrarInfo();

        Character.TomarDano();
        
    }
    
}

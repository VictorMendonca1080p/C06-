package EX13_Mamíferos;

import EX13_Mamíferos.Animais.Cachorro;
import EX13_Mamíferos.Animais.Lontra;
import EX13_Mamíferos.Animais.Boi;

public class Main {
    public static void main(String[] args) {
        
        Cachorro cachorro = new Cachorro("Apollo", 10000);
        Lontra lontra = new Lontra("Skigues", 2000);
        Boi boi = new Boi("Bartolomeu", 20000);

        cachorro.emitirSom();
        cachorro.mostraInfo();

        lontra.emitirSom();
        lontra.mostraInfo();

        boi.emitirSom();
        boi.mostraInfo();








    }
}

package Ex8_Banda;

public class Main {
    public static void main(String[] args) {
        Banda bandaDeRock = new Banda("Los metaleros", "rock 2");
        bandaDeRock.dono = new Empresario("Seu Inacio", 1376047);

        Membro membro1 = new Membro("jaum", "guitarrista");
        Membro membro2 = new Membro("Gui", "baterista");
        Membro membro3 = new Membro("Algusto", "baixista");

        bandaDeRock.Addmembro(membro1);
        bandaDeRock.Addmembro(membro2);
        bandaDeRock.Addmembro(membro3);

        Musica musica1 = new Musica("Dont stop me now", 2);
        Musica musica2 = new Musica("Lets go fly", 5);
        Musica musica3 = new Musica("Gragra", 3);

        bandaDeRock.Addmusica(musica1);
        bandaDeRock.Addmusica(musica2);
        bandaDeRock.Addmusica(musica3);

        bandaDeRock.mostraInfo();







    }
    
}

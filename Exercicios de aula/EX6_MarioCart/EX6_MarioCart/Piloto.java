package EX6_MarioCart;

public class Piloto {
    String nome;
    boolean vilao;
    Kart KartPiloto;

    public Piloto(String nomeC)
    {
        this.nome = nomeC;
    }

    public void SoltarSuperPoder()
    {
        System.out.println(nome + " solta seu super poder: ");
    }
}

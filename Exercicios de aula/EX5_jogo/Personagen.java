package EX5_jogo;

public class Personagen {
    String nome;
    int pontosHP;

    Arma arma;

    public Personagen(String nomeC, int pontosC)
    {
        this.nome = nomeC;
        this.pontosHP = pontosC;
    }

    public void UsarArma()
    {
        arma.resistencia -= 2;
    }

    public void TomarDano()
    {
        pontosHP -= 5;
    }
}

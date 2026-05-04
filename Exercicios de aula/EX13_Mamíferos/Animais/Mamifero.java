package EX13_Mamíferos.Animais;

public abstract class Mamifero {
    protected String nome;
    protected double vida;

    public Mamifero(String nomeC, double vidaC)
    {
        this.nome = nomeC;
        this.vida = vidaC;
    }



    public abstract void emitirSom();

    public void mostraInfo()
    {
        System.out.println("Nome: " + nome);
        System.out.println("Vida: " + vida);
    }



}

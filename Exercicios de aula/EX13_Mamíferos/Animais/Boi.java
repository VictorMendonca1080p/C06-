package EX13_Mamíferos.Animais;

public class Boi extends Mamifero{
    public Boi(String nomeC, double vidaC)
    {
        super(nomeC, vidaC);
    }


    @Override
    public void emitirSom()
    {
        System.out.println("MUUUUUUUUU");
    }

}


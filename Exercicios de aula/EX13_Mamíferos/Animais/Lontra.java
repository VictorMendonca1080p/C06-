package EX13_Mamíferos.Animais;

public class Lontra extends Mamifero implements Aquatico{
    public Lontra(String nomeC, double vidaC)
    {
        super(nomeC, vidaC);
    }

    @Override
    public void emitirSom()
    {
        System.out.println("AAAAAAAAAA");
    }

    @Override
    public void nadar()
    {
        System.out.println("Splashhhhh");
    }

}

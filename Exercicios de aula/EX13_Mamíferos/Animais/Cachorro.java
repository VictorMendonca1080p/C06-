package EX13_Mamíferos.Animais;

public class Cachorro extends Mamifero{
    public Cachorro(String nomeC, double vidaC)
    {
        super(nomeC, vidaC);
    }

    @Override
    public void emitirSom()
    {
        System.out.println("AU AU ");
    }
    
}

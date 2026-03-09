package EX6_MarioCart;

public class Kart {
    String nome;
    Motor MotorKart;

    public Kart(String nomeC)
    {
        this.nome = nomeC;
    }

    public void Pular()
    {
        System.out.println(nome + " pula");
    }

    public void SoltarTurbo()
    {
        System.out.println(nome + " solta turbo");
    }

    public void FazerDrift()
    {
        System.out.println(nome + " faz drift");
    }
}

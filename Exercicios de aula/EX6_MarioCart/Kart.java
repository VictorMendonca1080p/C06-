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
        System.out.println("Kart pula");
    }

    public void SoltarTurbo()
    {
        System.out.println("Kart solta turbo");
    }

    public void FazerDrift()
    {
        System.out.println("Kart faz drift");
    }
}

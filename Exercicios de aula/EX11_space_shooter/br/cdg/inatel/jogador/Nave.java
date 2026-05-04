package EX11_space_shooter.br.cdg.inatel.jogador;

import EX11_space_shooter.br.cdg.inatel.inimigo.Asteroide;

public class Nave {
    private String nome;
    private double vida;
    private String tipoTiro;

    public Nave(String nomeC, double vidaC, String tipoTiroC)
    {
        this.nome = nomeC;
        this.vida = vidaC;
        this.tipoTiro = tipoTiroC;
    }

    public void Atirar(Asteroide alvo)
    {
        alvo.Destruir(tipoTiro);
    }

    public double GetVida()
    {
        return this.vida;
    }

    public String GetNome()
    {
        return this.nome;
    }
}

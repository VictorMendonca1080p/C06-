package EX1a4_zumbis;

public class Zumbi {
    String nome;
    int vida;

    public Zumbi(String nomeC, int HPC) {
        this.nome = nomeC;
        this.vida = HPC;
    }

    public double Mostrar_Vida()
    {
        return vida;
    }

    public boolean Transferir_Vida(Zumbi alvo, double qtdHP)
    {
        if(alvo.vida >= 0)
        {
            alvo.vida += qtdHP;
            vida -= qtdHP;
            return true;
        }
        
        return false;
    }
}

package PCmania.ComputadorPack;

public class HardwareBasico {
    private String nome;
    private float capacidade;

    public HardwareBasico(String nomeC, float capacidadeC)
    {
        this.nome = nomeC;
        this.capacidade = capacidadeC;
    }

    public String get_nome()
    {
        return this.nome;
    }

    public float get_capacidade()
    {
        return this.capacidade;
    }
}

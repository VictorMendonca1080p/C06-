package PCmania.ComputadorPack;

public class MemoriaUSB {
    private String nome;
    private int capacidade;

    public MemoriaUSB(String nomeC, int capacidadeC)
    {
        this.nome = nomeC;
        this.capacidade = capacidadeC;
    }    

    public String get_nome()
    {
        return this.nome;
    }

    public int get_capacidade()
    {
        return this.capacidade;
    }
}

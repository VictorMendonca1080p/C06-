package PCmania.ComputadorPack;

public class SistemaOperacional {
    private String nome;
    private int tipo;

    public SistemaOperacional(String nomeC, int tipoC)
    {
        this.nome = nomeC;
        this.tipo = tipoC;
    }

    public String get_nome()
    {
        return this.nome;
    }

    public int get_tipo()
    {
        return this.tipo;
    }
}

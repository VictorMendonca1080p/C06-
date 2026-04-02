package PCmania.ClientePack;

import PCmania.ComputadorPack.Computador;

public class Cliente {
    private String nome;
    private String CPF;
    private Computador Compras[] = new Computador[3];

    public Cliente(String nomeC, String CPFC)
    {
        this.nome = nomeC;
        this.CPF = CPFC;
    }

    private int incremental = 0;
    public void AddCompra(Computador newpromocao)
    {
        Compras[incremental] = newpromocao;
        incremental++;
        System.out.println("Pedido enviado!");
    }

    public float calculaTotalCompra(int qtdcompras)
    {
        float total = 0;
        for (int i = 0; i < qtdcompras; i++) {
            total = total + Compras[i].get_preco();
        }

        return total;
    }

    public String get_nome()
    {
        return this.nome;
    }

    public String get_CPF()
    {
        return this.CPF;
    }

    public void Show_compras(int i)
    {
        Compras[i].MostrarPCconfig();
    }

}

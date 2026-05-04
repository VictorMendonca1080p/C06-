package EX12_Brownie.Comprador;

import EX12_Brownie.Brownie.Brownie_Mother;

public class Comprador {
    private String nome;
    private double saldo;


    
    public Comprador(String nomeC, double saldoC)
    {
        this.nome = nomeC;
        this.saldo = saldoC;
    }

    public void EfetuarCompra(Brownie_Mother brownie)
    {
        brownie.AddCarrinhoDeCompras();
    }

    public String GetNome()
    {
        return this.nome;
    }

    public double GetSaldo()
    {
        return this.saldo;
    }

}

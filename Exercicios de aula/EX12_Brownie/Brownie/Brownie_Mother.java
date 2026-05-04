package EX12_Brownie.Brownie;

public abstract class Brownie_Mother {
    protected String nome;
    protected double preco;
    protected String sabor;

    protected static double carrinho[] = new double[10];
    protected static int contador = 0;

    public Brownie_Mother(String nomeC, double precoC, String saborC)
    {
        this.nome = nomeC;
        this.preco = precoC;
        this.sabor = saborC;
    }

    
    public void AddCarrinhoDeCompras()
    {
        System.out.println(this.nome + " adicionado ao carrinho!");
        carrinho[contador] = this.preco;
        contador++;
    }

    public void CalculaValorTotalCompra()
    {
        double total = 0;
        for(int i = 0; i < contador; i++)
        {
            total += carrinho[i];
        }
        System.out.println("Total = ");
        System.out.print(total);
    }

    public void MostraInfo()
    {
        System.out.println("Brownie: " + this.nome);
        System.out.println("Preco: " + this.preco);
        System.out.println("Sabor: " + this.sabor);
    }


    public double get_preco()
    {
        return this.preco;
    }
}

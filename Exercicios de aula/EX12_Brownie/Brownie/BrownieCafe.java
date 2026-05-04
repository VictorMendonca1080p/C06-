package EX12_Brownie.Brownie;

public class BrownieCafe extends Brownie_Mother{
    public BrownieCafe(String nomeC, double precoC, String saborC)
    {
        super(nomeC, precoC, saborC);
    }

    @Override
    public void AddCarrinhoDeCompras() 
    {
        System.out.println("cafe adicionado");
    }
    
}

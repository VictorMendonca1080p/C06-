package EX12_Brownie.Brownie;

public class BrownieNutella extends Brownie_Mother{
    public BrownieNutella(String nomeC, double precoC, String saborC)
    {
        super(nomeC, precoC, saborC);
    }
    

   @Override
    public void AddCarrinhoDeCompras() 
    {
        System.out.println("Nutella adicionada");
    }
}

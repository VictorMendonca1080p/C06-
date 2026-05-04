package EX12_Brownie.Brownie;

public class BrownieDoceDeLeite extends Brownie_Mother{
    public BrownieDoceDeLeite(String nomeC, double precoC, String saborC)
    {
        super(nomeC, precoC, saborC);
    }
    

    @Override
    public void AddCarrinhoDeCompras() 
    {
        System.out.println("doce de leite adicionado");
    
    }
}
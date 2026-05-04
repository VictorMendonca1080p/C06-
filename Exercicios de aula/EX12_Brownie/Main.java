package EX12_Brownie;

import EX12_Brownie.Brownie.BrownieCafe;
import EX12_Brownie.Brownie.BrownieDoceDeLeite;
import EX12_Brownie.Brownie.BrownieNutella;
import EX12_Brownie.Comprador.Comprador;

public class Main {
    public static void main(String[] args) {
        BrownieCafe bc = new BrownieCafe("brownie de cafe", 10, "cafe");
        BrownieDoceDeLeite bddl = new BrownieDoceDeLeite("Brownie de doce de leite", 20, "doce de leite");
        BrownieNutella bn = new BrownieNutella("brownie nutella", 20, "nutella");

        Comprador compr = new Comprador("Bob", 1000);

        compr.EfetuarCompra(bc);
        compr.EfetuarCompra(bc);
        compr.EfetuarCompra(bc);
        compr.EfetuarCompra(bddl);
        compr.EfetuarCompra(bddl);
        compr.EfetuarCompra(bddl);
        compr.EfetuarCompra(bn);
        compr.EfetuarCompra(bn);
        compr.EfetuarCompra(bn);

        bn.CalculaValorTotalCompra();

    }
}

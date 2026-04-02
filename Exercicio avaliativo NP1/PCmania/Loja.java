package PCmania;

import PCmania.ComputadorPack.Computador;

import java.util.Scanner;

import PCmania.ClientePack.Cliente;

public class Loja 
{
    private Cliente client;
    private Computador promo[];
    public Loja(Cliente clientC, Computador promocoesC[])
    {
        this.client = clientC;
        this.promo = promocoesC;
    }

    private Scanner valor = new Scanner(System.in);
    private int escolhaPromo = -1; 
    private int escolhaCli;
    private int totalCompras = 0;
    public void SoftwareDeCompras()
    {
        while(escolhaPromo != 0 && totalCompras < 3){
            System.out.println("Bem vindo a PCmaina! qual promocao deseja escolher?");
            System.out.println("1 - 2 - 3 - sair(0)");
            escolhaPromo = valor.nextInt();
            switch (escolhaPromo) {
                case 1:
                    System.out.println("Promocao 1");

                    System.out.println("Adicionar ao carrinho? - Sim(1)/Nao(2)");
                    escolhaCli = valor.nextInt();
                    if(escolhaCli == 1)
                    {
                        client.AddCompra(promo[0]);
                        totalCompras++;
                    }
                    
                    break;
            
                case 2:

                    System.out.println("Promocao 2");

                    System.out.println("Adicionar ao carrinho? - Sim(1)/Nao(2)");
                    escolhaCli = valor.nextInt();
                    if(escolhaCli == 1)
                    {
                        client.AddCompra(promo[1]);
                        totalCompras++;
                    }

                    break;

                case 3:

                    System.out.println("Promocao 3");

                    System.out.println("Adicionar ao carrinho? - Sim(1)/Nao(2)");
                    escolhaCli = valor.nextInt();
                    if(escolhaCli == 1)
                    {
                        client.AddCompra(promo[2]);
                        totalCompras++;
                    }
                    
                    break;

                default:
                    System.out.println("Digite uma das escolhas validas");
                    break;
            }

        };

        System.out.println("finalizando a compra, confira seus dados");
        System.out.println("Nome do comprador: "+ client.get_nome() + " - CPF: " + client.get_CPF());
        
        for(int i = 0; i < totalCompras; i++)
        {
            System.out.println("Produto " + (i+1));
            client.Show_compras(i);
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Total da compra = " + client.calculaTotalCompra(totalCompras) + " Quanzas ");


    }
}

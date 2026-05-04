package EX9_campo_minado;

import java.util.Scanner;

public class Jogador {
    
    int posicaoI;
    int posicaoJ;

    Scanner entrada = new Scanner(System.in);
    
    public void Select()
    {
        System.out.println("digite a posicao I que deseja ir");
        posicaoI = entrada.nextInt();
        System.out.println("digite a posicao J que deseja ir");
        posicaoJ = entrada.nextInt();
    }

}

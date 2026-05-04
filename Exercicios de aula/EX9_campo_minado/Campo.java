package EX9_campo_minado;

import java.util.Random;

public class Campo {
    boolean Campo [][] = new boolean[2][2];

    Jogador player;
    
    boolean perdeu = false;

    Random RNG = new Random();

    public void RestartGame()// nao funciona
    {
        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                Campo[i][j] = false;
            }
        }
    }
    
    public void StartGame()
    {
        int Ibomb = RNG.nextInt(2);
        int Jbomb = RNG.nextInt(2);
        //System.out.println("casas " + Ibomb + Jbomb);

        Campo [Ibomb][Jbomb] = true;

        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                System.out.println("casa " + i + " " + j);
            }
        }

        do
        {
            player.Select();
         
            if(Campo[player.posicaoI][player.posicaoJ] == true)
            {
                perdeu = true;
                System.out.println("voce pisou em uma bomba!");    
            }
            else
            {
                System.out.println("voce ganhou");
                perdeu = false;
            }  
        }while(perdeu == true);
    }


}

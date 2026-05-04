package EX11_space_shooter;

import EX11_space_shooter.br.cdg.inatel.inimigo.Asteroide;
import EX11_space_shooter.br.cdg.inatel.jogador.Nave;

public class Main{
        public static void main(String[] args) {
            Nave player1 = new Nave("xeex-movel", 100, "Grande");
            Nave player2 = new Nave("xUUx-movel", 100, "Pequeno");

            Asteroide ast1 = new Asteroide("jeferssom", "Grande");
            Asteroide ast2 = new Asteroide("jeferssom2", "Pequeno");

            player1.Atirar(ast1);
            player1.Atirar(ast2);
            player2.Atirar(ast1);
            player2.Atirar(ast2);
        
    
    }
}


package EX9_campo_minado;

public class Main {
    public static void main(String[] args) {
        Campo Game = new Campo();
        Jogador jogador = new Jogador();

        Game.player = jogador;

        Game.RestartGame();
        Game.StartGame();
    }
}

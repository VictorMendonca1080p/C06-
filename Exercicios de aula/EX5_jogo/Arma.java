package EX5_jogo;

public class Arma {
    String nome;
    int poder;
    int resistencia;
    String descricao = "none";

    public Arma(String nomeC, int poderC, int resistC)
    {
        this.nome = nomeC;
        this.poder = poderC;
        this.resistencia = resistC;
    }

    public void MostrarInfo()
    {
        System.out.println("nome: " + nome);
        System.out.println("poder: " + poder);
        System.out.println("resistencia: " + resistencia);
        
        if(descricao != "none")
        {
            System.out.println("descricao: " + descricao);
        }
    }

}

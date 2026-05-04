package EX11_space_shooter.br.cdg.inatel.inimigo;

public class Asteroide {
    private String nome;
    private String tipo;

    public Asteroide(String nomeC, String tipoC)
    {
        this.nome = nomeC;
        this.tipo = tipoC;
    }

    public void Destruir(String tiroNave)
    {
        if(tipo == tiroNave)
        {
            System.out.println("asteroide "+ nome + " destruido");
        }
        else
        {
            System.out.println("seu tiro "+ tiroNave + " nao e paril para o asteroide "+ tipo);
        }
    }



}

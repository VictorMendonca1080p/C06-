package Ex8_Banda;

import java.util.ArrayList;

public class Banda {
    String nome;
    String genero;

    Empresario dono;
    ArrayList<Membro> integrantes = new ArrayList<Membro>();
    ArrayList<Musica> album = new ArrayList<Musica>();

    public Banda(String nomeC, String generoC){
        this.nome = nomeC;
        this.genero = generoC;
    }

    public void Addmembro(Membro newMembro)
    {
        integrantes.add(newMembro);
    }

    public void Addmusica(Musica newMusica)
    {
        album.add(newMusica);
    }

    public void mostraInfo()
    {
        System.out.println("nome da banda: " + nome);
        System.out.println("genero banda: " + genero);
        System.out.println("dono: " + dono.nome);

        System.out.println("membros: ");
        for (Membro membro : integrantes) {
            System.out.println(membro.nome);
            System.out.println(membro.funcao);
        }

        System.out.println("musicas: ");
        for (Musica musica : album) {
            System.out.println(musica.nome);
        }
    }

}

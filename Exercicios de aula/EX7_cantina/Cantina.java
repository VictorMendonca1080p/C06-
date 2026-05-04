package EX7_cantina;

public class Cantina {
    String nome;
    Salgado menu[] = new Salgado[3];
    int ID = 0;

    public Cantina(String nomeC){
        this.nome = nomeC;
    }

    public void AddSalgado(Salgado newSalgado) {
        menu[ID] = newSalgado;
        ID++;
    }

    public void MostrarInfo(){
        for (Salgado salgado : menu) {
            System.out.println(salgado.nome);
        }
    }
}

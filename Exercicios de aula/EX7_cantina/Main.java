package EX7_cantina;

public class Main {
    public static void main(String[] args) {
        Cantina bar = new Cantina("BAr do ze");

        Salgado salga1 = new Salgado("coxinha");
        Salgado salga2 = new Salgado("Kibe");
        Salgado salga3 = new Salgado("X-tudo");

        bar.AddSalgado(salga1);
        bar.AddSalgado(salga2);
        bar.AddSalgado(salga3);

        bar.MostrarInfo();

    }
      
}

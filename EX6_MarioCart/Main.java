package EX6_MarioCart;

public class Main {
    public static void main(String[] args) {

        Piloto Pilot1 = new Piloto("Jaum");
        Pilot1.KartPiloto = new Kart("SIUUUU - movel");
        Pilot1.KartPiloto.MotorKart = new Motor(150, 150);

        Piloto Pilot2 = new Piloto("Gerso");
        Pilot2.KartPiloto = new Kart("tchan - movel");
        Pilot2.KartPiloto.MotorKart = new Motor(100, 100);

        Piloto Pilot3 = new Piloto("Ze");
        Pilot3.KartPiloto = new Kart("yahoo.com - movel");
        Pilot3.KartPiloto.MotorKart = new Motor(50, 50);

        /* Teste de erro intencional
        Piloto Pilot4 = new Piloto("Cara do sistems of a dawn");
        Pilot4.KartPiloto = new Kart("sistems of a down - movel");
        Pilot4.KartPiloto.MotorKart = new Motor(120, 130);
        */

        Pilot1.SoltarSuperPoder();

        Pilot1.KartPiloto.Pular();
        Pilot1.KartPiloto.FazerDrift();
        Pilot1.KartPiloto.SoltarTurbo();

        Pilot1.KartPiloto.MotorKart.mostratInfo();


    }
}

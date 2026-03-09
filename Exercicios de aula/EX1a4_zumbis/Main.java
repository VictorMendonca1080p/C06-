package EX1a4_zumbis;

public class Main {
    public static void main(String[] args) {
        //EX1
        Zumbi Z1 = new Zumbi("Jonas", 100);
        Zumbi Z2 = new Zumbi("Bruno", 200);

        System.out.println(Z1.Mostrar_Vida());
        System.out.println(Z2.Mostrar_Vida());
        
        Z1.Transferir_Vida(Z2,20);

        System.out.println(Z1.Mostrar_Vida());
        System.out.println(Z2.Mostrar_Vida());

        //EX2
        /* 
        Z1 = Z2;

        System.out.println(Z1.Mostrar_Vida());
        System.out.println(Z2.Mostrar_Vida());
        */
    }
}

import java.util.Scanner;

public class EX_2 {
    public static void main(String[] args) {
        Scanner KbordValue = new Scanner(System.in);

        //lendo
        System.out.println("nota NP1 = ");
        int NP1 = KbordValue.nextInt();
        System.out.println("nota NP2 = ");
        int NP2 = KbordValue.nextInt();
        
        int NPA = (NP1 + NP2)/2;

        if(NPA >= 60)
        {
            System.out.println("passou");
        }
        else if(NPA == 50)
        {
            System.out.println("Ficou de NP3");
            System.out.println("informe a nota da NP3");
            int NP3 = KbordValue.nextInt();
            int NPF = (NPA + NP3)/2;
            if(NPF >= 60)
            {
                System.out.println("passou raspando");
            }
            else
            {
                System.out.println("cabo fi");
            }

        }
        else
        {
            System.out.println("se fudeu");
        }

        KbordValue.close();


        
        
    }
}

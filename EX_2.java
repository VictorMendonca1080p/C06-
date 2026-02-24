import java.util.Scanner;

public class EX_2 {
    public static void main(String[] args) {
        Scanner KbordValue = new Scanner(System.in);

        //lendo
        System.out.println("nota NPA = ");
        int NPA = KbordValue.nextInt();
        
        

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

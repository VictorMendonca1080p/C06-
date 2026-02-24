import java.util.Scanner;
//
/* Essa é a main em .java*/

public class EX_1 {
    public static void main(String[] args) {
        //scanner
        Scanner KbordValue = new Scanner(System.in);
        //lendo
        System.out.println("valor 1 = ");
        int lanche1 = KbordValue.nextInt();
        System.out.println("valor 2 = ");
        int lanche2 = KbordValue.nextInt();
        System.out.println("valor 3 = ");
        int lanche3 = KbordValue.nextInt();
        KbordValue.close();
        
        int total = (lanche1 + lanche2 + lanche3);
        float media = total/3;

        System.out.println("valor final = " + media);
        
    }
}

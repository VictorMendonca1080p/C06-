import java.util.Scanner;

public class EX_3{
    public static void main(String[] args){

        Scanner KbordValue = new Scanner(System.in);

        System.out.println("numero de alunos:");
        int QtdAlunos = KbordValue.nextInt();


        switch (QtdAlunos) {
            case 10:
                System.out.println("Sala I-16");
                break;
            case 20:
                System.out.println("Sala I-16");
                break;
            case 30:
                System.out.println("Sala I-22");
                break;
        
            default:
                System.out.println("Da nao");
                break;
        }
        KbordValue.close();
    }
}
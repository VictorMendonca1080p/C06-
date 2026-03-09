package EX6_MarioCart;

public class Motor {
    int cilindradas;
    float velocidadeMax;

    public Motor(int cilinC, float veloC)
    {
        switch (cilinC) {
            case 50:
                if(veloC <= 50)
                {
                    this.cilindradas = cilinC;
                    this.velocidadeMax = veloC;
                }
                else
                {
                    System.err.println("Erro velocidade deve ser <= cilindradas");
                }
                break;

            case 100:
                if(veloC <= 100)
                {
                    this.cilindradas = cilinC;
                    this.velocidadeMax = veloC;
                }
                else
                {
                    System.err.println("Erro velocidade deve ser <= cilindradas");
                }
                break;
            case 150:
                if(veloC <= 150)
                {
                    this.cilindradas = cilinC;
                    this.velocidadeMax = veloC;
                }
                else
                {
                    System.err.println("Erro velocidade deve ser <= cilindradas");
                }
                break;
                
            default:
                System.err.println("Erro, cilindradas podem apenas ser 50, 100 ou 150");
                break;
        }
    }

    public void mostratInfo()
    {
        System.out.println("cilindradas: " + cilindradas);
        System.out.println("velocidade maxima: " + velocidadeMax);
    }


}

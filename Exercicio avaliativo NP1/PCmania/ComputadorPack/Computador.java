package PCmania.ComputadorPack;

//import PCmania.ClientePack.Cliente;

public class Computador {

    //Cliente a = new Cliente();

    private String marca;
    private float preco;
    private MemoriaUSB memoriaPC;
    private HardwareBasico hardwarePC;
    private SistemaOperacional OPsisPC;

    public Computador(String marcaC, float precoC, HardwareBasico hardware, SistemaOperacional OPsis)
    {
        this.marca = marcaC;
        this.preco = precoC;
        this.hardwarePC = hardware;
        this.OPsisPC = OPsis;
    }
    
    public void AddMemoriaUSB(MemoriaUSB newMemoria)
    {
        memoriaPC = newMemoria;
    }

    public void MostrarPCconfig()
    {
        System.out.println("Computador:");
        System.out.println("Marca: " + marca);
        System.out.println("Preco: " + preco);

        System.out.println("Hardware:");
        System.out.println(hardwarePC.get_nome() );
        System.out.println("Capacidade: " + hardwarePC.get_capacidade() + "G");

        System.out.println("Sistema operacional:");
        System.out.println(OPsisPC.get_nome());
        System.out.println("Tipo: " + OPsisPC.get_tipo());

        System.out.println("Memoria:");
        System.out.println(memoriaPC.get_nome());
        System.out.println("Capacidade: " + memoriaPC.get_capacidade());




    }

    public float get_preco()
    {
        return this.preco;
    }
}

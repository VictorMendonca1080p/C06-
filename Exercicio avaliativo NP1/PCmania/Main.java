package PCmania;

import PCmania.ClientePack.Cliente;
import PCmania.ComputadorPack.Computador;
import PCmania.ComputadorPack.HardwareBasico;
import PCmania.ComputadorPack.MemoriaUSB;
import PCmania.ComputadorPack.SistemaOperacional;

public class Main
{
    public static void main(String[] args) {
        //promoção 1
        SistemaOperacional sist1 = new SistemaOperacional("macOS Sequioa", 64);
        MemoriaUSB memo1 = new MemoriaUSB("Pen-drive", 16);
        HardwareBasico hardw1 = new HardwareBasico("Pentium Core i3 8G de RAM", 500);
        Computador comp1 = new Computador("Apple", 544, hardw1, sist1);
        comp1.AddMemoriaUSB(memo1);

        //promoção 2
        SistemaOperacional sist2 = new SistemaOperacional("Windows 8", 64);
        MemoriaUSB memo2 = new MemoriaUSB("Pen-drive", 32);
        HardwareBasico hardw2 = new HardwareBasico("Pentium Core i5 16G de RAM", 1000);
        Computador comp2 = new Computador("Sansung", 1778, hardw2, sist2);
        comp2.AddMemoriaUSB(memo2);

        //promoção 3
        SistemaOperacional sist3 = new SistemaOperacional("Windows 10", 64);
        MemoriaUSB memo3 = new MemoriaUSB("HD externo", 1000);
        HardwareBasico hardw3 = new HardwareBasico("Pentium Core i7 32G de RAM", 2000);
        Computador comp3 = new Computador("Dell", 6222, hardw3, sist3);
        comp3.AddMemoriaUSB(memo3);

        Computador promocoes[] = new Computador[3];
        promocoes[0] = comp1;
        promocoes[1] = comp2;
        promocoes[2] = comp3;

        Cliente cli1 = new Cliente("Victor", "1234567890");

        Loja PCmania = new Loja(cli1, promocoes);
        
        PCmania.SoftwareDeCompras();




    }
}
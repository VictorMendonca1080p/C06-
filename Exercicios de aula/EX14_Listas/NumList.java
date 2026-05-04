package EX14_Listas;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;


public class NumList {

    public List<Double> Lista = new ArrayList<Double>();

    Random RNG = new Random();
    Double rngNum;

    public void PreencherLista(int tamanho) {
         
        for(int i = 0; i < tamanho; i++)
        {
            rngNum = RNG.nextDouble(tamanho);
            Lista.add(rngNum);
        }

    }

    public void organizarLista()
    {
        Collections.sort(Lista);
    }

    public void mostrarLista()
    {
        for (Double objeto : Lista) {
            System.out.println(objeto.doubleValue());
        }
    }

}
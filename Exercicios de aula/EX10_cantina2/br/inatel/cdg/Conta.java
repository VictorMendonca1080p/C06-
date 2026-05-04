package EX10_cantina2.br.inatel.cdg;

import java.util.ArrayList;

public class Conta {
    private int numero;
    private float saldo;
    private float limite;

    public ArrayList<Cliente> clientes;

    public Conta(int numeroC, float saldoC, float limiteC)
    {
        this.numero = numeroC;
        this.saldo = saldoC;
        this.limite = limiteC;
        clientes = new ArrayList<>();
    }

    public float get_numero()
    {
        return this.numero;
    }


    public float get_saldo()
    {
        return this.saldo;
    }

    private void Add_saldo(float quantia)
    {
        this.saldo += quantia;
    }


    public float get_limite()
    {
        return this.limite;
    }



    public void Sacar(float quantia)
    {
        if(quantia <= get_saldo())
        {
            this.saldo -= quantia;
            System.out.println(quantia + "R$ foram sacados da sua conta");
        }
        else
        {
            System.out.println("Saldo insuficiente");
        }
    }
    


    public void Depositar(float quantia)
    {
          if(quantia <= get_limite())
        {
            Add_saldo(quantia);
            System.out.println(quantia + "R$ foram adicionados a sua conta");
        }
        else
        {
            System.out.println("Limite insuficiente da conta");
        }
    }

}

package EX10_cantina2;

import EX10_cantina2.br.inatel.cdg.Cliente;
import EX10_cantina2.br.inatel.cdg.Conta;

public class Main {
    public static void main(String[] args) {
        Cliente cli1 = new Cliente();
        cli1.set_cpf(57579705);
        cli1.set_nome("Jaum");

        Conta conta1 = new Conta(123, 500, 1500);
        conta1.clientes.add(cli1);

        conta1.Depositar(500);
        conta1.Sacar(3000);
        conta1.Depositar(5000);
        conta1.Sacar(300);
        conta1.Depositar(500);





    }
    
}

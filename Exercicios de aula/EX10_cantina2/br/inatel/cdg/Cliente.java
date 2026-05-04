package EX10_cantina2.br.inatel.cdg;

public class Cliente {
    private String nome;
    private long cpf;

    public String get_nome(){
        return this.nome;
    }

    public void set_nome(String newName){
        this.nome = newName;
    }



    public long get_cpf(){
        return this.cpf;
    }
    public void set_cpf(long newCpf){
        this.cpf = newCpf;
    }
}

package Array;

public class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica(String nome, int idade){
        super(nome, idade);
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getCpf(){
        return cpf;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "cpf='" + cpf + '\'' +
                '}';
    }
}

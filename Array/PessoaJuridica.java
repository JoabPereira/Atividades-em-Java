package Array;

public class PessoaJuridica extends Pessoa{
    private String cnpj;

    public PessoaJuridica(String nome,int idade){
        super(nome,idade);
    }

    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }

    public String getCnpj(){
        return cnpj;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "cnpj='" + cnpj + '\'' +
                '}';
    }
}

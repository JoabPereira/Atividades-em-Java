package Array;

import java.util.ArrayList;

public class CadastroPessoa {
    private ArrayList<PessoaFisica> pessoasf = new ArrayList<>();
    private ArrayList<PessoaJuridica> pessoaJuridicas = new ArrayList<>();

    public void CadastrarPessoaF(PessoaFisica pf){
        pessoasf.add(pf);
        System.out.println("Pessoa cadastrada com sucesso!");
    }

    public void listaF(){
        for (PessoaFisica p : pessoasf){
            System.out.println("Nome: "+ p.getNome()+ " idade: "+ p.getIdade());
        }

    }

        public void listapolimorficos(){

        ArrayList<Pessoa>pessoasPolimorficas = new ArrayList<>();

        pessoasPolimorficas.add(pessoasf);


        for (Pessoa p : pessoasPolimorficas){
            if (p instanceof PessoaFisica){
                System.out.println("Nome: "+ p.getNome() + ", Idade: " + p.getIdade() + ", cpf: "+ ((PessoaFisica)p).getCpf());

            } else {
                System.out.println("Pessoa não identificada");
            }
        } 

    }

}

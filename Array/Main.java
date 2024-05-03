package Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);


    CadastroPessoa cp = new CadastroPessoa();

    int r;

    do {
        Pessoa p = new Pessoa("", 0);
        PessoaJuridica pj = new PessoaJuridica("", 0);
        PessoaFisica pf = new PessoaFisica("", 0);

        System.out.println("Digite 1 para Cadastrar Pessoa Juridica, 2 para Cadastrar Pessoa Fisica:");
        int x = sc.nextInt();
        switch (x){
            case 1:
                System.out.println("Digite o nome da Pessoa Juridica:");
                pj.setNome(sc.next());
                System.out.println("Digite a idade da pessoa juridica:");
                pj.setidade(sc.nextInt());
                System.out.println("Digite o cnpj:");
                pj.setCnpj(sc.next());
        //        cp.CadastrarPessoaF(pj);

                break;
            case 2:
                System.out.println("Digite o nome da Pessoa fisica:");
                pf.setNome(sc.next());
                System.out.println("Digite a idade da pessoa fisica:");
                pf.setidade(sc.nextInt());
                System.out.println("Digite o cpf:");
                pf.setCpf(sc.next());
                cp.CadastrarPessoaF(pf);
                break;
        }

        cp.listapolimorficos();


        System.out.println("Para cadastrar novamente digite 0:");
        r = sc.nextInt();
    }while (r == 0);

    }
}

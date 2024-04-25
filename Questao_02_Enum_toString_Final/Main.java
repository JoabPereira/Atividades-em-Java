package Questao_02_Enum_toString_Final;


public class Main {
    public static void main(String[] args){
        Livro l = new Livro("The News",59.99,TipoProduto.LIVRARIA);
        Eletronico e = new Eletronico("Tv Smart", 1500.00,TipoProduto.ELETRONICO);
        Roupa r = new Roupa("Camisa",99.90,TipoProduto.VESTUARIO);
        Polimorfismo p = new Polimorfismo();

       // l.desconto10();
        //e.desconto5();
        //r.Roupas();

        //Polimorfismo
        p.Eletronic(e);
        p.Livro(l);
        p.Roupa(r);
    }
}

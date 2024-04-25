package Questao_02_Enum_toString_Final;

public class Livro extends Produtos implements LivroDescont{
    public Livro(String nome,double preço,TipoProduto tipo){
        super(nome,preço, tipo);
    }
    @Override
    public void desconto10(){
        System.out.println("Livro: "+nome+","+" preço: " + preço +" reais"+ ","+" voçê ganhou: " + preço*10/100 + " de desconto.");
    }
}

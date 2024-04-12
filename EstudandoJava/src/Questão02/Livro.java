package Questão02;

public class Livro extends Produtos implements LivroDescont{
    public Livro(String nome,double preço){
        super(nome,preço);
    }
    @Override
    public void desconto10(){
        System.out.println("Livro: "+nome+","+" preço: " + preço +" reais"+ ","+" voçê ganhou: " + preço*10/100 + " de desconto.");
    }
}

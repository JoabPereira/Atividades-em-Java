package Questao_02_Enum_toString_Final;

public class Eletronico extends Produtos implements EletronicDesconto{
    public Eletronico(String nome,double preço, TipoProduto tipo){
        super(nome,preço,tipo);
    }
    @Override
    public void desconto5(){
        System.out.println("Elétronico: "+nome + ","+" preço: " + preço +" reais"+ "," +  " você ganhou " + preço*5/100 + " de desconto.");
    }

}

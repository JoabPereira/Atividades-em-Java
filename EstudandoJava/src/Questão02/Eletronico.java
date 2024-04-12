package Questão02;

public class Eletronico extends Produtos implements EletronicDesconto{
    public Eletronico(String nome,double preço){
        super(nome,preço);
    }
    @Override
    public void desconto5(){
        System.out.println("Elétronico: "+nome + ","+" preço: " + preço +" reais"+ "," +  " você ganhou " + preço*5/100 + " de desconto.");
    }

}

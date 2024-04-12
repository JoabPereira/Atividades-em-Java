package Questão02;

public class Roupa extends Produtos{
    public Roupa(String nome,double preço){
        super(nome,preço);
    }

    public void Roupas(){
        System.out.println("Roupa: "+nome + " custa " +"," + preço +" reias.");
    }
}

package Questão02;

public class Main {
    public static void main(String[] args){
        Livro l = new Livro("The News",59.99);
        Eletronico e = new Eletronico("Tv Smart", 1500.00);
        Roupa r = new Roupa("Camisa",99.90);

        l.desconto10();
        e.desconto5();
        r.Roupas();
    }
}

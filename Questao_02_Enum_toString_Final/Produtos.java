package Questao_02_Enum_toString_Final;

public abstract class Produtos {
    protected String nome;
    protected double preço;

    private final TipoProduto tipo;
    public Produtos(String nome,double preço,TipoProduto tipo){
        super();
        this.nome = nome;
        this.preço =preço;
        this.tipo = tipo;
    }


    @Override
    public String toString() {
        return "Produtos{" +
                "nome='" + nome + '\'' +
                ", preço=" + preço +
                '}';
    }
    public TipoProduto getTipo() {
        return tipo;
    }
}

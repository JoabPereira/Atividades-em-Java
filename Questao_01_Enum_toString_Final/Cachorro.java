package Questao_01_Enum_toString_Final;

public final class Cachorro extends Animal implements Som {
    public Cachorro(String nome, TipoAnimal tipo){
        super(nome,tipo);

    }

    @Override
    public void emitirSom(){
        System.out.println(nome + " cachorro: " + " Lati");
    }



}
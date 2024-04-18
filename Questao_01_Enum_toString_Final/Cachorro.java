package Questao_01_Enum_toString_Final;

import Questao_01_Enum_toString_Final.TipoAnimal;

public final class Cachorro extends Animal implements Animais {
    public Cachorro(String nome, TipoAnimal tipo){
        super(nome,tipo);

    }

    @Override
    public void emitirSom(){
        System.out.println(nome + " cachorro: " + " Lati");
    }



}
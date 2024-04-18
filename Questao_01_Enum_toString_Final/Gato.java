package Questao_01_Enum_toString_Final;

import Questao_01_Enum_toString_Final.TipoAnimal;

public class Gato extends Animal implements Animais {
    public Gato(String nome, TipoAnimal tipo){
        super(nome,tipo);
    }

    @Override
    public void emitirSom(){
        System.out.println(nome + " gato: "+" Mia");
    }
}
package Questao_01_Enum_toString_Final;

import Questao_01_Enum_toString_Final.TipoAnimal;
import Questao_01_Enum_toString_Final.Vaor;

public class Passaro extends Animal implements Vaor {
    public Passaro(String nome, TipoAnimal tipo){

        super(nome,tipo);
    }

    @Override
    public void Voar(){
        System.out.println(nome + " passaro: "+" Vaondo");
    }
}
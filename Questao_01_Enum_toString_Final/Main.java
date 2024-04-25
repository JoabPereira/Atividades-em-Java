package Questao_01_Enum_toString_Final;

import Questao_01_Enum_toString_Final.Passaro;
import Questao_01_Enum_toString_Final.TipoAnimal;

public class Main {
    public static void main(String[] args){
        Gato gato = new Gato("Francisco", TipoAnimal.MAMIFERO);
        Cachorro cachorro = new Cachorro("Toin",TipoAnimal.MAMIFERO);
        Passaro passaro = new Passaro("Pica pau",TipoAnimal.AVE);
        Polimorfismos p = new Polimorfismos();

        gato.emitirSom();
        cachorro.emitirSom();
        //passaro.Voar();

        //Polimorfismo
        p.Voar(passaro);
    }
}
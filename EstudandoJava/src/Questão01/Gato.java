package Questão01;

import Questão01.Animal;
import Questão01.Correr;

public class Gato extends Animal implements Som, Correr {
    public Gato(String nome){
        super(nome);
    }
    @Override
    public void emitirSom(){
        System.out.println(nome + " é um gato ele " + " Miau");
    }

    @Override
    public void Correr(){
        System.out.println("agora estou correrndo.");
    }

}

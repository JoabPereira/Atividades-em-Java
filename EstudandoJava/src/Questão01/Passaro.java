package Questão01;

import Questão01.Animal;

public class Passaro extends Animal implements Voar, Som {
    public Passaro(String nome){
        super(nome);
    }
    @Override
    public void emitirSom(){
        System.out.println(nome + " é um passaro "+" Piu Piu,");
    }

    @Override
    public void Voar(){
        System.out.println("e agora estou voando.");
    }


}

package Questão01;

import Questão01.Animal;

public class Cachorro extends Animal implements Som, Correr {
    public Cachorro(String nome){
        super(nome);
    }
@Override
    public void emitirSom(){
        System.out.println(nome + " é um cachorro " + " Au Au");
    }

    @Override
    public void Correr(){
        System.out.println("estou correndo.");
    }
}

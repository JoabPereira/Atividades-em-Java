package Questao_01_Enum_toString_Final;

import Questao_01_Enum_toString_Final.TipoAnimal;

public abstract class Animal {
    String nome;
    public Animal(String nome, TipoAnimal tipo){
        this.nome = nome;
        this.tipo = tipo;

    }
 @Override
    public String toString(){
        return "Questao_01_Enum_toString_Final.Animal{" +
            "nome"+nome;
     }

    private final TipoAnimal tipo;

    public TipoAnimal getTipo(){
        return tipo;
    }
 }

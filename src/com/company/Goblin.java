package com.company;

public class Goblin extends klasa {

    public Goblin(){ }
    public Goblin(double Hp, double Str, double intelligence){
        super(Hp, Str, intelligence);
    }

    void pierwszeStarcie(){
        System.out.println("Napotykasz Goblina nie wygląda na silnego ale źle mu z oczu patrzy:/n UWAGA Goblin oddaje krytycznie!");
    }
    void goblinDie(){
        System.out.println("Goblin nie zyje idziemy dalej!");
    }

    @Override
    protected void opis() {

    }
}
//g
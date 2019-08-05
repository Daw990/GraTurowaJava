package com.company;

public class Czarodziej extends klasa {

    public int licznikPodpalenia = 0;

    public Czarodziej(){ }
    public Czarodziej(double Hp, double Str, double intelligence, int skill1, int skill2){

        super(Hp, Str, intelligence, skill1, skill2);

    }

    @Override
    protected void opis() {
        System.out.println("Wszystkie swoje umiejętnosci nabrał podczas wieloletniego szkolnictwa w HOGWARCIE najsilniejszy" +
                "z czarów: Pyroblast! cechuje go mądrość");
    }
}

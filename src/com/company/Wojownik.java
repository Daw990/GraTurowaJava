package com.company;

public class Wojownik extends klasa {

    Wojownik(){ }
    Wojownik(double Hp, double Str, double intelligence, int skill1, int skill2){

        super(Hp, Str, intelligence, skill1, skill2);
    }


    protected void opis(){
        System.out.println("Wybrałeś/aś Wojownika ! szkolony przez najwybitniejszych nauczycieli sztuk władania orężem." +
                "" +
                "najsilniejszy atak: Whirldwind cechuje go siła i wytrzymałość");
    }

}

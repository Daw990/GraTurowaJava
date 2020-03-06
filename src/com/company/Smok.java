package com.company;

import jdk.swing.interop.SwingInterOpUtils;

public class Smok extends klasa {

    Smok(){ }
    Smok(double Hp, double Str, double intelligence, int licznikSkill1, int licznikSkill2){

        super(Hp, Str, intelligence, licznikSkill1, licznikSkill2);
    }

    void SmokDie(){
        System.out.println("Brawo zabiłeś Smoka!");
    }

    void SmokUltimate(){
        System.out.println("BOSS ULTIMATE!! Wzbijając sie w powietrze zadaje 150pkt obrazen!");
    }

    void SmokUltimateOdbite(){
        System.out.println("Ogroma Kula ognia odbija sie od potężnego zaklęcia czarodzieja! i uderza w prost w jej właścicieala zadajac 150 obrażeń!");
    }

    double UltiSmok(double dmg){
        return dmg;
    }

    @Override
    protected void opis() {
        System.out.println("BOSS! Napotykasz na swojej drodze Ogromnego Smoka! wielkie jak twoj miecz kły, łuski grube niczym mur, do boju!" +
                "UWAGA!! CO 3 TURA SPECJALNY ATAK SMOKA! SMOK TEZ ATAKUJE KRYTYCZNIE!");
        System.out.println("UWAGA!! PRZY BOSSIE ATAKI SPECJALNE ODNAWIAJA SIE CO 3 TURY");
    }
}

package com.company;

import jdk.swing.interop.SwingInterOpUtils;

public class Smok extends klasa {

    Smok(){ }
    Smok(double Hp, double Str, double intelligence, int licznikWhirlwind, int licznikShieldBash){

        super(Hp, Str, intelligence, licznikWhirlwind, licznikShieldBash);
    }

    void SmokDie(){
        System.out.println("Brawo zabiłeś Smoka!");
    }

    void SmokUltimate(){
        System.out.println("BOSS ULTIMATE!! Wzbijając sie w powietrze zadaje 150pkt obrazen!");
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

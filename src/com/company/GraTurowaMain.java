package com.company;

public class GraTurowaMain {

    public void startGame1(){

        wprowadz wprowadz1 = new wprowadz();

        klasa wojownik1 = new Wojownik(600, 15, 2,0, 0);
        klasa czarodziej1 = new Czarodziej(600,4, 15,0,0);

        klasa szkielet1 = new Szkielet(200, 5,1);
        klasa goblin1 = new Goblin(300, 9, 2);
        klasa smok1 = new Smok(600, 28, 8,0,0);


        WalkaCzarodziej walkaCzarodziej1 = new WalkaCzarodziej();
        WalkaWojownik walkaWojownik1 = new WalkaWojownik();

        wprowadz1.opis();

        if(wprowadz1.getWyborPostaci() == 1) {
            walkaCzarodziej1.walkaCzarodziejSzkielet(czarodziej1, szkielet1, wprowadz1);
            walkaCzarodziej1.walkaCzarodziejGoblin(czarodziej1, goblin1, wprowadz1);
            walkaCzarodziej1.walkaCzarodziejSmokBoss(czarodziej1, smok1, wprowadz1);
        }else if(wprowadz1.getWyborPostaci() == 2){
            walkaWojownik1.walkaWojownikSzkielet(wojownik1, szkielet1, wprowadz1);
            walkaWojownik1.walkaWojownikGoblin(wojownik1, goblin1, wprowadz1);
            walkaWojownik1.walkaWojownikSmokBoss(wojownik1, smok1, wprowadz1);
        }
    }
}

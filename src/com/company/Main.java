package com.company;

public class Main {

    public static void main(String[] args) {

        klasa czarodziej1 = new Czarodziej(600,4, 15,0,0);
        wprowadz wprowadz1 = new wprowadz();
        klasa szkielet1 = new Szkielet(200, 5,1);
        klasa goblin1 = new Goblin(300, 9, 2);
        klasa smok1 = new Smok(600, 28, 8,0,0);

        WalkaCzarodziej walkaCzarodziej1 = new WalkaCzarodziej();

        walkaCzarodziej1.walkaCzarodziejSzkielet(czarodziej1, szkielet1, wprowadz1);
        walkaCzarodziej1.walkaCzarodziejGoblin(czarodziej1, goblin1, wprowadz1);
        walkaCzarodziej1.walkaCzarodziejSmokBoss(czarodziej1, smok1, wprowadz1);

    }
}

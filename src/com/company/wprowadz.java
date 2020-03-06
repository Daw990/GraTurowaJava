package com.company;

import java.util.Scanner;

public class wprowadz extends klasa {
    Scanner scan = new Scanner(System.in);

    int wyborPostaci;

    @Override
    public void opis() {

        System.out.println("Witaj w tym piekielnym miejscu!");
        System.out.println("Wybierz Postać ktorą chciałbyś przejść przez Koszmar!");
        System.out.println("1. Czarodziej");
        System.out.println("2. Wojownik");

        while(true) {
            try{
                wyborPostaci = scan.nextInt();

                if(wyborPostaci==1 || wyborPostaci==2)
                    break;
                else System.out.println("Podaj poprawną wartość!");
            }
            catch(java.util.InputMismatchException e){
                System.out.println("podaj cyfrę!");
                scan.nextLine();
            }
        }
    }

    int wyborAtaku;
    public void opisSkillsWojownik(){
        System.out.println("1. Zwykły atak, OBRAZENIA: Siła *2, 50% na krytyczne uderzenie Siła x4");
        System.out.println("2. Whirlwind 'raz na turę', OBRAZENIA: 50 + Siła*2");
        System.out.println("3. Shield Bash 'raz na turę' ogłusza przeciwnika na 1 kolejkę i zadaje OBRAZENIA: (Siła *2)+10");

        while(true) {
            try{
                wyborAtaku = scan.nextInt();

                if(wyborAtaku==1 || wyborAtaku==2 || wyborAtaku==3)
                    break;
                else System.out.println("Podaj poprawną wartość!");
            }
            catch(java.util.InputMismatchException e){
                System.out.println("podaj cyfrę!");
                scan.nextLine();
            }
        }
    }

    public void opisSkillsCzarodziej(){
        System.out.println("1. Zwykły atak");
        System.out.println("2. Pyroblast 'raz na turę' OBRAŻENIA: 30 + 3*inteligencja. Dodatkowo podpala przeciwnika i " +
                "zadaje mu 2*inteligencja przez 2 kolejne tury");
        System.out.println("3. IceBlock 'raz na turę' Zamieniasz sie w bryłę lodu, po ataku przeciwnika oddajesz mu " +
                "równowartość obrażeń!");

        while(true) {
            try{
                wyborAtaku = scan.nextInt();

                if(wyborAtaku==1 || wyborAtaku==2 || wyborAtaku==3)
                    break;
                else System.out.println("Podaj poprawną wartość!");
            }
            catch(java.util.InputMismatchException e){
                System.out.println("podaj cyfrę!");
                scan.nextLine();
            }
        }
    }
    public int getWyborPostaci(){
        return wyborPostaci;
    }
    public int getWyborAtaku(){return wyborAtaku;}
}

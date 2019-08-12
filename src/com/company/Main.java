package com.company;

public class Main {

    public static void main(String[] args) {

        wprowadz wprowadz1 = new wprowadz();
        klasa Czarodziej1 = new Czarodziej(600,4, 15,0,0);
        klasa Wojownik1 = new Wojownik(5,15,4,0,0);
        klasa Szkielet1 = new Szkielet(150, 5,1);
        klasa Goblin1 = new Goblin(10, 9, 2);
        klasa Smok1 = new Smok(10, 28, 8,0,0);

        wprowadz1.opis();

        while(Czarodziej1.getHp()>=0 || Wojownik1.getHp()>=0) {

            if (wprowadz1.getWyborPostaci() == 1) {
                Czarodziej1.opis();
                Czarodziej1.atrybuty();

                ((Szkielet) Szkielet1).pierwszeStarcie();

                Czarodziej1.minusHp(15);

                if (Czarodziej1.getHp() <= 0) {
                    Czarodziej1.rip();
                    break;
                }

                Czarodziej1.ileHp();

                while (Szkielet1.getHp() >= 0) {

                    if (Szkielet1.getHp() <= 0) {
                        ((Szkielet) Szkielet1).szkiletDie();
                        break;
                    }

                    if (Czarodziej1.getHp() <= 0) {
                        Czarodziej1.rip();
                        break;
                    }

                    wprowadz1.opisSkillsCzarodziej();

                    if (((Czarodziej) Czarodziej1).licznikPodpalenia == 1 || ((Czarodziej) Czarodziej1).licznikPodpalenia ==2) {                                    //ile tur ma sie palic
                        Goblin1.minusHp(2*Czarodziej1.getIntelligence());
                        System.out.println("Przeciwnik płonie -"+ 2*Czarodziej1.getIntelligence()+"Hp");
                        ((Czarodziej) Czarodziej1).licznikPodpalenia ++;
                        if(((Czarodziej) Czarodziej1).licznikPodpalenia==3){
                            ((Czarodziej) Czarodziej1).licznikPodpalenia=0;
                        }
                    }

                    if (wprowadz1.getWyborAtaku() == 1 || Czarodziej1.getHp() >=0 || Szkielet1.getHp()>=0) {
                        Szkielet1.minusHp(Czarodziej1.zwyklyAtakMagii());

                        System.out.println("Hp Szkieleta: " + Szkielet1.getHp());
                        System.out.println("Szkielet oddaje ciach!");
                        Czarodziej1.minusHp(Szkielet1.zwyklyAtak());

                        if (Czarodziej1.getHp() <= 0) {
                            Czarodziej1.rip();
                            break;
                        }

                        Czarodziej1.ileHp();
                        }
                    while(wprowadz1.getWyborAtaku() == 2 || Czarodziej1.getHp() >=0 || Szkielet1.getHp()>=0) {

                        if(Czarodziej1.getLicznikSkill1() == 1) {
                            System.out.println("Zużyłeś moc specjalną spróbuj czegos innego");
                            break;

                        }else if(Czarodziej1.getLicznikSkill1()!=1) {

                            Szkielet1.minusHp(Czarodziej1.Pyroblast());

                            if (Szkielet1.getHp() <= 0) {
                                ((Szkielet) Szkielet1).szkiletDie();
                                break;
                            }

                            System.out.println("Hp Szkieleta: " + Szkielet1.getHp());
                            System.out.println("Szkielet oddaje ciach!");
                            Czarodziej1.minusHp(Szkielet1.zwyklyAtak());

                            if (Czarodziej1.getHp() <= 0) {
                                Czarodziej1.rip();
                                break;
                            }

                            Czarodziej1.ileHp();
                            Czarodziej1.setLicznikSkill1(1);
                            ((Czarodziej) Czarodziej1).licznikPodpalenia = 1;
                            break;

                        }
                        }
                    while(wprowadz1.getWyborAtaku() == 3 || Czarodziej1.getHp() >=0 || Szkielet1.getHp()>=0) {

                        if (Czarodziej1.getHp() <= 0) {
                            Czarodziej1.rip();
                            break;
                        }

                        if(Czarodziej1.getLicznikSkill2() == 1) {
                            System.out.println("Zużyłeś moc specjalną spróbuj czegos innego");
                            break;

                        }else if(Czarodziej1.getLicznikSkill2()!= 1) {

                            if (Szkielet1.getHp() <= 0) {
                                ((Szkielet) Szkielet1).szkiletDie();
                                break;
                            }

                            Szkielet1.minusHp(Szkielet1.zwyklyAtak());
                            System.out.println("Szkielet odbija swoje obrażenia!");

                            System.out.println("Hp Szkieleta: " + Szkielet1.getHp());

                            Czarodziej1.ileHp();
                            Czarodziej1.setLicznikSkill2(1);
                            break;

                        }
                    }
                }
                    Czarodziej1.setLicznikSkill1(0);
                    Czarodziej1.setLicznikSkill2(0);
                    ((Czarodziej) Czarodziej1).licznikPodpalenia=0;

                    System.out.println("LVL UP - twoje atrybuty zwiększają się!");
                    Czarodziej1.lvlup(1, 5);
                    Czarodziej1.atrybuty();

                    ((Goblin) Goblin1).pierwszeStarcie();

                    while (Goblin1.getHp() >= 0) {

                        wprowadz1.opisSkillsCzarodziej();

                        if (((Czarodziej) Czarodziej1).licznikPodpalenia == 1 || ((Czarodziej) Czarodziej1).licznikPodpalenia == 2) {                                    //ile tur ma sie palic
                            Goblin1.minusHp(0.8 * Czarodziej1.getIntelligence());
                            System.out.println("Przeciwnik płonie -" + 0.8 * Czarodziej1.getIntelligence() + "Hp");
                            ((Czarodziej) Czarodziej1).licznikPodpalenia++;
                            if (((Czarodziej) Czarodziej1).licznikPodpalenia == 2) {
                                ((Czarodziej) Czarodziej1).licznikPodpalenia = 0;
                            }

                            if (wprowadz1.getWyborAtaku() == 1) {
                                Goblin1.minusHp(Czarodziej1.zwyklyAtakMagii());

                                if (Goblin1.getHp() <= 0) {
                                    ((Goblin) Goblin1).GoblinDie();
                                    break;
                                }

                                System.out.println("Hp Goblina: " + Goblin1.getHp());
                                System.out.println("Goblin oddaje ciach!");
                                Czarodziej1.minusHp(Goblin1.zwyklyAtak());
                                Czarodziej1.ileHp();

                            }
                            while (wprowadz1.getWyborAtaku() == 2) {

                                if (Czarodziej1.getHp() <= 0) {
                                    Czarodziej1.rip();
                                    break;
                                }

                                if (Czarodziej1.getLicznikSkill1() == 1) {
                                    System.out.println("Zużyłeś moc specjalną spróbuj czegos innego");
                                    break;

                                } else if (Czarodziej1.getLicznikSkill1() != 1) {

                                    Goblin1.minusHp(Czarodziej1.Pyroblast());

                                    if (Goblin1.getHp() <= 0) {
                                        ((Goblin) Goblin1).GoblinDie();
                                        break;
                                    }

                                    System.out.println("Hp Goblina: " + Goblin1.getHp());
                                    System.out.println("Goblin oddaje ciach!");
                                    Czarodziej1.minusHp(Goblin1.zwyklyAtak());

                                    if (Czarodziej1.getHp() <= 0) {
                                        Czarodziej1.rip();
                                        break;
                                    }

                                    Czarodziej1.ileHp();
                                    Czarodziej1.setLicznikSkill1(1);
                                    ((Czarodziej) Czarodziej1).licznikPodpalenia = 1;
                                    break;

                                }
                            }
                            while (wprowadz1.getWyborAtaku() == 3) {

                                if (Czarodziej1.getLicznikSkill2() == 1) {
                                    System.out.println("Zużyłeś moc specjalną spróbuj czegos innego");
                                    break;

                                } else if (Czarodziej1.getLicznikSkill2() != 1) {
                                    Goblin1.minusHp(Czarodziej1.IceBlock());

                                    if (Goblin1.getHp() <= 0) {
                                        ((Goblin) Goblin1).GoblinDie();
                                        break;
                                    }

                                    Goblin1.minusHp(Goblin1.zwyklyAtak());
                                    System.out.println("Goblin odbija swoje obrażenia!");

                                    if (Goblin1.getHp() <= 0) {
                                        ((Goblin) Goblin1).GoblinDie();
                                        break;
                                    }

                                    System.out.println("Hp Goblina: " + Goblin1.getHp());

                                    Czarodziej1.ileHp();
                                    Czarodziej1.setLicznikSkill2(1);
                                    break;

                                }
                            }
                        }

                        Czarodziej1.setLicznikSkill1(0);
                        Czarodziej1.setLicznikSkill2(0);
                        ((Czarodziej) Czarodziej1).licznikPodpalenia = 0;

                        System.out.println("LVL UP - twoje atrybuty zwiększają się!");
                        Czarodziej1.lvlup(4, 10);
                        Czarodziej1.atrybuty();
                        Smok1.opis();
                        int n = 0, e = 0;                                            //licznik do Pyroblasta i Iceblocka co 3 tury
                        int licznikTur = 0;               //licznik do ultimate bosa

                        while (Smok1.getHp() >= 0) {

                            if (((Czarodziej) Czarodziej1).licznikPodpalenia == 1 || ((Czarodziej) Czarodziej1).licznikPodpalenia ==2) {                                    //ile tur ma sie palic
                                Goblin1.minusHp(0.8*Czarodziej1.getIntelligence());
                                System.out.println("Przeciwnik płonie -"+ 0.8*Czarodziej1.getIntelligence()+"Hp");
                                ((Czarodziej) Czarodziej1).licznikPodpalenia++;
                                if(((Czarodziej) Czarodziej1).licznikPodpalenia==2){
                                    ((Czarodziej) Czarodziej1).licznikPodpalenia=0;
                                }
                            }

                            if (Czarodziej1.getHp() <= 0) {
                                Czarodziej1.rip();
                                break;
                            }

                            if (Czarodziej1.getLicznikSkill1() == 1) {
                                n++;
                            }
                            if (n == 3) {
                                Czarodziej1.setLicznikSkill1(0);
                                n = 0;
                                System.out.println("Pyroblast ODNOWIONY!!");
                            }
                            if (Czarodziej1.getLicznikSkill2() == 1) {
                                e++;
                            }
                            if (e == 3) {
                                Czarodziej1.setLicznikSkill2(0);
                                e = 0;
                                System.out.println("IceBlock ODNOWIONY!!");
                            }

                            wprowadz1.opisSkillsCzarodziej();

                            if (wprowadz1.getWyborAtaku() == 1) {
                                Smok1.minusHp(Czarodziej1.zwyklyAtakMagii());

                                if (Smok1.getHp() <= 0) {
                                    ((Smok) Smok1).SmokDie();
                                    break;
                                }

                                System.out.println("Hp Smoka: " + Smok1.getHp());
                                if (licznikTur != 2) {

                                    System.out.println("Smok oddaje ciach!");
                                    Czarodziej1.minusHp(Smok1.losowanieAtaku());

                                    if (Czarodziej1.getHp() <= 0) {
                                        Czarodziej1.rip();
                                        break;
                                    }

                                    licznikTur++;


                                } else if (licznikTur == 2) {

                                    ((Smok) Smok1).SmokUltimate();
                                    Czarodziej1.minusHp(((Smok) Smok1).UltiSmok(150));
                                    licznikTur = 0;

                                    if (Czarodziej1.getHp() <= 0) {
                                        Czarodziej1.rip();
                                        break;
                                    }
                                }
                                Czarodziej1.ileHp();
                            }

                            while (wprowadz1.getWyborAtaku() == 2) {

                                if (Czarodziej1.getLicznikSkill1() == 1) {
                                    System.out.println("Zużyłeś moc specjalną spróbuj czegos innego");
                                    break;

                                } else if (Czarodziej1.getLicznikSkill1() != 1) {

                                    Smok1.minusHp(Czarodziej1.Pyroblast());
                                    ((Czarodziej) Czarodziej1).licznikPodpalenia = 1;
                                    System.out.println("Hp Smoka: " + Smok1.getHp());

                                    if (Smok1.getHp() <= 0) {
                                        ((Smok) Smok1).SmokDie();
                                        break;
                                    }

                                    if (licznikTur != 2) {

                                        System.out.println("Smok oddaje ciach!");
                                        Czarodziej1.minusHp(Smok1.losowanieAtaku());

                                        if (Czarodziej1.getHp() <= 0) {
                                            Czarodziej1.rip();
                                            break;
                                        }

                                        licznikTur++;

                                    } else if (licznikTur == 2) {

                                        ((Smok) Smok1).SmokUltimate();
                                        Czarodziej1.minusHp(((Smok) Smok1).UltiSmok(150));

                                        if (Czarodziej1.getHp() <= 0) {
                                            Czarodziej1.rip();
                                            break;
                                        }
                                        licznikTur = 0;
                                    }
                                    Czarodziej1.ileHp();
                                    Czarodziej1.setLicznikSkill1(1);
                                    break;
                                }
                            }
                            while (wprowadz1.getWyborAtaku() == 3) {

                                if (Czarodziej1.getLicznikSkill2() == 1) {
                                    System.out.println("Zużyłeś moc specjalną spróbuj czegos innego");
                                    break;

                                } else if (Czarodziej1.getLicznikSkill2() != 1) {

                                    Smok1.minusHp(Czarodziej1.ShieldBash());
                                    if (Smok1.getHp() <= 0) {
                                        ((Smok) Smok1).SmokDie();
                                        break;
                                    }

                                    if (Goblin1.getHp() <= 0) {
                                        ((Goblin) Goblin1).GoblinDie();
                                        break;
                                    }
                                    System.out.println("Hp Smoka: " + Smok1.getHp());
                                    Czarodziej1.ileHp();

                                    if (licznikTur == 2) {
                                        licznikTur = 0;
                                    }

                                    Czarodziej1.setLicznikSkill2(1);
                                    break;

                                }

                            }

                        }
                    }

                                                                        // wojownik
            }else if(wprowadz1.getWyborPostaci() == 2){

                Wojownik1.opis();
                Wojownik1.atrybuty();

                ((Szkielet) Szkielet1).pierwszeStarcie();
                Wojownik1.minusHp(15);

                if(Wojownik1.getHp()<=0) {
                    Wojownik1.rip();
                    break;
                }
                    Wojownik1.ileHp();

                    while (Szkielet1.getHp() >= 0) {

                        wprowadz1.opisSkillsWojownik();

                        if (wprowadz1.getWyborAtaku() == 1) {
                            Szkielet1.minusHp(Wojownik1.losowanieAtaku());

                            if (Szkielet1.getHp() <= 0) {
                                ((Szkielet) Szkielet1).szkiletDie();
                                break;
                            }

                            System.out.println("Hp Szkieleta: " + Szkielet1.getHp());
                            System.out.println("Szkielet oddaje ciach!");
                            Wojownik1.minusHp(Szkielet1.zwyklyAtak());

                            if(Wojownik1.getHp()<=0) {
                                Wojownik1.rip();
                                break;
                            }

                            Wojownik1.ileHp();

                        }
                        while(wprowadz1.getWyborAtaku() == 2) {

                            if(Wojownik1.getLicznikSkill1() == 1) {
                                System.out.println("Zużyłeś moc specjalną spróbuj czegos innego");
                                break;

                            }else if(Wojownik1.getLicznikSkill1()!=1){

                                Szkielet1.minusHp(Wojownik1.Whirlwind());

                                if (Szkielet1.getHp() <= 0) {
                                    ((Szkielet) Szkielet1).szkiletDie();
                                    break;
                                }
                                System.out.println("Hp Szkieleta: " + Szkielet1.getHp());
                                System.out.println("Szkielet oddaje ciach!");
                                Wojownik1.minusHp(Szkielet1.zwyklyAtak());

                                if(Wojownik1.getHp()<=0) {
                                    Wojownik1.rip();
                                    break;
                                }
                                Wojownik1.ileHp();
                                Wojownik1.setLicznikSkill1(1);
                                break;

                            }
                        }
                        while(wprowadz1.getWyborAtaku() == 3) {

                            if(Wojownik1.getLicznikSkill2() == 1) {
                                System.out.println("Zużyłeś moc specjalną spróbuj czegos innego");
                                break;

                            }else if(Wojownik1.getLicznikSkill2()!= 1) {
                                Szkielet1.minusHp(Wojownik1.ShieldBash());

                                if (Szkielet1.getHp() <= 0) {
                                    ((Szkielet) Szkielet1).szkiletDie();
                                    break;
                                }
                                System.out.println("Hp Szkieleta: " + Szkielet1.getHp());
                                System.out.println("Szkielet jest ogłuszony! uderz jeszcze raz!");
                                Wojownik1.ileHp();
                                Wojownik1.setLicznikSkill2(1);
                                break;
                            }
                        }
                    }
                    Wojownik1.setLicznikSkill1(0);
                    Wojownik1.setLicznikSkill2(0);

                    System.out.println("LVL UP - twoje atrybuty zwiększają się!");
                    Wojownik1.lvlup(5, 1);
                    Wojownik1.atrybuty();

                    ((Goblin) Goblin1).pierwszeStarcie();

                    while (Goblin1.getHp() >= 0 || Wojownik1.getHp()>=0) {

                        wprowadz1.opisSkillsWojownik();

                        if (wprowadz1.getWyborAtaku() == 1) {
                            Goblin1.minusHp(Wojownik1.losowanieAtaku());

                            if (Goblin1.getHp() <= 0) {
                                ((Goblin) Goblin1).GoblinDie();
                                break;
                            }

                            System.out.println("Hp Goblina: " + Goblin1.getHp());
                            System.out.println("Goblin oddaje ciach!");
                            Wojownik1.minusHp(Goblin1.zwyklyAtak());
                            Wojownik1.ileHp();

                            if(Wojownik1.getHp()<=0){
                                Wojownik1.rip();
                                break;
                            }

                        }
                        while(wprowadz1.getWyborAtaku() == 2) {

                            if(Wojownik1.getLicznikSkill1() == 1) {
                                System.out.println("Zużyłeś moc specjalną spróbuj czegos innego");
                                break;

                            }else if(Wojownik1.getLicznikSkill1()!=1){

                                Goblin1.minusHp(Wojownik1.Whirlwind());

                                if (Goblin1.getHp() <= 0) {
                                    ((Goblin) Goblin1).GoblinDie();
                                    break;
                                }

                                System.out.println("Hp Goblina: " + Goblin1.getHp());
                                System.out.println("Goblin oddaje ciach!");
                                Wojownik1.minusHp(Goblin1.zwyklyAtak());

                                if(Wojownik1.getHp()<=0){
                                    Wojownik1.rip();
                                    break;
                                }
                                Wojownik1.ileHp();
                                Wojownik1.setLicznikSkill1(1);
                                break;
                            }
                        }
                        while(wprowadz1.getWyborAtaku() == 3) {

                            if(Wojownik1.getLicznikSkill2() == 1) {
                                System.out.println("Zużyłeś moc specjalną spróbuj czegos innego");
                                break;

                            }else if(Wojownik1.getLicznikSkill2()!= 1) {
                                Goblin1.minusHp(Wojownik1.ShieldBash());

                                if (Goblin1.getHp() <= 0) {
                                    ((Goblin) Goblin1).GoblinDie();
                                    break;
                                }

                                System.out.println("Hp Goblina: " + Goblin1.getHp());
                                System.out.println("Goblin jest ogłuszony! uderz jeszcze raz!");
                                Wojownik1.setLicznikSkill2(1);
                            }
                        }
                    }

                    Wojownik1.setLicznikSkill1(0);
                    Wojownik1.setLicznikSkill2(0);

                    System.out.println("LVL UP - twoje atrybuty zwiększają się!");
                    Wojownik1.lvlup(10, 4);
                    Wojownik1.atrybuty();
                    Smok1.opis();
                    int n=0, e=0;                                            //licznik do wihrlwinda i shield basha co 3 tury
                    int licznikTur = 0;               //licznik do ultimate bosa

                while(Smok1.getHp()>=0 || Wojownik1.getHp()>=0);{

                        if(Wojownik1.getHp()<=0) {
                            Wojownik1.rip();
                            break;
                        }

                        if(Wojownik1.getLicznikSkill1() == 1){
                            n++;
                        }
                        if(n==3){
                            Wojownik1.setLicznikSkill1(0);
                            n = 0;
                            System.out.println("Wihrlwind ODNOWIONY!!");
                        }
                        if(Wojownik1.getLicznikSkill2()==1){
                            e++;
                        }
                        if(e==3){
                            Wojownik1.setLicznikSkill2(0);
                            e=0;
                            System.out.println("Shield Bash ODNOWIONY!!");
                        }

                        wprowadz1.opisSkillsWojownik();

                        if (wprowadz1.getWyborAtaku() == 1) {
                            Smok1.minusHp(Wojownik1.losowanieAtaku());

                            if (Smok1.getHp() <= 0) {
                                ((Smok) Smok1).SmokDie();
                                break;
                            }

                            System.out.println("Hp Smoka: " + Smok1.getHp());
                            if(licznikTur != 2) {

                                System.out.println("Smok oddaje ciach!");
                                Wojownik1.minusHp(Smok1.losowanieAtaku());

                                if(Wojownik1.getHp()<=0) {
                                    Wojownik1.rip();
                                    break;
                                }

                                licznikTur++;


                            }else if(licznikTur == 2){

                                ((Smok)Smok1).SmokUltimate();
                                Wojownik1.minusHp(((Smok)Smok1).UltiSmok(150));
                                licznikTur = 0;

                                if(Wojownik1.getHp()<=0) {
                                    Wojownik1.rip();
                                    break;
                                }
                            }
                            Wojownik1.ileHp();
                        }

                        while(wprowadz1.getWyborAtaku() == 2) {

                            if(Wojownik1.getLicznikSkill1() == 1) {
                                System.out.println("Zużyłeś moc specjalną spróbuj czegos innego");
                                break;

                            }else if(Wojownik1.getLicznikSkill1()!=1){

                                Smok1.minusHp(Wojownik1.Whirlwind());

                                if (Smok1.getHp() <= 0) {
                                    ((Smok) Smok1).SmokDie();
                                    break;
                                }

                                System.out.println("Hp Smoka: " + Smok1.getHp());

                                if(licznikTur != 2) {

                                    System.out.println("Smok oddaje ciach!");
                                    Wojownik1.minusHp(Smok1.losowanieAtaku());

                                    if(Wojownik1.getHp()<=0) {
                                        Wojownik1.rip();
                                        break;
                                    }

                                    licznikTur++;

                                }else if(licznikTur == 2){

                                    ((Smok)Smok1).SmokUltimate();
                                    Wojownik1.minusHp(((Smok)Smok1).UltiSmok(150));

                                    if(Wojownik1.getHp()<=0) {
                                        Wojownik1.rip();
                                        break;
                                    }
                                    licznikTur = 0;
                                }
                                Wojownik1.ileHp();
                                Wojownik1.setLicznikSkill1(1);
                                break;
                            }
                        }
                        while(wprowadz1.getWyborAtaku() == 3) {

                            if(Wojownik1.getLicznikSkill2() == 1) {
                                System.out.println("Zużyłeś moc specjalną spróbuj czegos innego");
                                break;

                            }else if(Wojownik1.getLicznikSkill2()!= 1) {

                                Smok1.minusHp(Wojownik1.ShieldBash());
                                if (Smok1.getHp() <= 0) {
                                    ((Smok) Smok1).SmokDie();
                                    break;
                                }
                                System.out.println("Hp Smoka: " + Smok1.getHp());
                                System.out.println("Smok jest ogłuszony! uderz jeszcze raz!");

                                if(licznikTur==2){
                                    licznikTur = 0;
                                }

                                Wojownik1.setLicznikSkill2(1);
                                break;
                            }
                        }
                    }
            }
            break;
        }
        System.out.println("Koniec gry.");
    }
}

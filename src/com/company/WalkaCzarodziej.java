package com.company;

public class WalkaCzarodziej {

    public void pyroblastPodpalenie(klasa bohater, klasa przeciwnik1, wprowadz wprowadz1) {

        if (((Czarodziej) bohater).licznikPodpalenia == 0 && wprowadz1.getWyborAtaku() == 2)
            ((Czarodziej) bohater).licznikPodpalenia = 1;

        if (((Czarodziej) bohater).licznikPodpalenia == 1 || ((Czarodziej) bohater).licznikPodpalenia == 2) {
            if (wprowadz1.getWyborAtaku() == 3 && bohater.getLicznikSkill2() == 0 || wprowadz1.getWyborAtaku() == 1) {  //ile tur ma sie palic

                przeciwnik1.minusHp(2 * bohater.getIntelligence());
                System.out.println("Przeciwnik płonie -" + 2 * bohater.getIntelligence() + "Hp");
                ((Czarodziej) bohater).licznikPodpalenia++;

                if (((Czarodziej) bohater).licznikPodpalenia == 3) {
                    ((Czarodziej) bohater).licznikPodpalenia = 0;
                }
            }
        }
    }

    public void walkaCzarodziejSzkielet(klasa bohater, klasa przeciwnik1, wprowadz wprowadz1) {

        wprowadz1.opis();

        bohater.opis();
        bohater.atrybuty();

        ((Szkielet) przeciwnik1).pierwszeStarcie();
        bohater.minusHp(15);


        bohater.ileHp();


        while (bohater.getHp() >= 0) {

            if (przeciwnik1.getHp() <= 0) {
                break;
            }
            if (bohater.getHp() <= 0) {
                bohater.rip();
                break;
            }

            while (true) {

                if (bohater.getHp() <= 0) {
                    bohater.rip();
                    break;
                }

                wprowadz1.opisSkillsCzarodziej();

                pyroblastPodpalenie(bohater, przeciwnik1, wprowadz1);

                if (wprowadz1.getWyborAtaku() == 1) {
                    przeciwnik1.minusHp(bohater.zwyklyAtakMagii());

                    if (przeciwnik1.getHp() <= 0) {
                        ((Szkielet) przeciwnik1).szkiletDie();
                        break;
                    }

                    System.out.println("Hp Szkieleta: " + przeciwnik1.getHp());
                    System.out.println("Szkielet oddaje ciach!");
                    bohater.minusHp(przeciwnik1.zwyklyAtak());

                    if (bohater.getHp() <= 0) {
                        bohater.rip();
                        break;
                    }
                    bohater.ileHp();
                }
                if (wprowadz1.getWyborAtaku() == 2) {

                    if (bohater.getLicznikSkill1() == 1) {
                        System.out.println("Zużyłeś moc specjalną spróbuj czegos innego");
                        break;

                    } else if (bohater.getLicznikSkill1() != 1) {

                        przeciwnik1.minusHp(bohater.Pyroblast());

                        if (przeciwnik1.getHp() <= 0) {
                            ((Szkielet) przeciwnik1).szkiletDie();
                            break;
                        }
                        System.out.println("Hp Szkieleta: " + przeciwnik1.getHp());
                        System.out.println("Szkielet oddaje ciach!");
                        bohater.minusHp(przeciwnik1.zwyklyAtak());

                        if (bohater.getHp() <= 0) {
                            bohater.rip();
                            break;
                        }

                        bohater.ileHp();
                        bohater.setLicznikSkill1(1);
                        break;
                    }
                }
                if (wprowadz1.getWyborAtaku() == 3) {

                    if (bohater.getHp() <= 0) {
                        bohater.rip();
                        break;
                    }

                    if (bohater.getLicznikSkill2() == 1) {
                        System.out.println("Zużyłeś moc specjalną spróbuj czegos innego");
                        break;

                    } else if (bohater.getLicznikSkill2() != 1) {

                        przeciwnik1.minusHp(przeciwnik1.zwyklyAtak());
                        if (przeciwnik1.getHp() <= 0) {
                            ((Szkielet) przeciwnik1).szkiletDie();
                            break;
                        }
                        System.out.println("Szkielet odbija swoje obrażenia!");
                        System.out.println("Hp Szkieleta: " + przeciwnik1.getHp());

                        bohater.ileHp();
                        bohater.setLicznikSkill2(1);
                        break;
                    }
                }
            }
        }
    }

    public void walkaCzarodziejGoblin(klasa bohater, klasa przeciwnik1, wprowadz wprowadz1) {
        bohater.setLicznikSkill1(0);
        bohater.setLicznikSkill2(0);
        ((Czarodziej) bohater).licznikPodpalenia = 0;

        System.out.println("LVL UP - twoje atrybuty zwiększają się!");
        bohater.lvlup(1, 5);
        bohater.atrybuty();

        ((Goblin) przeciwnik1).pierwszeStarcie();

        while (bohater.getHp() >= 0) {

            if (przeciwnik1.getHp() <= 0) {
                break;
            }
            if (bohater.getHp() <= 0) {
                bohater.rip();
                break;
            }

            while (true) {

                if (bohater.getHp() <= 0) {
                    bohater.rip();
                    break;
                }

                wprowadz1.opisSkillsCzarodziej();

                pyroblastPodpalenie(bohater, przeciwnik1, wprowadz1);

                if (wprowadz1.getWyborAtaku() == 1) {
                    przeciwnik1.minusHp(bohater.zwyklyAtakMagii());

                    if (przeciwnik1.getHp() <= 0) {
                        ((Goblin) przeciwnik1).goblinDie();
                        break;
                    }

                    System.out.println("Hp Goblina: " + przeciwnik1.getHp());
                    System.out.println("Goblin oddaje ciach!");
                    bohater.minusHp(przeciwnik1.losowanieAtaku());

                    if (bohater.getHp() <= 0) {
                        bohater.rip();
                        break;
                    }
                    bohater.ileHp();
                }
                if (wprowadz1.getWyborAtaku() == 2) {

                    if (bohater.getLicznikSkill1() == 1) {
                        System.out.println("Zużyłeś moc specjalną spróbuj czegos innego");
                        break;

                    } else if (bohater.getLicznikSkill1() != 1) {

                        przeciwnik1.minusHp(bohater.Pyroblast());

                        if (przeciwnik1.getHp() <= 0) {
                            ((Goblin) przeciwnik1).goblinDie();
                            break;
                        }
                        System.out.println("Hp Goblina: " + przeciwnik1.getHp());
                        System.out.println("Goblin oddaje ciach!");
                        bohater.minusHp(przeciwnik1.losowanieAtaku());

                        if (bohater.getHp() <= 0) {
                            bohater.rip();
                            break;
                        }

                        bohater.ileHp();
                        bohater.setLicznikSkill1(1);
                        break;
                    }
                }
                if (wprowadz1.getWyborAtaku() == 3) {

                    if (bohater.getHp() <= 0) {
                        bohater.rip();
                        break;
                    }

                    if (bohater.getLicznikSkill2() == 1) {
                        System.out.println("Zużyłeś moc specjalną spróbuj czegos innego");
                        break;

                    } else if (bohater.getLicznikSkill2() != 1) {

                        przeciwnik1.minusHp(przeciwnik1.losowanieAtaku());
                        if (przeciwnik1.getHp() <= 0) {
                            ((Szkielet) przeciwnik1).szkiletDie();
                            break;
                        }
                        System.out.println("Goblin odbija swoje obrażenia!");
                        System.out.println("Hp Goblina: " + przeciwnik1.getHp());

                        bohater.ileHp();
                        bohater.setLicznikSkill2(1);
                        break;
                    }
                }
            }
        }
    }

    public void walkaCzarodziejSmokBoss(klasa bohater, klasa przeciwnik1, wprowadz wprowadz1){

        bohater.ileHp();
        bohater.setLicznikSkill1(0);
        bohater.setLicznikSkill2(0);
        ((Czarodziej) bohater).licznikPodpalenia = 0;

        System.out.println("LVL UP - twoje atrybuty zwiększają się!");
        bohater.lvlup(4, 10);
        bohater.atrybuty();
        przeciwnik1.opis();
        int n = 0, e = 0;                                            //licznik do Pyroblasta i Iceblocka co 3 tury
        int licznikTur = 0;                                         //licznik do ultimate bosa
//Walka BOSS SMOK

        while (bohater.getHp() >= 0) {

            if (przeciwnik1.getHp() <= 0) {
                break;
            }
            if (bohater.getHp() <= 0) {
                bohater.rip();
                break;
            }

            while (true) {

                pyroblastPodpalenie(bohater, przeciwnik1, wprowadz1);

                if (bohater.getLicznikSkill1() == 1) {
                    n++;
                }
                if (n == 3) {
                    bohater.setLicznikSkill1(0);
                    n = 0;
                    System.out.println("Pyroblast ODNOWIONY!!");
                }
                if (bohater.getLicznikSkill2() == 1) {
                    e++;
                }
                if (e == 3) {
                    bohater.setLicznikSkill2(0);
                    e = 0;
                    System.out.println("IceBlock ODNOWIONY!!");
                }

                wprowadz1.opisSkillsCzarodziej();

                if (wprowadz1.getWyborAtaku() == 1) {
                    przeciwnik1.minusHp(bohater.zwyklyAtakMagii());

                    if (przeciwnik1.getHp() <= 0) {
                        ((Smok) przeciwnik1).SmokDie();
                        break;
                    }

                    System.out.println("Hp Smoka: " + przeciwnik1.getHp());
                    if (licznikTur != 2) {

                        System.out.println("Smok oddaje ciach!");
                        bohater.minusHp(przeciwnik1.losowanieAtaku());

                        if (bohater.getHp() <= 0) {
                            bohater.rip();
                            break;
                        }

                        licznikTur++;


                    } else if (licznikTur == 2) {

                        ((Smok) przeciwnik1).SmokUltimate();
                        bohater.minusHp(((Smok) przeciwnik1).UltiSmok(150));
                        licznikTur = 0;

                        if (bohater.getHp() <= 0) {
                            bohater.rip();
                            break;
                        }
                    }
                    bohater.ileHp();
                }

                if (wprowadz1.getWyborAtaku() == 2) {

                    if (bohater.getLicznikSkill1() == 1) {
                        System.out.println("Zużyłeś moc specjalną spróbuj czegos innego");
                        break;

                    } else if (bohater.getLicznikSkill1() != 1) {

                        przeciwnik1.minusHp(bohater.Pyroblast());
                        ((Czarodziej) bohater).licznikPodpalenia = 1;
                        System.out.println("Hp Smoka: " + przeciwnik1.getHp());

                        if (przeciwnik1.getHp() <= 0) {
                            ((Smok) przeciwnik1).SmokDie();
                            break;
                        }

                        if (licznikTur != 2) {

                            System.out.println("Smok oddaje ciach!");
                            bohater.minusHp(przeciwnik1.losowanieAtaku());

                            if (bohater.getHp() <= 0) {
                                bohater.rip();
                                break;
                            }

                            licznikTur++;

                        } else if (licznikTur == 2) {

                            ((Smok) przeciwnik1).SmokUltimate();
                            bohater.minusHp(((Smok) przeciwnik1).UltiSmok(150));

                            if (bohater.getHp() <= 0) {
                                bohater.rip();
                                break;
                            }
                            licznikTur = 0;
                        }
                        bohater.ileHp();
                        bohater.setLicznikSkill1(1);
                        break;
                    }
                }
                if (wprowadz1.getWyborAtaku() == 3) {

                    if (bohater.getLicznikSkill2() == 1) {
                        System.out.println("Zużyłeś moc specjalną spróbuj czegos innego");
                        break;

                    } else if (bohater.getLicznikSkill2() != 1) {

                        przeciwnik1.minusHp(bohater.IceBlock());
                        if (przeciwnik1.getHp() <= 0) {
                            ((Smok) przeciwnik1).SmokDie();
                            break;
                        }
                        if (licznikTur == 2) {
                            przeciwnik1.minusHp(((Smok) przeciwnik1).UltiSmok(150));
                            ((Smok) przeciwnik1).SmokUltimate();
                            ((Smok) przeciwnik1).SmokUltimateOdbite();
                            licznikTur = 0;
                        } else {
                            przeciwnik1.minusHp(przeciwnik1.losowanieAtaku());
                        }

                        if (przeciwnik1.getHp() <= 0) {
                            ((Smok) przeciwnik1).SmokDie();
                            break;
                        }

                        System.out.println("Hp Smoka: " + przeciwnik1.getHp());
                        bohater.ileHp();

                        bohater.setLicznikSkill2(1);
                        break;
                    }
                }
            }
        }
    }
}

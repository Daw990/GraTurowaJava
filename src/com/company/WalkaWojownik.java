package com.company;

public class WalkaWojownik {

    public void walkaWojownikSzkielet(klasa bohater, klasa przeciwnik1, wprowadz wprowadz1) {
        bohater.opis();
        bohater.atrybuty();

        ((Szkielet) przeciwnik1).pierwszeStarcie();
        bohater.minusHp(15);

        bohater.ileHp();

        while (true) {

            if (przeciwnik1.getHp() <= 0) {
                ((Szkielet) przeciwnik1).szkiletDie();
                break;
            }
            if (bohater.getHp() <= 0) {
                bohater.rip();
                break;
            }

            while (true) {

                if (bohater.getHp() <= 0) {
                    break;
                }

                wprowadz1.opisSkillsWojownik();

                if (wprowadz1.getWyborAtaku() == 1) {
                    przeciwnik1.minusHp(bohater.losowanieAtaku());

                    if (przeciwnik1.getHp() <= 0) {
                        break;
                    }

                    System.out.println("Hp Szkieleta: " + przeciwnik1.getHp());
                    System.out.println("Szkielet oddaje ciach!");
                    bohater.minusHp(przeciwnik1.zwyklyAtak());

                    if (bohater.getHp() <= 0) {
                        break;
                    }
                    bohater.ileHp();
                }
                if (wprowadz1.getWyborAtaku() == 2) {

                    if (bohater.getLicznikSkill1() == 1) {
                        System.out.println("Zużyłeś moc specjalną spróbuj czegos innego");
                        break;

                    } else if (bohater.getLicznikSkill1() != 1) {

                        przeciwnik1.minusHp(bohater.Whirlwind());

                        if (przeciwnik1.getHp() <= 0) {
                            break;
                        }
                        System.out.println("Hp Szkieleta: " + przeciwnik1.getHp());
                        System.out.println("Szkielet oddaje ciach!");
                        bohater.minusHp(przeciwnik1.zwyklyAtak());

                        if (bohater.getHp() <= 0) {
                            break;
                        }
                        bohater.ileHp();
                        bohater.setLicznikSkill1(1);
                        break;
                    }
                }
                if (wprowadz1.getWyborAtaku() == 3) {

                    if (bohater.getHp() <= 0) {
                        break;
                    }

                    if (bohater.getLicznikSkill2() == 1) {
                        System.out.println("Zużyłeś moc specjalną spróbuj czegos innego");
                        break;

                    } else if (bohater.getLicznikSkill2() != 1) {

                        przeciwnik1.minusHp(bohater.ShieldBash());
                        if (przeciwnik1.getHp() <= 0) {
                            break;
                        }
                        System.out.println("Szkielet został ogłuszony ponownie wykonaj atak!");
                        System.out.println("Hp Szkieleta: " + przeciwnik1.getHp());

                        bohater.ileHp();
                        bohater.setLicznikSkill2(1);
                        break;
                    }
                }
            }
        }
    }

    public void walkaWojownikGoblin(klasa bohater, klasa przeciwnik1, wprowadz wprowadz1){

        bohater.setLicznikSkill1(0);
        bohater.setLicznikSkill2(0);

        System.out.println("LVL UP - twoje atrybuty zwiększają się!");
        bohater.lvlup(5, 1);
        bohater.atrybuty();

        ((Goblin) przeciwnik1).pierwszeStarcie();

        while (true) {

            if (przeciwnik1.getHp() <= 0) {
                ((Goblin) przeciwnik1).goblinDie();
                break;
            }
            if (bohater.getHp() <= 0) {
                bohater.rip();
                break;
            }

            while (true) {

                if (bohater.getHp() <= 0) {
                    break;
                }

                wprowadz1.opisSkillsWojownik();

                if (wprowadz1.getWyborAtaku() == 1) {
                    przeciwnik1.minusHp(bohater.losowanieAtaku());

                    if (przeciwnik1.getHp() <= 0) {
                        break;
                    }

                    System.out.println("Hp Goblina: " + przeciwnik1.getHp());
                    System.out.println("Goblin oddaje ciach!");
                    bohater.minusHp(przeciwnik1.losowanieAtaku());

                    if (bohater.getHp() <= 0) {
                        break;
                    }
                    bohater.ileHp();
                }
                if (wprowadz1.getWyborAtaku() == 2) {

                    if (bohater.getLicznikSkill1() == 1) {
                        System.out.println("Zużyłeś moc specjalną spróbuj czegos innego");
                        break;

                    } else if (bohater.getLicznikSkill1() != 1) {

                        przeciwnik1.minusHp(bohater.Whirlwind());

                        if (przeciwnik1.getHp() <= 0) {
                            break;
                        }
                        System.out.println("Hp Goblina: " + przeciwnik1.getHp());
                        System.out.println("Goblin oddaje ciach!");
                        bohater.minusHp(przeciwnik1.losowanieAtaku());

                        if (bohater.getHp() <= 0) {
                            break;
                        }

                        bohater.ileHp();
                        bohater.setLicznikSkill1(1);
                        break;
                    }
                }
                if (wprowadz1.getWyborAtaku() == 3) {

                    if (bohater.getHp() <= 0) {
                        break;
                    }

                    if (bohater.getLicznikSkill2() == 1) {
                        System.out.println("Zużyłeś moc specjalną spróbuj czegos innego");
                        break;

                    } else if (bohater.getLicznikSkill2() != 1) {

                        przeciwnik1.minusHp(bohater.ShieldBash());
                        if (przeciwnik1.getHp() <= 0) {
                            break;
                        }
                        System.out.println("Goblin został ogłuszony ponownie wykonaj atak!");
                        System.out.println("Hp Goblina: " + przeciwnik1.getHp());

                        bohater.ileHp();
                        bohater.setLicznikSkill2(1);
                        break;
                    }
                }
            }
        }
    }

    public void walkaWojownikSmokBoss(klasa bohater, klasa przeciwnik1, wprowadz wprowadz1){

        bohater.ileHp();
        bohater.setLicznikSkill1(0);
        bohater.setLicznikSkill2(0);

        System.out.println("LVL UP - twoje atrybuty zwiększają się!");
        bohater.lvlup(15, 3);
        bohater.atrybuty();
        przeciwnik1.opis();
        int n = 0, e = 0;                     //licznik do Whirlwind i Shieldbash co 3 tury
        int licznikTur = 0;                   //licznik do ultimate bosa
//Walka BOSS SMOK

        while (true) {

            if (przeciwnik1.getHp() <= 0) {
                ((Smok) przeciwnik1).SmokDie();
                break;
            }
            if (bohater.getHp() <= 0) {
                bohater.rip();
                break;
            }

            while (true) {

                if (bohater.getLicznikSkill1() == 1) {
                    n++;
                }
                if (n == 3) {
                    bohater.setLicznikSkill1(0);
                    n = 0;
                    System.out.println("Whirlwind ODNOWIONY!!");
                }
                if (bohater.getLicznikSkill2() == 1) {
                    e++;
                }
                if (e == 3) {
                    bohater.setLicznikSkill2(0);
                    e = 0;
                    System.out.println("Shieldbash ODNOWIONY!!");
                }
                wprowadz1.opisSkillsWojownik();

                if (wprowadz1.getWyborAtaku() == 1) {
                    przeciwnik1.minusHp(bohater.losowanieAtaku());

                    if (przeciwnik1.getHp() <= 0) {
                        break;
                    }

                    System.out.println("Hp Smoka: " + przeciwnik1.getHp());
                    if (licznikTur != 2) {

                        System.out.println("Smok oddaje ciach!");
                        bohater.minusHp(przeciwnik1.losowanieAtaku());

                        if (bohater.getHp() <= 0) {
                            break;
                        }
                        licznikTur++;

                    } else if (licznikTur == 2) {

                        ((Smok) przeciwnik1).SmokUltimate();
                        bohater.minusHp(((Smok) przeciwnik1).UltiSmok(150));
                        licznikTur = 0;

                        if (bohater.getHp() <= 0) {
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

                        przeciwnik1.minusHp(bohater.Whirlwind());
                        System.out.println("Hp Smoka: " + przeciwnik1.getHp());

                        if (przeciwnik1.getHp() <= 0) {
                            break;
                        }
                        if (licznikTur != 2) {

                            System.out.println("Smok oddaje ciach!");
                            bohater.minusHp(przeciwnik1.losowanieAtaku());

                            if (bohater.getHp() <= 0) {
                                break;
                            }
                            licznikTur++;

                        } else if (licznikTur == 2) {

                            ((Smok) przeciwnik1).SmokUltimate();
                            bohater.minusHp(((Smok) przeciwnik1).UltiSmok(150));

                            if (bohater.getHp() <= 0) {
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

                        przeciwnik1.minusHp(bohater.ShieldBash());
                        if (przeciwnik1.getHp() <= 0) {
                            break;
                        }
                            if (licznikTur == 2) {
                            licznikTur = 0;
                        }

                        System.out.println("Smok został ogłuszony ponownie wykonaj atak!");
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

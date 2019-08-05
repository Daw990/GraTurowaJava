package com.company;
import java.util.Random;
public abstract class klasa {

    protected double Hp;
    protected double Str;
    protected double intelligence;
    protected int skill1 = 0;
    protected int skill2 = 0;

    klasa(){ }

    klasa(double Hp, double Str, double intelligence, int skill1, int skill2){
        this.Hp = Hp;
        this.Str = Str;
        this.intelligence= intelligence;
        this.skill1 = skill1;
        this.skill1 = skill2;
    }
    klasa(double Hp, double Str, double intelligence){
        this.Hp = Hp;
        this.Str = Str;
        this.intelligence= intelligence;
    }

    abstract protected void opis();

    void rip(){
        System.out.println("Niestety nie tym razem! Sprobuj jeszcze raz!");
    }
    void lvlup(double Str, double intelligence){
        this.Str +=Str;
        this.intelligence += intelligence;
    }

    void atrybuty(){
        System.out.println("Atrybuty: \nHp: "+this.Hp+"\nSiła: "+this.Str+"\nintelligence: "+this.intelligence);
    }

    void ileHp(){
        System.out.println("Masz jeszcze: "+this.Hp+" pkt zdrowia");
    }
    
    double zwyklyAtakMagii() { return this.intelligence*2; }
    double zwyklyAtak(){ return this.Str*2;}

    double losowanieAtaku(){
        Random r = new Random();
        int a = r.nextInt(101);
        double atak = 0;
        if(a<=50){                             //zwykły atak
            atak = getStr() *2;
        }else if(a>50){                        //atak krytyczny
            atak = getStr() *4;
        }
        return atak;
    }

    double Whirlwind(){
        return 50+zwyklyAtak();
    }

    double ShieldBash(){
        return zwyklyAtak()+10;
    }

    double Pyroblast() { return 30+zwyklyAtakMagii(); }

    double IceBlock() {return 0;}

    double getHp(){ return this.Hp; }
    double getStr(){ return this.Str;}
    double getIntelligence() { return this.intelligence;}

    void setLicznikSkill1(int licznik){ this.skill1 = licznik; }
    void setLicznikSkill2(int licznik){
        this.skill2 = licznik;
    }

    int getLicznikSkill1(){ return this.skill1;}
    int getLicznikSkill2(){ return this.skill2;}

    void minusHp(double ileHp){
        this.Hp -= ileHp;
    }
}


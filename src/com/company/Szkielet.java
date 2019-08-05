package com.company;

public class Szkielet extends klasa {

    public Szkielet(){ }
    public Szkielet(double Hp, double Str, double intelligence){
        super(Hp, Str, intelligence);
    }

    void pierwszeStarcie(){
        System.out.println("Podążając ciemnym lasem w poszukiwaniu lekarstwa dla tego świata w oddali postrzegasz " +
                "chuderlawą postać to szkielet! rzuca sie na nas z szarżą zadając 15pkt obrażeń! twoja kolej:");
    }
    void szkiletDie(){
        System.out.println("Szkielet Rozleciał się na kawałki! ruszamy dalej w poszukiwaniu rozwoju tego " +
                "plugastwa!");
    }
    @Override
    protected void opis() {
        System.out.println("chudy kościsty lecz z ostrym jak brzytwa mieczem! do boju!");
    }
}
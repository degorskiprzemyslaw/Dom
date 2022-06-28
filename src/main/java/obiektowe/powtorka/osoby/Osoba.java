package obiektowe.powtorka.osoby;

import java.util.Random;

public class Osoba {

    private String imie; //gdyby byla statyczna to zmienna nalezalaby do klasy
    //CZYLI BYLABY TYLKO JEDNA
    //w osobie demo gdyby zrobic sout osoba1.imie i sout osoba.2imie to wyswietli sie
    //2 razy Zofia
    private int wiek;

    /*public Osoba(String startoweImie, int startowyWiek){
        imie = startoweImie;
        wiek = startowyWiek;
    }*/

    public Osoba(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }
    public Osoba(){
        imie = "Jan";
        Random random = new Random();
        wiek = random.nextInt(100) + 1;
    }

    void przywitajSie(){
        System.out.println("Jestem " + imie + " i mam " + wiek + " lat");
    }

    public void setWiek(int wiek){
        this.wiek = wiek;
    }

    public int getWiek(){
        return wiek;
    }

    String getImie(){
        return imie;
    }

    void wyprawUrodziny(){
        wiek++;
    }

    public String toString(){
        // nadpisanie metody toString
        return "Jestem " + imie + " i mam " + wiek + " lat";
    }





}

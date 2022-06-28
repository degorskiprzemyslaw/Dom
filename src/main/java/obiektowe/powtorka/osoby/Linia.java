package obiektowe.powtorka.osoby;

public class Linia {
    private int dlugosc;
    private char wypelnienie;

    public Linia(int dlugosc, char wypelnienie) {
        this.dlugosc = dlugosc;
        this.wypelnienie = wypelnienie;
    }

    public int getDlugosc(){
        return dlugosc;
    }
    public void setDlugosc(int dlugosc){
        this.dlugosc = dlugosc;
    }

    public char getWypelnienie(){
        return wypelnienie;
    }
    public void setWypelnienie(char wypelnienie){
        this.wypelnienie = wypelnienie;
    }



    public Linia(){

    }

    public static void main(String[] args) {
        Linia linia1 = new Linia(6, '*');
        Linia linia2 = new Linia(5, '-');
        Linia linia3 = new Linia(9, '|');
        linia1.drukujLinie(linia1.dlugosc, linia1.wypelnienie);
        linia2.drukujLinie(linia2.dlugosc, linia2.wypelnienie);
        linia3.drukujLinie(linia3.dlugosc, linia3.wypelnienie);
    }

    void drukujLinie(int dlugosc, char znak){
        for(int i = 0; i < dlugosc; i++){
            System.out.print(znak);
        }
        System.out.println();
    }
}

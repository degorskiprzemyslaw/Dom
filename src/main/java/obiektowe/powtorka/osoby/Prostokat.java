package obiektowe.powtorka.osoby;

public class Prostokat {
    int wysokosc;
    int szerokosc;
    char wypelnienie;

    public Prostokat(int wysokosc, int szerokosc, char wypelnienie) {
        this.wysokosc = wysokosc;
        this.szerokosc = szerokosc;
        this.wypelnienie = wypelnienie;
    }
    public Prostokat (int wysokosc, int szerokosc){
        this.wysokosc = wysokosc;
        this.szerokosc = szerokosc;
    }

    public int getWysokosc() {
        return wysokosc;
    }

    public void setWysokosc(int wysokosc) {
        this.wysokosc = wysokosc;
    }

    public int getSzerokosc() {
        return szerokosc;
    }

    public void setSzerokosc(int szerokosc) {
        this.szerokosc = szerokosc;
    }

    public char getWypelnienie() {
        return wypelnienie;
    }

    public void setWypelnienie(char wypelnienie) {
        this.wypelnienie = wypelnienie;
    }

    public static void main(String[] args) {
        Prostokat prostokat1 = new Prostokat(3, 6, '+');
        Prostokat prostokat2 = new Prostokat(8, 18, '&');
        prostokat1.drukujProstokat(prostokat1.wysokosc, prostokat1.szerokosc, prostokat1.wypelnienie);
        System.out.println();
        prostokat1.drukujProstokat(prostokat2.wysokosc, prostokat2.szerokosc, prostokat2.wypelnienie);
    }

    void drukujProstokat(int wysokosc, int szerokosc, char wypelnienie){
        for (int i = 0; i < wysokosc; i++){
            for (int j = 0; j < szerokosc; j++){
                System.out.print(wypelnienie);
            }
            System.out.println();
        }
    }
}



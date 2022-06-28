package obiektowe.powtorka.osoby;

public class Samochod {
    private String marka;
    private int przebieg;
    private int przebiegDoPrzegladu = 20000;

    public Samochod(String marka, int przebieg) {
        this.marka = marka;
        this.przebieg = przebieg;

    }
    public Samochod(){

    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getPrzebieg() {
        return przebieg;
    }

    public void setPrzebieg(int przebieg) {
        this.przebieg = przebieg;
    }

    public int getPrzebiegDoPrzegladu() {
        return przebiegDoPrzegladu;
    }

    public void setPrzebiegDoPrzegladu(int przebiegDoPrzegladu) {
        this.przebiegDoPrzegladu = przebiegDoPrzegladu;
    }

    void wyswietlMarkeIPrzebieg(){
        System.out.println("Marka samochodu: " + marka + " przebieg: " + przebieg + " km");
    }

    void przebiegPoPrzejechaniu(int odlegloscPrzejazdu){
        System.out.println(przebieg + odlegloscPrzejazdu + " km");
    }
    int ileDoPrzegladu(int przebieg){
        return przebiegDoPrzegladu - przebieg % przebiegDoPrzegladu;
    }
}

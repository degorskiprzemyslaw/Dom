package obiektowe.powtorka.osoby.warsztat;

public class Paragon {
    final String usluga = "Wymiana opony";
    private int licznik;
    final int cena = 400;

    private int lacznaCena;

    public void setLicznik(int licznik) {
        this.licznik = licznik;
    }

    public void setLacznaCena(int lacznaCena) {
        this.lacznaCena = lacznaCena;
    }

    public int getLacznaCena() {
        return lacznaCena;
    }

    @Override
    public String toString() {
        return "Paragon{" +
                "usluga='" + usluga + '\'' +
                ", licznik=" + licznik +
                ", cena=" + cena +
                ", lacznaCena=" + lacznaCena +
                '}';
    }
}

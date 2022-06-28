package obiektowe.powtorka.dom;

public class Pokoj {
    private Lozko lozko;
    private Okno[] okna;

    public Pokoj(Lozko lozko, Okno[] okna) {
        this.lozko = lozko;
        this.okna = okna;
    }

    public Pokoj() {
        this.okna = new Okno[2];
        this.lozko = new Lozko(5);
    }

    public void posprzatajPokoj(){
        lozko.setLicznikDniOdWymianyPoscieli(0);
        for(Okno o : okna){
            o.otworzOkno();
        }


    }
}

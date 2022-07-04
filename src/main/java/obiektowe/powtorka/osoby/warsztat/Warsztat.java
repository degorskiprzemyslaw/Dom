package obiektowe.powtorka.osoby.warsztat;

public class Warsztat {

    private Samochod samochod;
    private Paragon paragon;

    public Paragon naprawa(Samochod samochod){
        for(Kolo kolo : samochod.getKola()){
            int counter = 0;

            if(kolo.isPrzebicie()){
                counter++;
                kolo.setPrzebicie(false);
                kolo.setCisnienie(2.2);
            }

            paragon.setLacznaCena(counter * paragon.cena);
            paragon.setLicznik(counter);
        }

    return paragon;
    }
}

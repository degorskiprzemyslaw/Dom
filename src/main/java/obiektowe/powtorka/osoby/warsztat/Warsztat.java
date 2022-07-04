package obiektowe.powtorka.osoby.warsztat;

public class Warsztat {

    private Samochod samochod;


    public Paragon naprawa(Samochod samochod){
        int counter = 0;
        for(Kolo kolo : samochod.getKola()){


            if(kolo.isPrzebicie()){
                counter++;
                kolo.setPrzebicie(false);
                kolo.setCisnienie(2.2);
            }


        }
        Paragon paragon = new Paragon();
        paragon.setLacznaCena(counter * paragon.cena);
        paragon.setLicznik(counter);

    return paragon;
    }
}

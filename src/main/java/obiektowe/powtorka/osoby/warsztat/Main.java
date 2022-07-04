package obiektowe.powtorka.osoby.warsztat;

public class Main {





    public static void main(String[] args) {


        Kolo[] kola = {new Kolo(2.2), new Kolo(2.0), new Kolo(1.8), new Kolo(1.9)};
        Samochod samochod = new Samochod(kola);


        for(Kolo kolo : samochod.getKola()){
            System.out.println(kolo);
        }

        System.out.println();



        samochod.zlapanieGumy();

        for(Kolo kolo : samochod.getKola()){
            System.out.println(kolo);
        }

        Warsztat doNaprawy = new Warsztat();
        Paragon paragon = new Paragon();
        paragon = doNaprawy.naprawa(samochod);

        System.out.println();

        for(Kolo kolo : samochod.getKola()){
            System.out.println(kolo);
        }



    }
}

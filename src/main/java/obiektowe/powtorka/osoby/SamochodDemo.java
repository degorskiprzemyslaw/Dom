package obiektowe.powtorka.osoby;

public class SamochodDemo {
    public static void main(String[] args) {
        Samochod samochod1 = new Samochod("Renault", 68000);

        Samochod samochod2 = new Samochod("Opel", 90000);

        samochod1.wyswietlMarkeIPrzebieg();
        samochod1.przebiegPoPrzejechaniu(50000);
        int kmDoPrzegladu = samochod1.ileDoPrzegladu(samochod1.getPrzebieg());
        System.out.println(kmDoPrzegladu);
    }

}

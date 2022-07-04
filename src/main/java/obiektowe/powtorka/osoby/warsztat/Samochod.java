package obiektowe.powtorka.osoby.warsztat;

import java.util.Random;

public class Samochod {

    private Kolo[] kola;

    public Samochod(Kolo[] kola) {
        this.kola = kola;
    }

    public Kolo[] getKola() {
        return kola;
    }

    public void zlapanieGumy(){
        Random r = new Random();
        for(int i = 0; i < 4; i++){
            boolean przebicie = r.nextBoolean();
            kola[i].setPrzebicie(przebicie);
            if(przebicie){
                kola[i].setCisnienie(0.0);
            }
        }
    }



}

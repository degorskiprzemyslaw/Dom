package obiektowe.powtorka.osoby.warsztat;

public class Kolo {
    private double cisnienie;
    private boolean przebicie;


    public Kolo(double cisnienie) {
        this.cisnienie = cisnienie;

    }

    public double getCisnienie() {
        return cisnienie;
    }

    public boolean isPrzebicie() {
        return przebicie;
    }

    public void setPrzebicie(boolean przebicie) {
        this.przebicie = przebicie;
    }

    public void setCisnienie(double cisnienie) {
        this.cisnienie = cisnienie;
    }

    @Override
    public String toString() {
        return "Kolo{" +
                "cisnienie=" + cisnienie +
                ", przebicie=" + przebicie +
                '}';
    }
}

package Strategia;

public class PodatekNiemcy implements ObliczPodatek {
    private double VAT = 20.0;

    @Override
    public Double kwotaPodatku(int ilosc, double cena) {
        return ilosc * (cena + VAT);
    }
}

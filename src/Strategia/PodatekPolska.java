package Strategia;

public class PodatekPolska implements ObliczPodatek{
    private double VAT = 2137;

    @Override
    public Double kwotaPodatku(int ilosc, double cena) {
        return ilosc * (cena + VAT);
    }
}

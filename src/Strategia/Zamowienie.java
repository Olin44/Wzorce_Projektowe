package Strategia;

public class Zamowienie {

    private double[] towary;
    private ObliczPodatek obliczPodatek;

    public Zamowienie(double[] towary, ObliczPodatek obliczPodatek) {
        this.towary =  towary;
        this.obliczPodatek = obliczPodatek;
    }

    public double obliczPodatek(){
        double suma = 0;
        for(double cena : towary){
            suma += obliczPodatek.kwotaPodatku(2, cena);
        }
        return suma;
    }
}

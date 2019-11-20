package Bridge;

public class Prostokat extends Figura{

    @Override
    public void rysuj() {
        System.out.println("Rysuję prostokąt");
    }

    @Override
    public void rysujLinie() {
        bibliotekaV1.rysujLinie();
        bibliotekaV2.rysujLinie();
    }

    @Override
    public void rysujOkrag() {
        bibliotekaV1.rysujOkrag();
        bibliotekaV2.rysujOkrag();
    }
}

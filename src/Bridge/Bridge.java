package Bridge;

public class Bridge {
    public static void main(String[] args) {
        Okrag okrag = new Okrag();
        Prostokat prostokat = new Prostokat();
        Figura[] figury = {okrag, prostokat};

        for(Figura figura : figury){
            figura.rysuj();
            figura.rysujLinie();
            figura.rysujOkrag();
        }

    }
}

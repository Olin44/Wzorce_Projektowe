package Adapter;

import java.util.ArrayList;
import java.util.List;

public class Adapter {

    public static void main(String[] args) {
        Kwadrat kwadrat = new Kwadrat();
        Linia linia = new Linia();
        Punkt punkt = new Punkt();
        Okrag okrag = new Okrag(new XXOkragImpl());
        List<Figura> kolekcjaFigur = new ArrayList<>();
        kolekcjaFigur.add(kwadrat);
        kolekcjaFigur.add(linia);
        kolekcjaFigur.add(okrag);
        kolekcjaFigur.add(punkt);

        for(Figura figura : kolekcjaFigur){
            System.out.println(figura.wyswietl());
        }
    }
}

package Adapter;

public class Okrag extends Figura {
    private XXOkragImpl xxOkrag;

    public Okrag(XXOkragImpl xxOkrag){
        this.xxOkrag = xxOkrag;
    }

    public void wypelnij(){
        xxOkrag.wypelniaj();
    }

    public void usun(){
        xxOkrag.usuwaj();
    }

    public void nadajKolor(){
        xxOkrag.ustawKolor();
    }

    public String wyswietl(){
        return xxOkrag.wyswietlaj();
    }
}

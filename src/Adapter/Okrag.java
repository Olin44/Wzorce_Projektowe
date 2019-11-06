package Adapter;

public class Okrag extends Figura {
    private XXOkrag xxOkrag;

    public Okrag(XXOkrag xxOkrag){
        this.xxOkrag = xxOkrag;
    }

    @Override
    public void wypelnij(){
        xxOkrag.wypelniaj();
    }

    @Override
    public void usun(){
        xxOkrag.usuwaj();
    }

    @Override
    public void nadajKolor(){
        xxOkrag.ustawKolor();
    }

    @Override
    public String wyswietl(){
        return xxOkrag.wyswietlaj();
    }
}

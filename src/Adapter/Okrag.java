package Adapter;

public class Okrag extends Figura {
    private XXOkragImpl xxOkrag;

    public Okrag(XXOkragImpl xxOkrag){
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

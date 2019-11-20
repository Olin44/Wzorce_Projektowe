package Bridge;

public abstract class Figura {

    BibliotekaV1 bibliotekaV1 = new BibliotekaV1();
    BibliotekaV2 bibliotekaV2 = new BibliotekaV2();

    public abstract void rysuj();
    public abstract void rysujLinie();
    public abstract void rysujOkrag();
}

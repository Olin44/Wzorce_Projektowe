package Bridge;

public class BibliotekaV2 implements Biblioteka{

    @Override
    public void rysujLinie() {
        BG2.narysujLinie();
    }

    @Override
    public void rysujOkrag() {
        BG2.narysujOkrag();
    }
}

package Bridge;

public class BibliotekaV1 implements Biblioteka{

    @Override
    public void rysujLinie() {
        BG1.narysujLinie();
    }

    @Override
    public void rysujOkrag() {
        BG1.narysujOkrag();
    }
}

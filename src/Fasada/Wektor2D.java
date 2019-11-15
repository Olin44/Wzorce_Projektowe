package Fasada;

public class Wektor2D {
    private int x;
    private int y;

    public Wektor2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Wektor2D dodaj(Wektor2D wektor){
        Wektor3D otherWektor = new Wektor3D(wektor.x, wektor.y, 0);
        Wektor3D thisWektor = new Wektor3D(this.x, this.y, 0);
        Wektor3D finalWektor = thisWektor.dodaj(otherWektor);
        return new Wektor2D(finalWektor.getX(), finalWektor.getY());
    }

    @Override
    public String toString() {
        return "Wektor2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
package Fasada;

public class Wektor3D {
    private int x;
    private int y;
    private int z;

    public Wektor3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Wektor3D dodaj(Wektor3D wektor){
        int x = this.x + wektor.x;
        int y = this.y + wektor.y;
        int z = this.z + wektor.z;
        return new Wektor3D(x,y,z);
    }

    @Override
    public String toString() {
        return "Wektor3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}

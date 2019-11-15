package Fasada;

public class Fasada {
    public static void main(String[] args){
    Wektor2D wektor = new Wektor2D(1,2);
    Wektor2D otherWektor = new Wektor2D(3,4);
    System.out.println(wektor.toString());
    System.out.println(otherWektor.toString());
    wektor.dodaj(otherWektor);
    Wektor2D resultWektor = wektor.dodaj(otherWektor);
    System.out.println(resultWektor);
    }
}

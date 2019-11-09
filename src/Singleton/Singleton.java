package Singleton;

//Singleton z lazy loading
public class Singleton {
    private static Singleton INSTANCE;

    private Singleton() {
        if (INSTANCE != null) {
            throw new IllegalStateException("Singleton already constructed");
        }
    }

    public static Singleton getInstance() {
        if(INSTANCE == null) {
            System.out.println("Wywołanie konstuktora");
            INSTANCE = new Singleton();
        }
        else{
            System.out.println("Obiekt został już stworzony");
        }
        return INSTANCE;
    }

    public void gadajaca1(){
        System.out.println("Gadająca 1");
    }

    public void gadajaca2(){
        System.out.println("Gadająca 2");
    }
}

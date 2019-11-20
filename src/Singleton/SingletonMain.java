package Singleton;

import java.lang.reflect.Constructor;

public class SingletonMain {
    public static void main(String[] args){
        Singleton singleton = Singleton.getInstance();

        singleton.gadajaca1();
        singleton.gadajaca2();

        Singleton singleton2 = Singleton.getInstance();
        singleton2.gadajaca1();
        singleton2.gadajaca2();
    }
}

package TemplateMethod;

public abstract class SzablonZapytania {
    public String wykonajZapytanie(String nazwaDB, String specZapyt){
        String komendaDB;
        System.out.println(formatujConnect(nazwaDB));
        komendaDB = formatujSelect(specZapyt);
        return komendaDB;
    }

    public abstract String formatujConnect(String nazwaDB);
    public abstract String formatujSelect(String specZapyt);

}

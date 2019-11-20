package TemplateMethod;

public abstract class SzablonZapytania {

    public String wykonajZapytanie(String nazwaDB, String specZapyt){

        System.out.println(formatujConnect(nazwaDB));

        return formatujSelect(specZapyt);
    }

    public abstract String formatujConnect(String nazwaDB);
    public abstract String formatujSelect(String specZapyt);

}

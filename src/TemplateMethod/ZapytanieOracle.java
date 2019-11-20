package TemplateMethod;

public class ZapytanieOracle extends SzablonZapytania {
    @Override
    public String formatujConnect(String nazwaDB) {
        return "Nawiązano połączenie z bazą" + nazwaDB;
    }

    @Override
    public String formatujSelect(String specZapyt) {
        return specZapyt + ";";
    }
}

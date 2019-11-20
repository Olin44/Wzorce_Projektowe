package TemplateMethod;

public class ZapytanieSQLServer extends SzablonZapytania{
    @Override
    public String formatujConnect(String nazwaDB) {
        return "Nazwiązano połączenie z bazą " + nazwaDB;
    }

    @Override
    public String formatujSelect(String specZapyt) {
        return specZapyt;
    }
}

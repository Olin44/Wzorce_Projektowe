package TemplateMethod;

public class TemplateMethod {
    public static void main(String[] args) {

        String zapytanie = "insert into tabela values dane";

        ZapytanieOracle zapytanieOracle = new ZapytanieOracle();
        ZapytanieSQLServer zapytanieSQLServer = new ZapytanieSQLServer();

        System.out.println(zapytanieOracle.wykonajZapytanie("Oracle", zapytanie));
        System.out.println(zapytanieSQLServer.wykonajZapytanie("SQLServer", zapytanie));
    }
}

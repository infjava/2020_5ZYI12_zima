public class Banka {
    public Ucet zalozUcet(String menoVlastnika) {
        String iban = "SK1234567";
        return new Ucet(menoVlastnika, iban);
    }
}

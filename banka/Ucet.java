public class Ucet {
    private long zostatokVCentoch;
    private String menoVlastnika;
    private String iban;
    
    public Ucet(String menoVlastnika, String iban) {
        this.zostatokVCentoch = 0;
        this.menoVlastnika = menoVlastnika;
        this.iban = iban;
    }
    
    public String getIban() {
        return this.iban;
    }
}

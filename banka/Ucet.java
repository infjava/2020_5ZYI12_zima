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
    
    public void vlozPeniaze(int eur, int centov) {
        if (centov < 100) {
            if (eur >= 0 && centov >= 0) {
                this.zostatokVCentoch += eur * 100 + centov;
            }
        }
    }
    
    public void vyberPeniaze(int eur, int centov) {
        if (centov < 100) {
            if (eur >= 0 && centov >= 0) {
                if (this.zostatokVCentoch >= eur * 100 + centov) {
                    this.zostatokVCentoch -= eur * 100 + centov;
                }
            }
        }
    }
    
    public String getZostatok() {
        // 123,10 € // 12310
        return String.format("%d,%02d €", this.zostatokVCentoch / 100, this.zostatokVCentoch % 100);
    }
}

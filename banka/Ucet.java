public class Ucet {
    private long zostatokVCentoch;
    private String menoVlastnika;
    private String iban;
    private Banka banka;
    
    public Ucet(Banka banka, String menoVlastnika, String iban) {
        this.zostatokVCentoch = 0;
        this.menoVlastnika = menoVlastnika;
        this.iban = iban;
        this.banka = banka;
    }
    
    public String getIban() {
        return this.iban;
    }
    
    public void vlozPeniaze(int eur, int centov) {
        if (centov >= 100) {
            System.out.println("Nespravny pocet centov");
            return;
        }
        
        if (eur < 0 || centov < 0) {
            System.out.println("Nespravny pocet eur");
            return;
        }
        
        this.zostatokVCentoch += eur * 100 + centov;
    }
    
    public void vyberPeniaze(int eur, int centov) {
        if (centov >= 100) {
            System.out.println("Nespravny pocet centov");
            return;
        }
        
        if (eur < 0 || centov < 0) {
            System.out.println("Nespravny pocet eur");
            return;
        }
        
        if (this.zostatokVCentoch < eur * 100 + centov) {
            System.out.println("Nemas dost financii");
            return;
        }
        
        this.zostatokVCentoch -= eur * 100 + centov;
    }
    
    public String getZostatok() {
        // 123,10 € // 12310
        return String.format("%d,%02d €", this.zostatokVCentoch / 100, this.zostatokVCentoch % 100);
    }
    
    public void vlozUroky(int percentoUrokov) {
        this.zostatokVCentoch += this.zostatokVCentoch * percentoUrokov / 100;
    }
    
    public void prevedPeniaze(String cielovyIban, int eur, int centov) {
        if (centov >= 100) {
            System.out.println("Nespravny pocet centov");
            return;
        }
        
        if (eur < 0 || centov < 0) {
            System.out.println("Nespravny pocet eur");
            return;
        }
        
        if (this.zostatokVCentoch < eur * 100 + centov) {
            System.out.println("Nemas dost financii");
            return;
        }
        
        Ucet cielovyUcet = this.banka.getUcet(cielovyIban);
        
        if (cielovyUcet == null) {
            System.out.println("Neexistujuci ucet");
            return;
        }
        
        this.zostatokVCentoch -= eur * 100 + centov;
        cielovyUcet.zostatokVCentoch += eur * 100 + centov;
    }
}

import java.util.Random;

public class Banka {
    private String kodBanky;
    
    public Banka(String kodBanky) {
        this.kodBanky = kodBanky;
    }
    
    public Ucet zalozUcet(String menoVlastnika) {
        Random nahodneCisla = new Random();
        
        int kontrolneCislice = 68;
        int bban1 = nahodneCisla.nextInt(100);
        int bban2 = nahodneCisla.nextInt(100000000);
        String iban = String.format("SK%02d%s000000%02d%08d", kontrolneCislice, this.kodBanky, bban1, bban2);
        
        return new Ucet(menoVlastnika, iban);
    }
}

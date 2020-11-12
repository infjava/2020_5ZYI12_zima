import java.util.ArrayList;
import java.util.Random;
import java.math.BigInteger;

public class Banka {
    private String kodBanky;
    private ArrayList<Ucet> ucty;
    
    public Banka(String kodBanky) {
        this.kodBanky = kodBanky;
        this.ucty = new ArrayList<Ucet>();
    }
    
    public Ucet zalozUcet(String menoVlastnika) {
        Random nahodneCisla = new Random();
        
        int bban1 = nahodneCisla.nextInt(100);
        int bban2 = nahodneCisla.nextInt(100000000);
        
        BigInteger ibanPreVypocet = new BigInteger(String.format("%s000000%02d%08d282000", this.kodBanky, bban1, bban2));
        int kontrolneCislice = 98 - ibanPreVypocet.mod(new BigInteger("97")).intValue();
        
        String iban = String.format("SK%02d%s000000%02d%08d", kontrolneCislice, this.kodBanky, bban1, bban2);
        
        Ucet novyUcet = new Ucet(menoVlastnika, iban);
        
        this.ucty.add(novyUcet);
        
        return novyUcet;
    }
    
    public void zaratajUroky(int percentoUrokov) {
        for (Ucet spracovavany : this.ucty) {
            spracovavany.vlozUroky(percentoUrokov);
        }
    }
}

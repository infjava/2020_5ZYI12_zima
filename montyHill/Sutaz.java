import java.util.Random;

public class Sutaz {
    private Dvere[] dvere;
    
    public Sutaz() {
        Random nahodneCisla = new Random();
        
        this.dvere = new Dvere[3];
        
        int vyherneDvere = nahodneCisla.nextInt(3);
        
        for (int i = 0; i < 3; i++) {
            this.dvere[i] = new Dvere(i == vyherneDvere);
        }
    }
}

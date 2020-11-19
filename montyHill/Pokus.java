import java.util.Random;

public class Pokus {
    private boolean maZmenitVolbu;
    private Sutaz sutaz;
    
    public Pokus(boolean maZmenitVolbu) {
        this.maZmenitVolbu = maZmenitVolbu;
        this.sutaz = new Sutaz();
    }
    
    public void vykonajPokus() {
        Random nahodneCisla = new Random();
        
        this.sutaz.zvolDvere(nahodneCisla.nextInt(3));
        
        this.sutaz.otvorDvere(nahodneCisla.nextInt(3));
        
        if (this.maZmenitVolbu) {
            this.sutaz.zvolDvere(nahodneCisla.nextInt(3));
        }
    }
    
    public boolean jeVyhra() {
        return this.sutaz.jeVyhra();
    }
}

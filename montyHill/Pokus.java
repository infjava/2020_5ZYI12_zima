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
        
        int cislo;
        do {
            cislo = nahodneCisla.nextInt(3);
        } while (!this.sutaz.dajuSaDvereOtvorit(cislo));
        this.sutaz.otvorDvere(cislo);
        
        if (this.maZmenitVolbu) {
            do {
                cislo = nahodneCisla.nextInt(3);
            } while (!this.sutaz.dajuSaDvereZvolit(cislo));
            this.sutaz.zvolDvere(cislo);
        }
    }
    
    public boolean jeVyhra() {
        return this.sutaz.jeVyhra();
    }
}

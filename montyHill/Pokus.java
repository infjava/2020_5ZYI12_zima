import java.util.Random;

public class Pokus {
    private Random nahodneCisla;
    private boolean maZmenitVolbu;
    private Sutaz sutaz;
    
    public Pokus(Random nahodneCisla, boolean maZmenitVolbu) {
        this.nahodneCisla = nahodneCisla;
        this.maZmenitVolbu = maZmenitVolbu;
        this.sutaz = new Sutaz(this.nahodneCisla);
    }
    
    public void vykonajPokus() {
        this.sutaz.zvolDvere(this.nahodneCisla.nextInt(3));
        
        int cislo;
        do {
            cislo = this.nahodneCisla.nextInt(3);
        } while (!this.sutaz.dajuSaDvereOtvorit(cislo));
        this.sutaz.otvorDvere(cislo);
        
        if (this.maZmenitVolbu) {
            do {
                cislo = this.nahodneCisla.nextInt(3);
            } while (!this.sutaz.dajuSaDvereZvolit(cislo));
            this.sutaz.zvolDvere(cislo);
        }
    }
    
    public boolean jeVyhra() {
        return this.sutaz.jeVyhra();
    }
}

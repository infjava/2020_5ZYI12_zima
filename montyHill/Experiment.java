import java.util.Random;

public class Experiment {
    private int pocetOpakovani;
    private boolean maZmenitVolbu;
    private int pocetVyhier;
    
    public Experiment(int pocetOpakovani, boolean maZmenitVolbu) {
        this.pocetOpakovani = pocetOpakovani;
        this.maZmenitVolbu = maZmenitVolbu;
        this.pocetVyhier = 0;
    }
    
    public void vykonaj() {
        Random nahodneCisla = new Random();
        
        for (int i = 0; i < this.pocetOpakovani; i++) {
            Pokus pokus = new Pokus(nahodneCisla, this.maZmenitVolbu);
            pokus.vykonajPokus();
            if (pokus.jeVyhra()) {
                this.pocetVyhier++;
            }
        }
    }
    
    public int getPocetVyhier() {
        return this.pocetVyhier;
    }
}

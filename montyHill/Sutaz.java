import java.util.Random;

public class Sutaz {
    private Dvere[] dvere;
    
    public Sutaz(Random nahodneCisla) {
        this.dvere = new Dvere[3];
        
        int vyherneDvere = nahodneCisla.nextInt(3);
        
        for (int i = 0; i < 3; i++) {
            this.dvere[i] = new Dvere(i == vyherneDvere);
        }
    }
    
    public void zvolDvere(int cislo) {
        for (Dvere aktualne : this.dvere) {
            aktualne.zrusVolbu();
        }
        
        this.dvere[cislo].zvol();
    }
    
    public boolean jeVyhra() {
        for (Dvere aktualne : this.dvere) {
            if (aktualne.predstavujuVyhru()) {
                return true;
            }
        }
        
        return false;
    }
    
    public void otvorDvere(int cislo) {
        this.dvere[cislo].otvor();
    }
    
    public boolean dajuSaDvereOtvorit(int cislo) {
        return this.dvere[cislo].dateSaOtvorit();
    }
    
    public boolean dajuSaDvereZvolit(int cislo) {
        return this.dvere[cislo].dateSaZvolit();
    }
}

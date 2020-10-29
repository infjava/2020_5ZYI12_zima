public class Pad {
    private Obdlznik grafika;
    private int poziciaY;
    
    public Pad(boolean stranaPrava) {
        this.grafika = new Obdlznik();
        
        this.grafika.zmenStrany(5, 50);
        
        this.poziciaY = 125;
        this.grafika.posunZvisle(75);
        if (stranaPrava) {
            this.grafika.posunVodorovne(235);
        } else {
            this.grafika.posunVodorovne(-60);
        }
        
        this.grafika.zobraz();
    }
    
    public void posunDole() {
        if (this.poziciaY < 250) {
            this.grafika.posunZvisle(5);
            this.poziciaY = this.poziciaY + 5;
        }
    }
    
    public void posunHore() {
        if (this.poziciaY > 0) {
            this.grafika.posunZvisle(-5);
            this.poziciaY = this.poziciaY - 5;
        }
    }
}

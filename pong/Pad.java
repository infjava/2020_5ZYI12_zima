public class Pad {
    private Obdlznik grafika;
    
    private int poziciaX;
    private int poziciaY;
    
    public Pad(boolean stranaPrava) {
        this.grafika = new Obdlznik();
        
        this.grafika.zmenStrany(5, 50);
        
        this.poziciaY = 125;
        this.grafika.posunZvisle(75);
        if (stranaPrava) {
            this.grafika.posunVodorovne(235);
            this.poziciaX = 295;
        } else {
            this.grafika.posunVodorovne(-60);
            this.poziciaX = 0;
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
    
    public boolean kolidujeS(Lopticka lopticka) {
        int loptickaX = lopticka.getStredX();
        int loptickaY = lopticka.getStredY();
        
        int padHornyX = this.poziciaX;
        int padHornyY = this.poziciaY;
        
        int padDolnyX = this.poziciaX + 5;
        int padDolnyY = this.poziciaY + 50;
        
        return padHornyX <= loptickaX && loptickaX <= padDolnyX && padHornyY <= loptickaY && loptickaY <= padDolnyY;
    }
}

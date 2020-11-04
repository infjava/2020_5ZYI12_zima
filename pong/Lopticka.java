import java.util.Random;

public class Lopticka {
    private Kruh grafika;
    
    private int smerX;
    private int smerY;
    
    private int poziciaY;
    private int poziciaX;
    
    public Lopticka() {
        Random nahodneCisla = new Random();
        
        this.grafika = new Kruh();
        
        this.grafika.zmenPriemer(10);
        
        this.poziciaY = nahodneCisla.nextInt(261) + 20;
        this.poziciaX = 145;
        
        this.grafika.posunVodorovne(125);
        this.grafika.posunZvisle(this.poziciaY - 60);
        
        this.grafika.zobraz();
        
        switch (nahodneCisla.nextInt(4)) {
            case 0:
                this.smerX = -5;
                this.smerY = 5;
                break;
            case 1:
                this.smerX = 5;
                this.smerY = 5;
                break;
            case 2:
                this.smerX = -5;
                this.smerY = -5;
                break;
            default:
                this.smerX = 5;
                this.smerY = -5;
                break;
        }
    }
    
    public void posunSa() {
        if (this.poziciaY <= 0 || this.poziciaY >= 300) {
            this.smerY = -this.smerY;
        }
        
        this.grafika.skry();
        
        this.grafika.posunVodorovne(this.smerX);
        this.grafika.posunZvisle(this.smerY);
        
        this.poziciaY += this.smerY;
        this.poziciaX += this.smerX;
        
        this.grafika.zobraz();
    }
    
    public int getStredX() {
        return this.poziciaX + 5;
    }
    
    public int getStredY() {
        return this.poziciaY + 5;
    }
    
    public void odrazX() {
        this.smerX = -this.smerX;
    }
}

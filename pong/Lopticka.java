import java.util.Random;

public class Lopticka {
    private Kruh grafika;
    private int smerX;
    private int smerY;
    
    public Lopticka() {
        Random nahodneCisla = new Random();
        
        this.grafika = new Kruh();
        
        this.grafika.zmenPriemer(10);
        
        int poziciaY = nahodneCisla.nextInt(261) + 20;
        
        this.grafika.posunVodorovne(125);
        this.grafika.posunZvisle(poziciaY - 60);
        
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
        this.grafika.skry();
        
        this.grafika.posunVodorovne(this.smerX);
        this.grafika.posunZvisle(this.smerY);
        
        this.grafika.zobraz();
    }
}

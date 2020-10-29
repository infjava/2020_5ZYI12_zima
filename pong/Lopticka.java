public class Lopticka {
    private Kruh grafika;
    private int smerX;
    private int smerY;
    
    public Lopticka() {
        this.grafika = new Kruh();
        
        this.grafika.zmenPriemer(10);
        
        this.grafika.posunVodorovne(125);
        this.grafika.posunZvisle(85);
        
        this.grafika.zobraz();
        
        this.smerX = -5;
        this.smerY = 5;
    }
    
    public void posunSa() {
        this.grafika.skry();
        
        this.grafika.posunVodorovne(this.smerX);
        this.grafika.posunZvisle(this.smerY);
        
        this.grafika.zobraz();
    }
}

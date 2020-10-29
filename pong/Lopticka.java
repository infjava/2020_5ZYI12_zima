public class Lopticka {
    private Kruh grafika;
    private String smer;
    
    public Lopticka() {
        this.grafika = new Kruh();
        
        this.grafika.zmenPriemer(10);
        
        this.grafika.posunVodorovne(125);
        this.grafika.posunZvisle(85);
        
        this.grafika.zobraz();
        
        this.smer = "LD";
    }
    
    public void posunSa() {
        this.grafika.skry();
        
        if (this.smer.equals("LD")) {
            this.grafika.posunVodorovne(-5);
            this.grafika.posunZvisle(5);
        } else if (this.smer.equals("LH")) {
            this.grafika.posunVodorovne(-5);
            this.grafika.posunZvisle(-5);
        } else if (this.smer.equals("PD")) {
            this.grafika.posunVodorovne(5);
            this.grafika.posunZvisle(5);
        } else if (this.smer.equals("PH")) {
            this.grafika.posunVodorovne(5);
            this.grafika.posunZvisle(-5);
        }
        
        this.grafika.zobraz();
    }
}

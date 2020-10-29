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
        
        switch (this.smer) {
            case "LD":
                this.grafika.posunVodorovne(-5);
                this.grafika.posunZvisle(5);
                break;
            case "LH":
                this.grafika.posunVodorovne(-5);
                this.grafika.posunZvisle(-5);
                break;
            case "PD":
                this.grafika.posunVodorovne(5);
                this.grafika.posunZvisle(5);
                break;
            case "PH":
                this.grafika.posunVodorovne(5);
                this.grafika.posunZvisle(-5);
                break;
        }
        
        this.grafika.zobraz();
    }
}

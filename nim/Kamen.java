public class Kamen {
    private Kruh kamen;
    
    public Kamen(Sachovnica sachovnica) {
        this.kamen = new Kruh();
        this.kamen.zmenPriemer(18);
        this.kamen.posunVodorovne(-19 + (sachovnica.getSirka() - 1) * 20);
        this.kamen.posunZvisle(-59);
        this.kamen.zobraz();
    }
    
    public void zobraz() {
        this.kamen.zobraz();
    }
    
    public void skry() {
        this.kamen.skry();
    }
}

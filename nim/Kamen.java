public class Kamen {
    private Kruh kamen;
    
    private int poziciaStlpec;
    private int poziciaRiadok;
    
    public Kamen(Sachovnica sachovnica) {
        this.kamen = new Kruh();
        this.kamen.zmenPriemer(18);
        this.kamen.posunVodorovne(-19 + (sachovnica.getSirka() - 1) * 20);
        this.kamen.posunZvisle(-59);
        
        this.poziciaStlpec = sachovnica.getSirka();
        this.poziciaRiadok = sachovnica.getVyska();
        
        if (sachovnica.getJeZobrazena()) {
            this.kamen.zobraz();
        }
    }
    
    public void zobraz() {
        this.kamen.zobraz();
    }
    
    public void skry() {
        this.kamen.skry();
    }
    
    public int getRiadok() {
        return this.poziciaRiadok;
    }
    
    public int getStlpec() {
        return this.poziciaStlpec;
    }
    
    public void posunSa(int riadok, int stlpec) {
        int posunStlpce = stlpec - this.poziciaStlpec;
        int posunRiadky = riadok - this.poziciaRiadok;
        
        this.kamen.posunVodorovne(posunStlpce * 20);
        this.kamen.posunZvisle(-posunRiadky * 20);
        
        this.poziciaRiadok = riadok;
        this.poziciaStlpec = stlpec;
    }
}

public class Nim {
    private Kamen kamen;
    private Sachovnica sachovnica;
    private String[] menaHracov;
    private int indexHracaNaTahu;
    private String menoVyhercu;
    
    public Nim(int sirkaSachovnice, int vyskaSachovnice, String menoPrveho, String menoDruheho) {
        this.sachovnica = new Sachovnica(sirkaSachovnice, vyskaSachovnice);
        this.kamen = sachovnica.polozKamen();
        this.sachovnica.zobraz();
        this.menaHracov = new String[] { menoPrveho, menoDruheho };
        this.indexHracaNaTahu = 0;
        this.menoVyhercu = null;
    }
    
    public String getMenoVyhercu() {
        return this.menoVyhercu;
    }
    
    public String getMenoHracaNaTahu() {
        return this.menaHracov[this.indexHracaNaTahu];
    }
    
    public void posunDole(int pocetPolicok) {
        this.posun(pocetPolicok, 0);
    }
    
    public void posunVlavo(int pocetPolicok) {
        this.posun(0, pocetPolicok);
    }
    
    private void posun(int pocetPolicokRiadok, int pocetPolicokStlpec) {
        if (pocetPolicokRiadok <= 0 && pocetPolicokStlpec <= 0) {
            return;
        }
        
        int novyRiadok = this.kamen.getRiadok() - pocetPolicokRiadok;
        int novyStlpec = this.kamen.getStlpec() - pocetPolicokStlpec;
        
        if (novyRiadok < 1) {
            return;
        }
        
        if (novyStlpec < 1) {
            return;
        }

        this.kamen.posunSa(novyRiadok, novyStlpec);
        
        if (novyRiadok == 1 && novyStlpec == 1) {
            this.menoVyhercu = this.getMenoHracaNaTahu();
        }
        
        this.indexHracaNaTahu = (this.indexHracaNaTahu + 1) % this.menaHracov.length;
        
        if (this.getMenoHracaNaTahu().equals("PC")) {
            this.tahPocitaca();
        }
    }
    
    private void tahPocitaca() {
        int riadok = this.kamen.getRiadok();
        int stlpec = this.kamen.getStlpec();
        
        if (riadok > stlpec) {
            this.posunDole(riadok - stlpec);
        } else if (stlpec > riadok) {
            this.posunVlavo(stlpec - riadok);
        } else  {
            // nahodny tah
        }
    }
}

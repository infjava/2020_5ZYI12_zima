public class Nim {
    private Kamen kamen;
    private Sachovnica sachovnica;
    private String[] menaHracov;
    private int indexHracaNaTahu;
    
    public Nim(int sirkaSachovnice, int vyskaSachovnice, String menoPrveho, String menoDruheho) {
        this.sachovnica = new Sachovnica(sirkaSachovnice, vyskaSachovnice);
        this.kamen = sachovnica.polozKamen();
        this.sachovnica.zobraz();
        this.menaHracov = new String[] { menoPrveho, menoDruheho };
        this.indexHracaNaTahu = 0;
    }
    
    public String getMenoHracaNaTahu() {
        return this.menaHracov[this.indexHracaNaTahu];
    }
    
    public void posunDole(int pocetPolicok) {
        if (pocetPolicok <= 0) {
            return;
        }
        
        int novyRiadok = this.kamen.getRiadok() - pocetPolicok;
        int novyStlpec = this.kamen.getStlpec();
        
        if (novyRiadok < 1) {
            return;
        }
        
        this.kamen.posunSa(novyRiadok, novyStlpec);
        
        this.indexHracaNaTahu = (this.indexHracaNaTahu + 1) % this.menaHracov.length;
    }
    
    public void posunVlavo(int pocetPolicok) {
        if (pocetPolicok <= 0) {
            return;
        }
        
        int novyRiadok = this.kamen.getRiadok();
        int novyStlpec = this.kamen.getStlpec() - pocetPolicok;
        
        if (novyStlpec < 1) {
            return;
        }

        this.kamen.posunSa(novyRiadok, novyStlpec);
        
        this.indexHracaNaTahu = (this.indexHracaNaTahu + 1) % this.menaHracov.length;
    }
}

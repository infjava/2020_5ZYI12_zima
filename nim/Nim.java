public class Nim {
    private Kamen kamen;
    private Sachovnica sachovnica;
    private String menoPrveho;
    private String menoDruheho;
    private String menoHracaNaTahu;
    
    public Nim(int sirkaSachovnice, int vyskaSachovnice, String menoPrveho, String menoDruheho) {
        this.sachovnica = new Sachovnica(sirkaSachovnice, vyskaSachovnice);
        this.kamen = sachovnica.polozKamen();
        this.sachovnica.zobraz();
        this.menoPrveho = menoPrveho;
        this.menoDruheho = menoDruheho;
        this.menoHracaNaTahu = menoPrveho;
    }
    
    public String getMenoHracaNaTahu() {
        return this.menoHracaNaTahu;
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
        
        if (this.menoHracaNaTahu.equals(this.menoPrveho))
            this.menoHracaNaTahu = this.menoDruheho;
        else
            this.menoHracaNaTahu = this.menoPrveho;
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
        
        if (this.menoHracaNaTahu.equals(this.menoPrveho))
            this.menoHracaNaTahu = this.menoDruheho;
        else
            this.menoHracaNaTahu = this.menoPrveho;
    }
}

public class Nim {
    private Kamen kamen;
    private Sachovnica sachovnica;
    private String menoPrveho;
    private String menoDruheho;
    private boolean jePrvyNaTahu;
    
    public Nim(int sirkaSachovnice, int vyskaSachovnice, String menoPrveho, String menoDruheho) {
        this.sachovnica = new Sachovnica(sirkaSachovnice, vyskaSachovnice);
        this.kamen = sachovnica.polozKamen();
        this.sachovnica.zobraz();
        this.menoPrveho = menoPrveho;
        this.menoDruheho = menoDruheho;
        this.jePrvyNaTahu = true;
    }
    
    public String getMenoHracaNaTahu() {
        if (this.jePrvyNaTahu) {
            return this.menoPrveho;
        } else {
            return this.menoDruheho;
        }
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
        
        this.jePrvyNaTahu = !this.jePrvyNaTahu;
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
        
        this.jePrvyNaTahu = !this.jePrvyNaTahu;
    }
}

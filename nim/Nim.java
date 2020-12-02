public class Nim {
    private Kamen kamen;
    private Sachovnica sachovnica;
    private String menoDalsiehoHraca;
    private String menoHracaNaTahu;
    
    public Nim(int sirkaSachovnice, int vyskaSachovnice, String menoPrveho, String menoDruheho) {
        this.sachovnica = new Sachovnica(sirkaSachovnice, vyskaSachovnice);
        this.kamen = sachovnica.polozKamen();
        this.sachovnica.zobraz();
        this.menoHracaNaTahu = menoPrveho;
        this.menoDalsiehoHraca = menoDruheho;
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
        
        String odlozeneMeno = this.menoHracaNaTahu;
        this.menoHracaNaTahu = this.menoDalsiehoHraca;
        this.menoDalsiehoHraca = odlozeneMeno;
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
        
        String odlozeneMeno = this.menoHracaNaTahu;
        this.menoHracaNaTahu = this.menoDalsiehoHraca;
        this.menoDalsiehoHraca = odlozeneMeno;
    }
}

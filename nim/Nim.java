public class Nim {
    private Kamen kamen;
    private Sachovnica sachovnica;
    
    public Nim(int sirkaSachovnice, int vyskaSachovnice) {
        this.sachovnica = new Sachovnica(sirkaSachovnice, vyskaSachovnice);
        this.kamen = sachovnica.polozKamen();
        this.sachovnica.zobraz();
    }
    
    public void posunDole(int pocetPolicok) {
        int novyRiadok = this.kamen.getRiadok() - pocetPolicok;
        int novyStlpec = this.kamen.getStlpec();
        
        this.kamen.posunSa(novyRiadok, novyStlpec);
    }
    
    public void posunVlavo(int pocetPolicok) {
        int novyRiadok = this.kamen.getRiadok();
        int novyStlpec = this.kamen.getStlpec() - pocetPolicok;

        this.kamen.posunSa(novyRiadok, novyStlpec);
    }
}

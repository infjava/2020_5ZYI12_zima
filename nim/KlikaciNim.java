public class KlikaciNim {
    private Nim hra;
    private int vyskaSachovnice;
    
    public KlikaciNim(int sirkaSachovnice, int vyskaSachovnice, String menoPrveho, String menoDruheho) {
        this.hra = new Nim(sirkaSachovnice, vyskaSachovnice, menoPrveho, menoDruheho);
        Manazer manazer = new Manazer();
        manazer.spravujObjekt(this);
        
        this.vyskaSachovnice = vyskaSachovnice;
        
        System.out.format("Hru zacina '%s'%n", this.hra.getMenoHracaNaTahu());
    }
    
    public void vyberSuradnice(int x, int y) {
        int riadok = this.vyskaSachovnice - y / Sachovnica.VELKOST_POLICKA;
        int stlpec = x / Sachovnica.VELKOST_POLICKA + 1;
        
        int posunRiadky = this.hra.getPoziciaKamenaRiadok() - riadok;
        int posunStlpce = this.hra.getPoziciaKamenaStlpec() - stlpec;
        
        if (posunStlpce == 0) {
            this.hra.posunDole(posunRiadky);
        } else if (posunRiadky == 0) {
            this.hra.posunVlavo(posunStlpce);
        } else if (posunRiadky == posunStlpce) {
            this.hra.posunSikmo(posunRiadky);
        }
        
        if (this.hra.getMenoVyhercu() == null) {
            System.out.format("V tahu pokracuje '%s'%n", this.hra.getMenoHracaNaTahu());
        } else {
            System.out.format("Hru vyhral '%s'%n", this.hra.getMenoVyhercu());
        }
    }
    
    public void zrus() {
        System.exit(0);
    }
}

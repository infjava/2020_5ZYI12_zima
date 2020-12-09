public class KlikaciNim {
    private Nim hra;
    private int vyskaSachovnice;
    
    public KlikaciNim(int sirkaSachovnice, int vyskaSachovnice, String menoPrveho, String menoDruheho) {
        this.hra = new Nim(sirkaSachovnice, vyskaSachovnice, menoPrveho, menoDruheho);
        Manazer manazer = new Manazer();
        manazer.spravujObjekt(this);
        
        this.vyskaSachovnice = vyskaSachovnice;
    }
    
    public void vyberSuradnice(int x, int y) {
        int riadok = this.vyskaSachovnice - y / 20;
        int stlpec = x / 20 + 1;
        
        int posunRiadky = this.hra.getPoziciaKamenaRiadok() - riadok;
        int posunStlpce = this.hra.getPoziciaKamenaStlpec() - stlpec;
        
        if (posunStlpce == 0) {
            this.hra.posunDole(posunRiadky);
        } else if (posunRiadky == 0) {
            this.hra.posunVlavo(posunStlpce);
        } else if (posunRiadky == posunStlpce) {
            this.hra.posunSikmo(posunRiadky);
        }
    }
}

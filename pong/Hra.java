public class Hra {
    private Lopticka lopticka;
    private Pad lavyPad;
    private Pad pravyPad;
    private Manazer manazer;
    private Score laveScore;
    private Score praveScore;
    
    public Hra() {
        this.lopticka = new Lopticka();
        this.lavyPad = new Pad(false);
        this.pravyPad = new Pad(true);
        this.manazer = new Manazer();
        this.laveScore = new Score(false);
        this.praveScore = new Score(true);
    }
    
    public void tik() {
        this.lopticka.posunSa();
        
        if (this.lavyPad.kolidujeS(this.lopticka) || this.pravyPad.kolidujeS(this.lopticka)) {
            this.lopticka.odrazX();
        }
        
        if (this.lopticka.jeMimoObrazovky()) {
            if (this.lopticka.getStredX() > 150) {
                this.laveScore.zvys();
            } else {
                this.praveScore.zvys();
            }
            
            this.lopticka.vratDoStredu();
        }
    }
    
    public void posunHore() {
        this.lavyPad.posunHore();
    }
    
    public void posunDole() {
        this.lavyPad.posunDole();
    }
    
    public void posunVlavo() {
        this.pravyPad.posunHore();
    }
    
    public void posunVpravo() {
        this.pravyPad.posunDole();
    }
    
    public void zrus() {
        System.exit(0);
    }
    
    public void start() {
        this.manazer.spravujObjekt(this);
    }
}

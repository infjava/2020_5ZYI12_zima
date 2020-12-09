import java.util.ArrayList;

public class Sachovnica {
    public static final int VELKOST_POLICKA = 20;
    
    private ArrayList<Stvorec> policka;
    private ArrayList<Kamen> kamene;
    
    private boolean jeZobrazena;
    
    private int sirka;
    private int vyska;
    
    public Sachovnica(int sirka, int vyska) {
        this.policka = new ArrayList<Stvorec>();
        
        this.sirka = sirka;
        this.vyska = vyska;
        
        for (int riadok = 0; riadok < vyska; riadok++) {
            for (int stlpec = 0; stlpec < sirka; stlpec++) {
                Stvorec policko = new Stvorec();
                policko.zmenStranu(Sachovnica.VELKOST_POLICKA);
                policko.posunVodorovne(stlpec * Sachovnica.VELKOST_POLICKA - 60);
                policko.posunZvisle(riadok * Sachovnica.VELKOST_POLICKA - 50);
                if ((riadok + stlpec) % 2 == vyska % 2) {
                    policko.zmenFarbu("white");
                } else {
                    policko.zmenFarbu("black");
                }
                
                this.policka.add(policko);
            }
        }
        
        this.kamene = new ArrayList<Kamen>();
        
        this.jeZobrazena = false;
    }
    
    public Kamen polozKamen() {
        Kamen kamen = new Kamen(this);
        this.kamene.add(kamen);
        return kamen;
    }
    
    public void zobraz() {
        for (Stvorec policko : this.policka) {
            policko.zobraz();
        }
        
        for (Kamen kamen : this.kamene) {
            kamen.zobraz();
        }
        
        this.jeZobrazena = true;
    }
    
    public void skry() {
        for (Stvorec policko : this.policka) {
            policko.skry();
        }
        
        for (Kamen kamen : this.kamene) {
            kamen.skry();
        }
        
        this.jeZobrazena = false;
    }
    
    public int getSirka() {
        return this.sirka;
    }
    
    public int getVyska() {
        return this.vyska;
    }
    
    public boolean getJeZobrazena() {
        return this.jeZobrazena;
    }
}

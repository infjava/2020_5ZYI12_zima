import java.util.ArrayList;

public class Sachovnica {
    private ArrayList<Stvorec> policka;
    private int sirka;
    private int vyska;
    
    public Sachovnica(int sirka, int vyska) {
        this.policka = new ArrayList<Stvorec>();
        
        this.sirka = sirka;
        this.vyska = vyska;
        
        for (int riadok = 0; riadok < vyska; riadok++) {
            for (int stlpec = 0; stlpec < sirka; stlpec++) {
                Stvorec policko = new Stvorec();
                policko.zmenStranu(20);
                policko.posunVodorovne(stlpec * 20 - 60);
                policko.posunZvisle(riadok * 20 - 50);
                if ((riadok + stlpec) % 2 == vyska % 2) {
                    policko.zmenFarbu("white");
                } else {
                    policko.zmenFarbu("black");
                }
                
                this.policka.add(policko);
            }
        }
    }
    
    public void zobraz() {
        for (Stvorec policko : this.policka) {
            policko.zobraz();
        }
    }
    
    public void skry() {
        for (Stvorec policko : this.policka) {
            policko.skry();
        }
    }
    
    public int getSirka() {
        return this.sirka;
    }
    
    public int getVyska() {
        return this.vyska;
    }
}

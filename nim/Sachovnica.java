public class Sachovnica {
    private Stvorec[] policka;
    
    public Sachovnica(int sirka, int vyska) {
        this.policka = new Stvorec[vyska * sirka];
        
        for (int riadok = 0; riadok < vyska; riadok++) {
            for (int stlpec = 0; stlpec < sirka; stlpec++) {
                Stvorec policko = new Stvorec();
                policko.zmenStranu(20);
                policko.posunVodorovne(stlpec * 20);
                policko.posunZvisle(riadok * 20);
                if ((riadok + stlpec) % 2 == vyska % 2) {
                    policko.zmenFarbu("white");
                } else {
                    policko.zmenFarbu("black");
                }
                policko.zobraz();
                
                this.policka[riadok * sirka + stlpec] = policko;
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
}

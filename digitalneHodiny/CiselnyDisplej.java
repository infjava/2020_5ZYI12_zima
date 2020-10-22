/**
 * Trieda reprezentujuca jeden ciselny displej v digitalnych hodinach.
 * Stara sa o zmenu hodnoty v zadanych hraniciach a o formatovanie
 * cisla do tvaru dvojcifernej hodnoty.
 */
public class CiselnyDisplej {
    private int hornaHranica;
    private int hodnota;
    
    /**
     * Inicializuje ciselny displej na hodnotu 0. Horna hranica sa pouzije
     * ta, co zada pouzivatel v parametri.
     * @param pthis.hornaHranica Predstavuje cislo, ktore hodnota ciselneho
     * displeja nemoze dosiahnut.
     */
    public CiselnyDisplej(int hornaHranica) {
        this.hornaHranica = hornaHranica;
        this.hodnota = 0;
    }
    
    /**
     * Vrati aktualnu hodnotu ciselneho displeja vo forme celeho cisla typu
     * int.
     */
    public int getHodnota() {
        return this.hodnota;
    }
    
    /**
     * Nastavi novu hodnotu ciselneho displeja vo forme celeho cisla typu int.
     * Kontroluje platnost zadavaneho cisla. V pripade, ze je mimo rozsah,
     * nechava povodnu hodnotu.
     * 
     * @param hodnota hodnota, ktora sa ma nastavit.
     */
    public void setHodnota(int hodnota) {
        if (hodnota >= 0) {
            if (hodnota < this.hornaHranica) {
                this.hodnota = hodnota;
            }
        }
    }
    
    /**
     * Vrati hodnotu ciselneho displeja vo forme retazca, pricom hodnota je
     * vzdy vo forme dvojciferneho cisla s pripadnou uvodnou nulou.
     */
    public String getHodnotaAkoRetazec() {
        if (this.hodnota < 10) {
            return "0" + this.hodnota;
        } else {
            return "" + this.hodnota;
        }
    }
    
    public String getHodnotaAkoRetazec12() {
        int hodnota12;
        
        if (this.hodnota == 0) {
            hodnota12 = 12;
        } else if (this.hodnota < 13) {
            hodnota12 = this.hodnota;
        } else {
            hodnota12 = this.hodnota - 12;
        }
        
        if (hodnota12 < 10) {
            return "0" + hodnota12;
        } else {
            return "" + hodnota12;
        }
    }
    
    public String getHodnotaAkoRetazecAMPM() {
        if (this.hodnota < 12) {
            return "AM";
        } else {
            return "PM";
        }
    }
    
    /**
     * Zvacsi hodnotu na ciselnom displeji o hodnotu jedna. Ak dosiahne hornu
     * hranicu, pokracuje znovu od nuly.
     */
    public void krok() {
        this.hodnota = (this.hodnota + 1) % this.hornaHranica;
    }
}

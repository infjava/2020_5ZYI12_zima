public class Tetromino {
    private boolean[][] pixelySvietia;
    
    private int poziciaX;
    private int poziciaY;
    
    public Tetromino(boolean[][] pixelySvietia) {
        this.pixelySvietia = pixelySvietia;
        
        this.poziciaX = (Displej.SIRKA - this.pixelySvietia[0].length) / 2;
        this.poziciaY = 0;
        
        this.nakresli();
    }
    
    public void posunVlavo() {
        if (this.poziciaX <= 0) {
            return;
        }
        
        this.zmaz();
        this.poziciaX--;
        this.nakresli();
    }
    
    public void posunVpravo() {
        if (this.poziciaX >= Displej.SIRKA - this.pixelySvietia[0].length) {
            return;
        }
        
        this.zmaz();
        this.poziciaX++;
        this.nakresli();
    }
    
    public void posunDole() {
        if (this.poziciaY >= Displej.VYSKA - this.pixelySvietia.length) {
            return;
        }
        
        this.zmaz();
        this.poziciaY++;
        this.nakresli();
    }
    
    public void otoc() {
        int staraSirka = this.pixelySvietia[0].length;
        int staraVyska = this.pixelySvietia.length;
        
        int novaSirka = staraVyska;
        int novaVyska = staraSirka;

        boolean[][] novePixely = new boolean[novaVyska][novaSirka];
        
        for (int staraY = 0; staraY < staraVyska; staraY++) {
            for (int staraX = 0; staraX < staraSirka; staraX++) {
                int novaX = staraY;
                int novaY = staraSirka - 1 - staraX;
                novePixely[novaY][novaX] = this.pixelySvietia[staraY][staraX];
            }
        }
        
        this.zmaz();
        this.pixelySvietia = novePixely;
        this.nakresli();
    }
    
    private void zmaz() {
        for (int y = 0; y < this.pixelySvietia.length; y++) {
            for (int x = 0; x < this.pixelySvietia[y].length; x++) {
                Displej displej = Displej.getInstancia();
                displej.zmenStav(x + this.poziciaX, y + this.poziciaY, false);
            }
        }
    }
    
    private void nakresli() {
        for (int y = 0; y < this.pixelySvietia.length; y++) {
            for (int x = 0; x < this.pixelySvietia[y].length; x++) {
                Displej displej = Displej.getInstancia();
                displej.zmenStav(x + this.poziciaX, y + this.poziciaY, this.pixelySvietia[y][x]);
            }
        }
    }
}

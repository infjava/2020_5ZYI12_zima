public class Tetromino {
    private boolean[][] pixelySvietia;
    
    private int poziciaX;
    private int poziciaY;
    
    public Tetromino(boolean[][] pixelySvietia) {
        this.pixelySvietia = pixelySvietia;
        
        this.poziciaX = (Displej.SIRKA - this.pixelySvietia[0].length) / 2;
        this.poziciaY = 0;
    }
    
    public void posunVlavo() {
        this.zmaz();
        this.poziciaX--;
        this.nakresli();
    }
    
    public void posunVpravo() {
        this.zmaz();
        this.poziciaX++;
        this.nakresli();
    }
    
    public void zmaz() {
        for (int y = 0; y < this.pixelySvietia.length; y++) {
            for (int x = 0; x < this.pixelySvietia[y].length; x++) {
                Displej displej = Displej.getInstancia();
                displej.zmenStav(x + this.poziciaX, y + this.poziciaY, false);
            }
        }
    }
    
    public void nakresli() {
        for (int y = 0; y < this.pixelySvietia.length; y++) {
            for (int x = 0; x < this.pixelySvietia[y].length; x++) {
                Displej displej = Displej.getInstancia();
                displej.zmenStav(x + this.poziciaX, y + this.poziciaY, this.pixelySvietia[y][x]);
            }
        }
    }
}

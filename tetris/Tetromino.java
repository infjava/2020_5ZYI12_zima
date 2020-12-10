public class Tetromino {
    private boolean[][] pixelySvietia;
    
    public Tetromino(boolean[][] pixelySvietia) {
        this.pixelySvietia = pixelySvietia;
    }
    
    public void nakresli() {
        for (int y = 0; y < this.pixelySvietia.length; y++) {
            for (int x = 0; x < this.pixelySvietia[y].length; x++) {
                Displej displej = Displej.getInstancia();
                displej.zmenStav(x, y, this.pixelySvietia[y][x]);
            }
        }
    }
}

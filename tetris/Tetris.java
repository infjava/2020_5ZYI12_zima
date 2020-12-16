public class Tetris {
    private Tetromino aktualneTetromino;
    private int cisloTiku;
    
    public Tetris() {
        this.aktualneTetromino = new Tetromino(
            new boolean[][]{{true, true, true}, {false, true, false}}
        );
        
        this.cisloTiku = 0;
        
        new Manazer().spravujObjekt(this);
    }
    
    public void posunVlavo() {
        this.aktualneTetromino.posunVlavo();
    }
    
    public void posunVpravo() {
        this.aktualneTetromino.posunVpravo();
    }
    
    public void aktivuj() {
        this.aktualneTetromino.otoc();
    }
    
    public void zrus() {
        System.exit(0);
    }
    
    public void tik() {
        this.cisloTiku++;
        
        if (this.cisloTiku % 4 != 0) {
            return;
        }
        
        this.aktualneTetromino.posunDole();
    }
}

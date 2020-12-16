public class Tetris {
    private Tetromino aktualneTetromino;
    
    public Tetris() {
        this.aktualneTetromino = new Tetromino(
            new boolean[][]{{true, true, true}, {false, true, false}}
        );
        
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
    
    public void tik() {
        this.aktualneTetromino.posunDole();
    }
}

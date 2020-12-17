public class Tetris {
    private TvoricTetromin tvoric;
    private Tetromino aktualneTetromino;
    private int cisloTiku;
    
    public Tetris() {
        this.tvoric = new TvoricTetromin();
        
        this.aktualneTetromino = this.tvoric.vytvorNahodne();
        
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
        
        if (this.aktualneTetromino.jeUplneDole()) {
            this.aktualneTetromino = this.tvoric.vytvorNahodne();
        }
    }
}

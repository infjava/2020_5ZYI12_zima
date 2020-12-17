public class TvoricTetromin {
    public TvoricTetromin() {
    }
    
    public Tetromino vytvorNahodne() {
        return new Tetromino(
            new boolean[][]{{true, true, true}, {false, true, false}}
        );
    }
}

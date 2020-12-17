import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class TvoricTetromin {
    private ArrayList<boolean[][]> tvary;
    
    public TvoricTetromin() throws IOException {
        this.tvary = new ArrayList<boolean[][]>();
        
        this.nacitajTvaryTetromin();
    }
    
    private void nacitajTvaryTetromin() throws IOException {
        File subor = new File("data/tetrominoes.txt");
        Scanner vstup = new Scanner(subor);
        
        while (vstup.hasNextLine()) {
            int sirka = vstup.nextInt();
            int vyska = vstup.nextInt();
            
            vstup.nextLine();
            
            boolean[][] pixelySvietia = new boolean[vyska][sirka];
            
            for (int y = 0; y < vyska; y++) {
                String riadok = vstup.nextLine();
                
                for (int x = 0; x < sirka; x++) {
                    char znak = riadok.charAt(x);
                    
                    pixelySvietia[y][x] = (znak == '*');
                }
            }
            
            this.tvary.add(pixelySvietia);
        }
        
        vstup.close();
    }
    
    public Tetromino vytvorNahodne() {
        Random nahodneCisla = new Random();
        
        int indexTvaru = nahodneCisla.nextInt(this.tvary.size());
        
        boolean[][] pixelySvietia = this.tvary.get(indexTvaru);
        
        return new Tetromino(pixelySvietia);
    }
}

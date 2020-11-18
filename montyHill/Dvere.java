import java.util.Random;

public class Dvere {
    private boolean otvorene;
    private boolean obsahujuAuto;
    private boolean zvolene;
    
    public Dvere() {
        Random nahodneCisla = new Random();
        
        this.otvorene = false;
        this.obsahujuAuto = nahodneCisla.nextInt(3) == 2;
        this.zvolene = false;
    }
}

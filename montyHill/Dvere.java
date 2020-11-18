public class Dvere {
    private boolean otvorene;
    private boolean obsahujuAuto;
    private boolean zvolene;
    
    public Dvere(boolean obsahujuAuto) {
        this.otvorene = false;
        this.obsahujuAuto = obsahujuAuto;
        this.zvolene = false;
    }
    
    public void zvol() {
        if (this.otvorene) {
            return;
        }
        
        this.zvolene = true;
    }
    
    public void zrusVolbu() {
        this.zvolene = false;
    }
    
    public boolean predstavujuVyhru() {
        return this.zvolene && this.obsahujuAuto;
    }
    
    public void otvor() {
        if (this.obsahujuAuto) {
            return;
        }
        
        if (this.zvolene) {
            return;
        }
        
        this.otvorene = true;
    }
}

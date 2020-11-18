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
        this.zvolene = true;
    }
    
    public void zrusVolbu() {
        this.zvolene = false;
    }
    
    public boolean predstavujuVyhru() {
        return this.zvolene && this.obsahujuAuto;
    }
    
    public void otvor() {
        this.otvorene = true;
    }
}

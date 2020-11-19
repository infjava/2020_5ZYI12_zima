public class Dvere {
    private boolean otvorene;
    private boolean obsahujuAuto;
    private boolean zvolene;
    
    public Dvere(boolean obsahujuAuto) {
        this.otvorene = false;
        this.obsahujuAuto = obsahujuAuto;
        this.zvolene = false;
    }
    
    public boolean dateSaZvolit() {
        return !this.otvorene && !this.zvolene;
    }
    
    public void zvol() {
        if (this.otvorene) {
            System.out.println("Nemozem zvolit, lebo dvere su otvorene");
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
    
    public boolean dateSaOtvorit() {
        return !this.obsahujuAuto && !this.zvolene;
    }
    
    public void otvor() {
        if (this.obsahujuAuto) {
            System.out.println("Nemozem otvorit, lebo dvere obsahuju auto");
            return;
        }
        
        if (this.zvolene) {
            System.out.println("Nemozem otvorit, lebo hrac si dvere vybral");
            return;
        }
        
        this.otvorene = true;
    }
}

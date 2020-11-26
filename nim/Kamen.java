public class Kamen {
    public Kamen(Sachovnica sachovnica) {
        Kruh kamen = new Kruh();
        kamen.zmenPriemer(18);
        kamen.posunVodorovne(-19 + (sachovnica.getSirka() - 1) * 20);
        kamen.posunZvisle(-59);
        kamen.zobraz();
    }
}

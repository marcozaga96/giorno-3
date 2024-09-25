package E_commerce;

public class Carrello {
    private Cliente codiceCliente;
    private Articolo[] elencoArticoli;
    private double totaleCarrello;

    public Carrello(Cliente codiceCliente) {
        this.codiceCliente = codiceCliente;
        this.elencoArticoli= new Articolo[0];
        this.totaleCarrello= 0;
    }
    public Cliente getCliente() {
        return codiceCliente;
    }
    public void setCliente(Cliente codiceCliente) {
        this.codiceCliente = codiceCliente;
    }
    public Articolo[] getElencoArticoli() {
        return elencoArticoli;
    }
    public void setElencoArticoli(Articolo[] elencoArticoli) {
        this.elencoArticoli = elencoArticoli;
    }
    public double getTotaleCarrello() {
        double totaleCarrello = 0;
        for (int i = 0; i < elencoArticoli.length; i++) {
            int disponibilità = elencoArticoli[i].getPezziInMagazzino(1);
            System.out.println(elencoArticoli[i].getPezziInMagazzino(1));
            if (disponibilità == 0) {
                System.out.println("Abbiamo terminato la disponibilità di: " + elencoArticoli[i].getCodiceArticolo());
                continue;
            } else {
                totaleCarrello += elencoArticoli[i].getPrezzo();
            }

        }
        return totaleCarrello;
    }
}

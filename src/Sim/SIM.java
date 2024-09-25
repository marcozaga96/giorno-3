package Sim;

public class SIM {
    private String numero;
    private double credito;
    private Chiamata[] lista;

    public SIM(String numero) {
        this.numero= numero;
        this.credito= 0;
        this.lista = new Chiamata[5];
    }

    public void stampa(){
        System.out.println("il tuo numero è: " + this.numero +" ed hai credito "+ this.credito +" ed hai effettuato " + " 5 chimate:" );
        if (lista[0] != null) {
            System.out.println("- Chiamata 1: " + lista[0].getNumeroChiamto() + " - Durata minuti: "
                    + lista[0].getDurata());
        }
        if (lista[1] != null) {
            System.out.println("- Chiamata 2: " + lista[1].getNumeroChiamto() + " - Durata minuti: "
                    + lista[1].getDurata());
        }
        if (lista[2] != null) {
            System.out.println("- Chiamata 3: " + lista[2].getNumeroChiamto() + " - Durata minuti: "
                    + lista[2].getDurata());
        }
        if (lista[3] != null) {
            System.out.println("- Chiamata 4: " + lista[3].getNumeroChiamto() + " - Durata minuti: "
                    + lista[3].getDurata());
        }
        if (lista[4] != null) {
            System.out.println("- Chiamata 5: " + lista[4].getNumeroChiamto() + " - Durata minuti: "
                    + lista[4].getDurata());
        }
    }

    public void aggiungiCredito(int creditoAggiornato){
         this.credito += creditoAggiornato;
    }
    public void setLista(Chiamata[] lista){
        this.lista= lista;
    }
}

package Sim;

public class Chiamata {
    private String numeroChiamto;
    private double durata;

    public Chiamata(String numeroChiamto, double durata) {
        this.numeroChiamto = numeroChiamto;
        this.durata = durata;
    }

    public String getNumeroChiamto() {
        return this.numeroChiamto;
    }

    public double getDurata() {
        return this.durata;
    }
}

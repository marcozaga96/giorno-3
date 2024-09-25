package E_commerce;

public class Articolo {
    private int codiceArticolo;
    private String decrizioneArticolo;
    private double prezzo;
    private int pezziInMagazzino;


    public Articolo(int codiceArticolo,String decrizioneArticolo,double prezzo, int pezziInMagazzino) {
        this.codiceArticolo = codiceArticolo;
        this.decrizioneArticolo = decrizioneArticolo;
        this.prezzo = prezzo;
        this.pezziInMagazzino = 0;
    }
    public int getCodiceArticolo() {
        return codiceArticolo;
    }
    public void setCodiceArticolo(int codiceArticolo) {
        this.codiceArticolo = codiceArticolo;
    }

    public String getDescrizione() {
        return decrizioneArticolo;
    }
    public void setDecrizioneArticolo(String decrizioneArticolo) {
        this.decrizioneArticolo = decrizioneArticolo;
    }
    public double getPrezzo() {
        return prezzo;
    }
    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
    public int getPezziInMagazzino(int pezziInMagazzino) {
        return pezziInMagazzino;
    }
    public void setPezziInMagazzino(int  pezziInMagazzino) {
        this.pezziInMagazzino = pezziInMagazzino;
    }
}

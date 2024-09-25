package E_commerce;

import java.util.Date;

public class Cliente {
    private int codiceCliente;
    private String utente;
    private  String email;
    private String dataIscrizione;

    public Cliente(int codiceCliente, String utente, String email, String dataIscrizione) {
        this.codiceCliente = codiceCliente;
        this.utente= utente;
        this.email= email;
        this.dataIscrizione= dataIscrizione;
    }
    public int getCodiceCliente() {
        return codiceCliente;
    }
    public void setCodiceCliente(int codiceCliente) {
        this.codiceCliente = codiceCliente;
    }
    public String getUtente() {
        return utente;
    }
    public void setUtente(String utente) {
        this.utente = utente;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getDataIscrizione() {
        return dataIscrizione;
    }
    public void setDataIscrizione(String dataIscrizione) {
        this.dataIscrizione = dataIscrizione;
    }
}

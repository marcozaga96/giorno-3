import Rettangolo.Rettangolo;
import Sim.Chiamata;
import Sim.SIM;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------------------esercizio 1--------------------------");
        Rettangolo rettangolo1 = new Rettangolo(10, 15);
        Rettangolo rettangolo2 = new Rettangolo(7.5, 8);

        rettangolo1.stampaRettangolo();
        rettangolo2.stampaRettangolo();

        Rettangolo.stampaDueRettangoli(rettangolo1,rettangolo2);

        System.out.println("---------------------------esercizio 2--------------------------");
        SIM utente1 = new SIM("3319331141");

        Chiamata[] lista = new Chiamata[5];
        lista[0]= new Chiamata("1561568167",3.5);
        lista[1]= new Chiamata("175754652",10);
        lista[2]= new Chiamata("150425205652",20);
        lista[3]= new Chiamata("1504245652",7);
        lista[4]= new Chiamata("15046105652",5.3);


        utente1.aggiungiCredito(10);
        utente1.setLista(lista);
        utente1.stampa();
    }



}
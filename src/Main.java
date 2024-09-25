import E_commerce.Articolo;
import E_commerce.Carrello;
import E_commerce.Cliente;
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

        System.out.println("---------------------------esercizio 3--------------------------");

        Cliente cliente1 = new Cliente(250,"marco zagaria","marco@gmail.com","25/09/2024");

        Articolo articolo1 = new Articolo(1,"articolo 1",29.9,10);
        Articolo articolo2 = new Articolo(2,"articolo 2",19.9,3);
        Articolo articolo3 = new Articolo(3,"articolo 3",10,5);
        Articolo articolo4 = new Articolo(4,"articolo 4",17.9,20);
        Articolo articolo5 = new Articolo(5,"articolo 5",27,7);

        Carrello carrellocliente1 = new Carrello(cliente1);
        Articolo[] listaArticoliComprati = { articolo1, articolo2, articolo3 };
        carrellocliente1.setElencoArticoli(listaArticoliComprati);
        System.out.println(carrellocliente1.getTotaleCarrello());


    }



}
public class Main {
    public static void main(String[] args) {
        System.out.println("---------------------------esercizio 1--------------------------");
        Rettangolo rettangolo1 = new Rettangolo(10, 15);
        Rettangolo rettangolo2 = new Rettangolo(7.5, 8);

        rettangolo1.stampaRettangolo();
        rettangolo2.stampaRettangolo();

        Rettangolo.stampaDueRettangoli(rettangolo1,rettangolo2);
    }



}
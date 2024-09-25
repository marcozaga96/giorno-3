public class Rettangolo {
    private double lato1;
    private double lato2;

    public Rettangolo(double lato1, double lato2) {
        this.lato1 = lato1;
        this.lato2 = lato2;
    }

    public double perimetro(){
        return (lato1 + lato2) * 2;
    }
    public double area(){
        return lato1 * lato2;
    }
    public void stampaRettangolo(){
        System.out.println("stampa rettangolo area " + area());
        System.out.println("stampa rettangolo  perimetro " + perimetro());
    }
    public static void stampaDueRettangoli(Rettangolo rettangolo1, Rettangolo rettangolo2){
        System.out.println("stampa rettangolo 1:");
        rettangolo1.stampaRettangolo();
        System.out.println("stampa rettangolo 2:");
        rettangolo2.stampaRettangolo();
        System.out.println("Somma delle aree: " + (rettangolo1.area() + rettangolo2.area()));
        System.out.println("Somma dei perimetri: " + (rettangolo1.perimetro() + rettangolo2.perimetro()));
    }
}

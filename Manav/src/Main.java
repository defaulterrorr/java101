import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5;
        double kilo_armut,kilo_elma,kilo_domates,kilo_muz,kilo_patlican;

        System.out.print("Armut Kaç Kilo ? :");
        kilo_armut = input.nextDouble();

        System.out.print("Elma Kaç Kilo ? :");
        kilo_elma = input.nextDouble();

        System.out.print("Domates Kaç Kilo ? :");
        kilo_domates = input.nextDouble();

        System.out.print("Muz Kaç Kilo ? :");
        kilo_muz = input.nextDouble();

        System.out.print("Patlican Kaç Kilo ? :");
        kilo_patlican = input.nextDouble();
        double tutar=elma*kilo_elma+armut*kilo_armut+
                domates*kilo_domates+ muz*kilo_muz+patlican*kilo_patlican;

        System.out.println("Toplam Tutar : "+tutar);
    }
}
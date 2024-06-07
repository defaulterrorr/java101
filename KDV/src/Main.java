import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double tutar, kdvOran;
        System.out.print("Tutari giriniz: ");
        tutar = input.nextDouble();
        kdvOran= 0.0<tutar&&tutar<1000.0?1.18:1.08;
        double kdvli = tutar*kdvOran;
        double kdv_tutar = kdvli-tutar;
        System.out.println("KDV'li fiyat: "+kdvli);
        System.out.print("KDV tutarı: "+kdv_tutar);

    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double boy,kilo;
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        boy = input.nextDouble();
        System.out.print("ALütfen kilonuzu giriniz: ");
        kilo = input.nextDouble();
        double endex = kilo/(boy*boy);

        System.out.println("Vücut Kitle İndeksiniz : "+endex);
    }
}
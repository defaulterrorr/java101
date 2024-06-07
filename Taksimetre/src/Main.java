import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double km_val;
        System.out.print("Mesafeyi giriniz: ");
        km_val = input.nextDouble();

        double ucret=km_val*2.2>10?km_val*2.2+10:20;
        System.out.println("Taksimetre Tutari= "+ucret);
    }
}
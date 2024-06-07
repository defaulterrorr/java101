import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double a_kenar, b_kenar;
        System.out.print("Alani hesaplanacak ucgenin ilk dik kenari: ");
        a_kenar = input.nextDouble();
        System.out.print("Alani hesaplanacak ucgenin ikinci dik kenari: ");
        b_kenar = input.nextDouble();
        double hipoten = Math.sqrt((a_kenar*a_kenar+b_kenar*b_kenar));
        double u=(a_kenar+b_kenar+hipoten)/2;
        double alan= Math.sqrt(u*(u-a_kenar)*(u-b_kenar)*(u-hipoten));
        System.out.println("Hipotenus= "+hipoten);
        System.out.println("Ucgen Alanı= "+alan);
    }
}
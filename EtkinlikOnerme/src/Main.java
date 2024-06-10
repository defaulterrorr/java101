import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);


        int heat;
        System.out.print("Sicaklik giriniz: ");
        heat = inp.nextInt();

        if (heat > 25) {
            System.out.print("Yuzmeye gidebilirsiniz");
        } else if (heat > 15) {
            System.out.print("Piknige gidebilirsiniz");
        } else if (heat > 5) {
            System.out.print("Sinemaya gidebilirsiniz");
        } else {
            System.out.print("Kayak yapabilirsiniz");
        }

    }
}
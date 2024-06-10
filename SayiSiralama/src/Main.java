import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);


        int sayi1, sayi2, sayi3;
        System.out.print("1. sayi: ");
        sayi1 = inp.nextInt();

        System.out.print("2. sayi: ");
        sayi2 = inp.nextInt();

        System.out.print("3. sayi: ");
        sayi3 = inp.nextInt();

        if ((sayi1 < sayi2)&&(sayi2 < sayi3)) {
            System.out.print("sayi1 < sayi2 < sayi3");
        }
        else if ((sayi1 < sayi3)&&(sayi3 < sayi2)) {
            System.out.print("sayi1 < sayi3 < sayi2");
        }
        else if ((sayi2 < sayi1)&&(sayi1 < sayi3)) {
            System.out.print("sayi2 < sayi1 < sayi3");
        }
        else if ((sayi2 < sayi3)&&(sayi3 < sayi1)) {
            System.out.print("sayi2 < sayi3 < sayi1");
        }
        else if ((sayi3 < sayi1)&&(sayi1 < sayi2)) {
            System.out.print("sayi3 < sayi1 < sayi2");
        }
        else {
            System.out.print("sayi3 < sayi2 < sayi1");
        }

    }
}
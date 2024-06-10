import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);


        int dist, age, way;
        System.out.print("Mesafe giriniz (KM): ");
        dist = inp.nextInt();

        System.out.print("Yas giriniz: ");
        age = inp.nextInt();

        System.out.print("1'e basiniz tek yon ise\n2'e basiniz gidis-donus ise: ");
        way = inp.nextInt();

        double price=dist*0.10;
        double totalPrice=0;


        switch (way) {
            case 1:
                if (0<age && age < 12) {
                    totalPrice = price/2;
                }
                else if (0<age && age < 25) {
                    totalPrice = price*0.9;
                }
                else if (age > 65) {
                    totalPrice = price*0.7;
                }
                break;
            case 2:
                if (0<age && age < 12) {
                    totalPrice = price/2*0.8*2;
                }
                else if (0<age && age < 25) {
                    totalPrice = price*0.9*0.8*2;
                }
                else if (age>65) {
                    totalPrice = price*0.7*0.8*2;
                }
                break;
            default:
                System.out.println("Hatali Veri Girdiniz !");

        }
        System.out.println(totalPrice);

    }
}
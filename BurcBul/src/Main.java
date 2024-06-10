import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);


        int month, day;
        System.out.print("Dogdugunuz ay: ");
        month = inp.nextInt();

        System.out.print("Dogum Gunu: ");
        day = inp.nextInt();
        boolean isErr20,isErr21,isErr22,isErr23;
        isErr20 = day>=20&&day<32; isErr21 = day>=21&&day<32;
        isErr22 = day>=22&&day<32; isErr23 = day>=23&&day<32;


        if ((month >11 && isErr22)||(month ==1)&& day<22) {
            System.out.print("Oglak Burcu");
        }
        else if ((month == 11 && isErr22)||(month == 12 && day<22)) {
            System.out.print("Yay Burcu");
        }
        else if ((month == 10 && isErr23)||(month == 11 && day<21)) {
            System.out.print("Akrep Burcu");
        }
        else if ((month == 9 && isErr23)||(month == 10 && day<23)) {
            System.out.print("Terazi Burcu");
        }
        else if ((month == 8 && isErr23)||(month == 9 && day<23)) {
            System.out.print("Basak Burcu");
        }
        else if ((month == 7 && isErr23)||(month == 8 && day<23)) {
            System.out.print("Aslan Burcu");
        }
        else if ((month == 6 && isErr23)||(month == 7 && day<23)) {
            System.out.print("Yengec Burcu");
        }
        else if ((month == 5 && isErr22)||(month == 6 && day<23)) {
            System.out.print("İkizler Burcu");
        }
        else if ((month == 4 && isErr21)||(month == 5 && day<22)) {
            System.out.print("Boga Burcu");
        }
        else if ((month == 3 && isErr21)||(month == 4 && day<21)) {
            System.out.print("Koc Burcu");
        }
        else if ((month == 2 && isErr20)||(month == 3 && day<21)) {
            System.out.print("Balik Burcu");
        }
        else if ((month == 1 && isErr22)||(month == 2 && day<20)) {
            System.out.print("Kova Burcu");
        }

    }
}
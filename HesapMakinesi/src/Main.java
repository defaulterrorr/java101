import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner oprt = new Scanner(System.in);


        int n1,n2,select;
        System.out.print("İlk sayıyı giriniz: ");
        n1 = oprt.nextInt();

        System.out.print("İlk sayıyı giriniz: ");
        n2 = oprt.nextInt();

        System.out.println("1-Toplama\n2-Cıkarma\n3-Carpma\n4-Bolme ");
        System.out.print("Seciniz: ");
        select = oprt.nextInt();

        switch (select) {
            case 1:
                System.out.print("Toplam= "+(n1+n2));
                break;
            case 2:
                System.out.print("Fark= "+(n1-n2));
                break;
            case 3:
                System.out.print("Carpim= "+(n1*n2));
                break;
            case 4:
                System.out.print((n2==0)?"Bir sayi O'a bolunmez":"Bolme= "+(n1/n2));
                break;
            default:
                System.out.print("Hatali secim yaptiniz. Tekrar deneyiniz");

        }

    }
}

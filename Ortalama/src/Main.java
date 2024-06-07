import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner dersler = new Scanner(System.in);


        int matematik, fizik, kimya, turkce, tarih, muzik;
        double ders_sayisi=6;
        System.out.print("Matematik notunu girin: ");
        matematik = dersler.nextInt();

        System.out.print("Fizik notunu girin: ");
        fizik = dersler.nextInt();

        System.out.print("Kimya notunu girin: ");
        kimya = dersler.nextInt();

        System.out.print("Türkçe notunu girin: ");
        turkce = dersler.nextInt();

        System.out.print("Tarih notunu girin: ");
        tarih = dersler.nextInt();

        System.out.print("Müzik notunu girin: ");
        muzik = dersler.nextInt();

        // Ortalama
        int toplam = matematik + fizik + kimya + turkce + tarih + muzik;
        double ortalama = toplam/ders_sayisi;

        // Ternary Operator ile sonucu yazdırma
        String sonuc= ortalama>60?"Sınıfı Geçti": "Sınıfta Kaldı";
        System.out.println(sonuc);

    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner dersler = new Scanner(System.in);


        int matematik, fizik, turkce, kimya, muzik, toplam =0;int ders_sayisi=5;
        System.out.print("Matematik notunu girin: ");
        matematik = dersler.nextInt();
        if(0<=matematik&&matematik<=100){toplam+=matematik;}else{ders_sayisi--;}

        System.out.print("Fizik notunu girin: ");
        fizik = dersler.nextInt();
        if(0<=fizik&&fizik<=100){toplam+=fizik;}else{ders_sayisi--;}

        System.out.print("Turkce notunu girin: ");
        kimya = dersler.nextInt();
        if(0<=kimya&&kimya<=100){toplam+=kimya;}else{ders_sayisi--;}

        System.out.print("Kimya notunu girin: ");
        turkce = dersler.nextInt();
        if(0<=turkce&&turkce<=100){toplam+=turkce;}else{ders_sayisi--;}

        System.out.print("Müzik notunu girin: ");
        muzik = dersler.nextInt();
        if(0<=muzik&&muzik<=100){toplam+=muzik;}else{ders_sayisi--;}

        // Ortalama


        double ortalama = (double) toplam /ders_sayisi;

        System.out.println(ortalama>55?"Tebrikler, sinifi gectiniz": "Sinifta kaldiniz, seneye gorusmek uzere!");
        System.out.println("Ortalamaniz = "+ortalama);

    }
}
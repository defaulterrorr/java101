import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner oprt = new Scanner(System.in);


        String uName,uPass,ans;
        System.out.print("Kullanici adiniz: ");
        uName = oprt.nextLine();

        System.out.print("Sifreniz: ");
        uPass = oprt.nextLine();
        if (uName.equals("patika")&&uPass.equals("java123")) {
            System.out.print("Giris yaptiniz.");
        }
        else if (uName.equals("patika")) {
            System.out.print("Sifrenizi sıfırlamak ister misiniz(EVET/HAYIR)? : ");
            ans = oprt.nextLine();
            if (ans.equals("EVET")) {
                System.out.print("Yeni sifrenizi giriniz.");
                ans = oprt.nextLine();
                System.out.print(uPass==ans?"Şifre oluşturulamadı, lütfen başka şifre giriniz":"Şifre oluşturuldu");
                uPass = ans;
            }
            else
            {
                System.out.print("Giris basarisiz");
            }
        }

    }
}

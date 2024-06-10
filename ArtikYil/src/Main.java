import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int yearInp;
        boolean isYear=false;

        System.out.print("Yil Giriniz : ");
        yearInp = inp.nextInt();
        if (yearInp % 4 == 0 ) {
            isYear = true;
            if (yearInp % 100 == 0) {
                if (!(yearInp % 400 == 0)) {
                    isYear=false;
                }
            }
        }

        if (isYear){
            System.out.print(yearInp+" bir artik yildir ! ");
        }
        else
            System.out.print(yearInp+" bir artik yil degildir ! ");
    }


    }
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);


        int birthYear,zSignNum;
        String zSignName="";

        System.out.print("Dogum Yiliniz: ");
        birthYear = inp.nextInt();
        zSignNum=birthYear%12;

        switch(zSignNum){
            case 0:
                zSignName="Maymun";
                System.out.println("Cin Zodyagi Burcunuz :"+zSignName );
                break;
            case 1:
                zSignName="Horoz";
                System.out.println("Cin Zodyagi Burcunuz :"+zSignName );
                break;
            case 2:
                zSignName="Kopek";
                System.out.println("Cin Zodyagi Burcunuz :"+zSignName );
                break;
            case 3:
                zSignName="Domuz";
                System.out.println("Cin Zodyagi Burcunuz :"+zSignName );
                break;
            case 4:
                zSignName="Fare";
                System.out.println("Cin Zodyagi Burcunuz :"+zSignName );
                break;
            case 5:
                zSignName="Okuz";
                System.out.println("Cin Zodyagi Burcunuz :"+zSignName );
                break;
            case 6:
                zSignName="Kaplan";
                System.out.println("Cin Zodyagi Burcunuz :"+zSignName );
                break;
            case 7:
                zSignName="Tavsan";
                System.out.println("Cin Zodyagi Burcunuz :"+zSignName );
                break;
            case 8:
                zSignName="Ejderha";
                System.out.println("Cin Zodyagi Burcunuz :"+zSignName );
                break;
            case 9:
                zSignName="Yilan";
                System.out.println("Cin Zodyagi Burcunuz :"+zSignName );
                break;
            case 10:
                zSignName="At";
                System.out.println("Cin Zodyagi Burcunuz :"+zSignName );
                break;
            case 11:
                zSignName="Koyun";
                System.out.println("Cin Zodyagi Burcunuz :"+zSignName );
                break;

        }

    }
}
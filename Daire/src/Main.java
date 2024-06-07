import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double r,a;
        System.out.print("Daire yaricapi: ");
        r = input.nextDouble();
        System.out.print("Alani hesaplanacak daire dilimi merkez acisi: ");
        a = input.nextDouble();
        double alan = 3.14*r*r*a/360;

        System.out.println("Daire Dilimi Alani= "+alan);
    }
}
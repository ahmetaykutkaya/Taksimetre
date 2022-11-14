import java.util.Scanner;

public class Main {
    public static void main(String[] args)

    {
        Scanner input = new Scanner(System.in);
        int km;
        double artimesafe = 2.20 , acilis = 10;
        System.out.print("Lutfen gidilen mesafeyi giriniz : ");
        km = input.nextInt();

        acilis += (km *artimesafe);

        acilis =(acilis < 20) ? 20 : acilis ;

        System.out.print("Toplam tutar : " + acilis);


    }
}
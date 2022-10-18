import java.util.Scanner;
public class Main {

    public static int pow(int base, int exp) {

        if (exp == 0) {
            return 1;
        } else if (base == 0) {
            return 0;
        }

        return pow(base, exp - 1) * base;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int base, exp;
        System.out.print("Taban değerini Giriniz: ");
        base=scan.nextInt();
        System.out.print("Üs değerini Giriniz: ");
        exp=scan.nextInt();
        System.out.println("Sonuç : " + pow(base, exp));


    }
}
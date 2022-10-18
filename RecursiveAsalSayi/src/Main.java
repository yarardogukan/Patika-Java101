import java.util.Scanner;
public class Main {
    public static boolean isPrime(int sayi)
    {
        int sayac=0;
        for (int i = 2; i < sayi; i++)
        {
            if (sayi % i==0)
            {
                sayac++;
            }
        }

        if (sayac==0)
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayı Giriniz: ");
        int sayi=scan.nextInt();
        System.out.println(isPrime(sayi));

    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int max = 0, min = 0, n, sayi;
        System.out.print("kaç adet sayı gireceksiniz? : ");
        sayi=input.nextInt();

        for (int i = 1; i<=sayi;i++)
        {
            System.out.print(i+". sayıyı giriniz: ");
            n=input.nextInt();

            if (i==1)
            {
                min=n;
                max=n;
            }
            else
            {
                if (n>max)
                {
                    max=n;
                }
                if (n<min)
                {
                    min=n;
                }
            }
        }
        System.out.println("Girdiğiniz En Büyük Sayı: " + max);
        System.out.print("Girdiğiniz En Küçük Sayı: "+min);
    }
}
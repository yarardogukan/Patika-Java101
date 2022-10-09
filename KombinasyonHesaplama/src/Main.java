import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double n,r;
        int Fak_1 = 1, Fak_2 = 1, Fak_3 = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen n Sayısını Giriniz: ");
        n=input.nextInt();

        System.out.print("Lütfen r Sayısını Giriniz: ");
        r=input.nextInt();

        double fark=n-r;

        if(n<r)
        {
            System.out.print("N Sayısı R Sayısından Büyük Olmalıdır.");
            System.exit(0);
        }
        else
        {
            for (int i =1;i<=n;i++)
            {
                Fak_1*=i;
            }
            System.out.println("N Sayısının Faktoriyeli: " + Fak_1);

            for (int j =1;j<=r;j++)
            {
                Fak_2*=j;
            }

            System.out.println("R Sayısının Faktoriyeli: " + Fak_2);

            for (int k =1;k<=fark;k++)
            {
                Fak_3*=k;
            }

            System.out.println("N-R Sayısının Faktoriyeli: " + Fak_3);

            int carpim= Fak_2*Fak_3;
            int kombinasyon=Fak_1/carpim;
            System.out.println("Girilen Değerlerin Kombinasyonu: " +kombinasyon);
        }
    }
}
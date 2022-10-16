import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        int n1,n2,ebob=1;
        Scanner input = new Scanner(System.in);

        System.out.print("N1 Sayısını Giriniz: ");
        n1 = input.nextInt();

        System.out.print("N2 Sayısını Giriniz: ");
        n2 = input.nextInt();

        while(n1 != n2)
        {
            if(n1 > n2)
                n1 -= n2;
            else
                n2 -= n1;
        }
        System.out.println("EBOB " + n1);

        int n3, n4,ekok;
        System.out.print("N3 Sayısını Giriniz: ");
        n3 = input.nextInt();

        System.out.print("N4 Sayısını Giriniz: ");
        n4 = input.nextInt();


        ekok=(n3>n4) ? n3:n4;
        while(true)
        {
            if (ekok % n3==0 && ekok % n4 == 0)
            {
                System.out.printf("EKOK: " +ekok);
                break;
            }
            ++ekok;
        }
    }
}
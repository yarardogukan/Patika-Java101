import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Seri değerini belirleyiniz: ");
        int girdi=input.nextInt();

        int sonuc = 0, sayi1, sayi2 = 1;

        for (int i = 0; i<girdi; i++)
        {
            sayi1 = sayi2;
            sayi2 = sonuc;
            sonuc=sayi1+sayi2;
            System.out.println(sonuc);

        }

    }
}
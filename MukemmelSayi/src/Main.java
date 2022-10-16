import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int toplam = 0;

        System.out.print("Bir sayi giriniz: "); //28
        int sayi = scan.nextInt();

        for(int i = 1; i < sayi; i++)   // 28 dahil olamayacağı için, i değerini 27'ye kadar döndürüyoruz.
        {
            if(sayi % i == 0) { // 27 defa, 28 sayısını i değerine bölüyoruz ve 1,2,4,7 ve 14 sayılarını bulmaya çalışıyoruz.
                toplam += i;    // Bulduğumuz sayıları her defasında toplayarak ilerliyoruz.
            }
        }
        if(sayi == toplam) {    // topladığımız değerler, 28'e eşit ise mükemmel sayı olduğunu ekrana bastırıyoruz.
            System.out.println(sayi + " Mükemmel bir sayidir");
        }
        else {
            System.out.println(sayi + " Mükemmel bir sayi degildir.");
        }
    }
}
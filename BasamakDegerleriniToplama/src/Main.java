import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Lütfen bir tammsayı yazın");

        int sayi = girdi.nextInt();
        int toplam = 0;

        while (sayi != 0) {
            toplam += sayi % 10; //sağdaki basamağı toplama ekle
            sayi=sayi/10; //sağdaki basamağı sil
        }
        System.out.println("Yazdığınız sayının basamakları toplamı="+toplam);

    }
}
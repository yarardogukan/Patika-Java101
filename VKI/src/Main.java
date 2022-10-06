import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double boy, kilo, sonuc;
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu (metre) yazınız: ");
        boy=input.nextDouble();

        System.out.println("Lütfen kilonuzu (kg) giriniz: ");
        kilo=input.nextDouble();

        sonuc=kilo / (boy*boy);
        System.out.println("Vücut Kitle İndeksiniz (VKİ): "+sonuc);



    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        int sayi1, sayi2,secim;
        Scanner input=new Scanner(System.in);
        System.out.print("1. Sayıyı Giriniz: ");
        sayi1=input.nextInt();
        System.out.print("2. Sayıyı Giriniz: ");
        sayi2=input.nextInt();

        System.out.println("**Yapılacak İşlemi Seçiniz:**");
        System.out.println("1. Toplama");
        System.out.println("2. Çıkarma");
        System.out.println("3. Çarpma");
        System.out.println("4. Bölme");
        System.out.println("-----------------");
        System.out.print("Seçiminizi Giriniz: ");
        secim=input.nextInt();

        switch (secim){
            case 1:
                System.out.print("Toplama işleminin Sonucu: " +(sayi1+sayi2));
                break;
            case 2:
                System.out.print("Çıkarma İşleminin Sonucu: " +(sayi1-sayi2));
                break;
            case 3:
                System.out.print("Çarpma İşleminin Sonucu: " +(sayi1*sayi2));
                break;
            case 4:
                System.out.print("Bölme İşleminin Sonucu: " +(double)(sayi1/sayi2));
                break;
        }

    }
}
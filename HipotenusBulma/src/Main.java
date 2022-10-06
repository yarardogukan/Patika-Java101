import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Değişken tanımlamaları
        int a, b;
        double hipo,u,alan,cevre;
        Scanner input=new Scanner(System.in);

        // Kullanıcıdan bilgi alma
        System.out.println("A kenarını Giriniz: ");
        a=input.nextInt();
        System.out.println("B kenarını Giriniz: ");
        b=input.nextInt();
        hipo=Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs Değeri: "+hipo);

        // Çevre ve Alan hesaplanması

        u=(a+b+hipo)/2;
        cevre= 2*(u);
        System.out.println("Üçgenin Çevresi: "+cevre);

        alan=Math.sqrt(u*(u-a)*(u-b)*(u-hipo));
        System.out.println("Üçgenin Alanı: "+alan);

    }
}
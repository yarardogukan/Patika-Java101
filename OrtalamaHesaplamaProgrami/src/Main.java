import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double matematik, fizik, kimya, turkce, tarih, muzik, ortalama;
        String sonuc;

        Scanner input= new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz: ");
        matematik=input.nextInt();

        System.out.print("Fizik Notunuzu Giriniz: ");
        fizik=input.nextInt();

        System.out.print("Kimya Notunuzu Giriniz: ");
        kimya=input.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz: ");
        turkce=input.nextInt();

        System.out.print("Tarih Notunuzu Giriniz: ");
        tarih=input.nextInt();

        System.out.print("Müzik Notunuzu Giriniz: ");
        muzik=input.nextInt();

        ortalama=(matematik+fizik+kimya+turkce+tarih+muzik)/6;
        System.out.println("Girilen Derslerin Ortalaması: "+ortalama);

        sonuc = (ortalama >= 60) ? "Sınıfı Geçtiniz." : "Sınıfta Kaldınız.";
        System.out.println(sonuc);



    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        int matematik,fizik, turkce, kimya, muzik;
        double ortalama;
        Scanner input= new Scanner(System.in);

        System.out.println("0-100 arasında değer girdiğinizden emin olunuz.");

        System.out.print("Matematik Notunu Giriniz: ");
        matematik=input.nextInt();

        System.out.print("Fizik Notunu Giriniz: ");
        fizik=input.nextInt();

        System.out.print("Türkçe Notunu Giriniz: ");
        turkce=input.nextInt();

        System.out.print("Kimya Notunu Giriniz: ");
        kimya=input.nextInt();

        System.out.print("Müzik Notunu Giriniz: ");
        muzik=input.nextInt();

        if (matematik<0 | matematik>100){
            matematik=0;
        }
        if (fizik<0 | fizik>100) {
            fizik=0;
        }
        if (turkce<0 | turkce>100) {
            turkce=0;
        }
        if (kimya<0 || kimya>100) {
            kimya=0;
        }
        if (muzik<0 | muzik>100){
            muzik=0;
        }

        ortalama=(matematik+fizik+turkce+kimya+muzik)/5;
        System.out.println("Girilen Derslerin Ortalaması: " +ortalama);

        if (ortalama<55){
            System.out.println("Maalesef, Sınıfta Kaldınız!");
        }

    }
}
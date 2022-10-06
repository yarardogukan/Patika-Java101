import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        int matematik,fizik, turkce, kimya, muzik,toplamDers=0, toplamNot = 0;
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

        if (!(matematik <= 0 | matematik > 100)) {
            toplamNot += matematik;
            toplamDers++;
        }
        if (!(fizik <= 0 | fizik > 100)) {
            toplamNot += fizik;
            toplamDers++;
        }
        if (!(turkce <= 0 | turkce > 100)) {
            toplamNot += turkce;
            toplamDers++;
        }
        if (!(kimya <= 0 | kimya > 100)) {
            toplamNot += kimya;
            toplamDers++;
        }
        if (!(muzik <= 0 | muzik > 100)) {
        toplamNot += muzik;
        toplamDers++;
    }
        ortalama=toplamNot/toplamDers;
        if (ortalama<55){
            System.out.println("Ortalamanız: " + ortalama);
            System.out.println("Maalesef, Sınıfta Kaldınız!");
        }

    }
}

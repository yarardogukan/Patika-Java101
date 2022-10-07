import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        /* Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;
    - Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
    - Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
    - Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
    - Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
    - Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.*/
        int km, age, choose;
        double perKM=0.10, totalPrice = 0, discountPrice = 0;

        Scanner input=new Scanner(System.in);

        System.out.print("Mesafeyi KM türünden giriniz: ");
        km=input.nextInt();

        if (km<1){
            System.out.println("Hatalı bir değer girdiniz!");
            System.exit(0);
        }

        System.out.print("Yaşınızı Giriniz: ");
        age=input.nextInt();

        if (age<0){
            System.out.println("Hatalı bir değer girdiniz!");
            System.exit(0);
        }
        System.out.println("---------");
        totalPrice=km*perKM;
        System.out.println("İndirimsiz Tutarınız: "+totalPrice);
        discountPrice=km*perKM;
        System.out.println("-----------");

        if (age<12) // Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
        {
            discountPrice*=0.5;
            System.out.println("(0-12 Yaş) İndirim Tutarı: " + discountPrice);
            totalPrice=totalPrice-discountPrice;
            System.out.println("İndirimli Tutarınız: "+ totalPrice);
            discountPrice=totalPrice;
            System.out.println("---------");
        }

        if (age>=12 && age<=24) // Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
        {
            discountPrice*=0.1;
            System.out.println("(12-24 Yaş) İndirim Tutarı: " + discountPrice);
            totalPrice=totalPrice-discountPrice;
            System.out.println(" İndirimli Tutarınız: "+ totalPrice);
            discountPrice=totalPrice;
            System.out.println("---------");
        }

        if (age>=65) //Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
        {
            discountPrice*=0.3;
            System.out.println("(65 Yaş) İndirim Tutarı: " + discountPrice);
            totalPrice=totalPrice-discountPrice;
            System.out.println("İndirimli Tutarınız: "+ totalPrice);
            discountPrice=totalPrice;
            System.out.println("---------");
        }

        System.out.println("*** Bilet Satın Alımı ***");
        System.out.println("** 1 - Tek Yön **");
        System.out.println("** 2 - Gidiş Dönüş **");
        System.out.println("Almak İstediğiniz Bilet Türünü Seçiniz: ");
        choose=input.nextInt();

        switch (choose)
        {
            case 1: System.out.println("---------");
                System.out.println("Toplam Ödemeniz Gereken Tutar: "+totalPrice);
                break;

            case 2: System.out.println("---------");
                discountPrice*=0.2;
                totalPrice=(totalPrice-discountPrice)*2;
                System.out.println("Toplam Ödemeniz Gereken Tutar: "+totalPrice);
                break;
        }



    }
}
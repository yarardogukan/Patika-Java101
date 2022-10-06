import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double fiyat, kdvTutar, kdvToplam;
        double KDV_ORAN=0.18;
        boolean kdvDurum;
        Scanner input= new Scanner(System.in);

        System.out.print("Ürünün Tutarını Giriniz: ");
        fiyat=input.nextInt();
        kdvDurum = (0 < fiyat) && (fiyat <= 1000);
        KDV_ORAN = kdvDurum ? 0.18 : 0.08;
        System.out.println("Ürünün KDV Oranı: " +KDV_ORAN);
        kdvTutar=KDV_ORAN * fiyat;
        kdvToplam=kdvTutar+fiyat;
        System.out.println("Ürünün KDV'li Fiyatı: "+kdvToplam);






    }
}
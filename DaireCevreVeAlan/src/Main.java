import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int yaricap,aciOlcusu;
        double pi=3.14;
        Scanner input=new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz: ");
        yaricap=input.nextInt();

        double alan=pi*yaricap*yaricap;
        System.out.println("Dairenin Alanı: "+alan);
        double cevre= 2 * pi * yaricap;
        System.out.println("Dairenin Çevresi: "+cevre);

        System.out.println("Daire Dilimini Ölçmek için Açı Giriniz: ");
        aciOlcusu=input.nextInt();
        double daireDilimAlan=(pi * (yaricap * yaricap) * aciOlcusu)/360;
        System.out.println("Daire Diliminin Alanı: "+daireDilimAlan);

    }
}
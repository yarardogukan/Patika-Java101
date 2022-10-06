import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        int km, kısaMesafe;
        double  kmBasi=2.20,taksimetreAcilis=10, toplam;

        Scanner input=new Scanner(System.in);
        System.out.println("81 DSY 55 Plakalı taksiye hoş geldiniz!");
        System.out.print("Lütfen gideceğiniz mesafeyi (KM) yazınız: ");
        km=input.nextInt();
        toplam=(km*kmBasi)+taksimetreAcilis;
        toplam=(toplam<20) ? 20:toplam; //Hesaplanan ücret, 20 TL'nin altında ise 20 TL ücret al değil ise ücreti göster.
        System.out.println("Ödenecek Tutar"+toplam);


    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        int sicaklik;
        Scanner input=new Scanner(System.in);

        System.out.println("Sıcaklık Değerini (C) giriniz: ");
        sicaklik=input.nextInt();

        if (sicaklik<5){
            System.out.println("Kayak Yapmalısın!");
        }
        if (sicaklik>=5 && sicaklik<15){
            System.out.println("Sinema İzlemelisin!");
        }
        if (sicaklik>=15 && sicaklik<25){
            System.out.println("Piknik yapmaya ne dersin?");
        }
        if (sicaklik>25){
            System.out.println("Tam yüzme havası!");
        }
    }
}
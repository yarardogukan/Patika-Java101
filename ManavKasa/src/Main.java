import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double armut, elma, domates, muz, patlican, toplamTutar;
        double armutTotal, elmaTotal, domatesTotal, muzTotal, patlicanTotal;
        Scanner input=new Scanner(System.in);

        System.out.println("Hoş Geldiniz! Güncel Manav Fiyatlarımız: \nArmut: 2,14TL\nElma: 3,67TL\nDomates: 1,11TL \nMuz: 0,95TL \nPatlıcan: 5,00 TL");
        System.out.println("---------------------");

        System.out.print("Aldığınız Armut (KG): ");
        armut=input.nextDouble();
        armutTotal=armut*2.14;

        System.out.print("Aldığınız Elma (KG): ");
        elma=input.nextDouble();
        elmaTotal=elma*3.67;

        System.out.print("Aldığınız Domates (KG): ");
        domates=input.nextDouble();
        domatesTotal=domates*1.11;

        System.out.print("Aldığınız Muz (KG): ");
        muz=input.nextDouble();
        muzTotal=muz*0.95;

        System.out.print("Aldığınız Patlıcan (KG): ");
        patlican=input.nextDouble();
        patlicanTotal=patlican*5.00;

        toplamTutar=elmaTotal+armutTotal+domatesTotal+muzTotal+patlicanTotal;
        System.out.print("Toplam Tutar: " +toplamTutar +"TL");

    }
}
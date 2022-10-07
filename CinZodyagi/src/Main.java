import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        /*  Çin Zodyağı nedir?
4000 bin yıldır kullanılan bir astroloji çeşididir Çin astrolojisi ve insanları 12 değişik burç ve sembollerle tanımlar. Çin Zodyağı bu 12 burcun eşit aralıklarla(10 derece genişliğinde) sıralandığı bir hayvan halkasıdır ve yıldızlarla pek bir ilgisi yoktur.
            - Çin Zodyağı nasıl hesaplanır?
    Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.
                    - Doğum Tarihi %12 = 0 ➜ Maymun
                    - Doğum Tarihi %12 = 1 ➜ Horoz
                    - Doğum Tarihi %12 = 2 ➜ Köpek
                    - Doğum Tarihi %12 = 3 ➜ Domuz
                    - Doğum Tarihi %12 = 4 ➜ Fare
                    - Doğum Tarihi %12 = 5 ➜ Öküz
                    - Doğum Tarihi %12 = 6 ➜ Kaplan
                    - Doğum Tarihi %12 = 7 ➜ Tavşan
                    - Doğum Tarihi %12 = 8 ➜ Ejderha
                    - Doğum Tarihi %12 = 9 ➜ Yılan
                    - Doğum Tarihi %12 = 10 ➜ At
                    - Doğum Tarihi %12 = 11 ➜ Koyun */

        int birthDay;
        Scanner input = new Scanner(System.in);

        System.out.println("Doğum Tarihinizi Giriniz(Sadece YIL): ");
        birthDay=input.nextInt();
        if (birthDay<=1900 && birthDay>=2022)
        {
            System.out.println("Doğru bir değer girdiğinizden emin olunuz!");
        }

        if (birthDay%12==0)
        {
            System.out.println("Çin Zodyağınız: Maymun");
        }

        if (birthDay%12==1)
        {
            System.out.println("Çin Zodyağınız: Horoz");
        }

        if (birthDay%12==2)
        {
            System.out.println("Çin Zodyağınız: Köpek");
        }

        if (birthDay%12==3)
        {
            System.out.println("Çin Zodyağınız: Domuz");
        }

        if (birthDay%12==4)
        {
            System.out.println("Çin Zodyağınız: Fare");
        }

        if (birthDay%12==5)
        {
            System.out.println("Çin Zodyağınız: Öküz");
        }

        if (birthDay%12==6)
        {
            System.out.println("Çin Zodyağınız: Kaplan");
        }

        if (birthDay%12==7)
        {
            System.out.println("Çin Zodyağınız: Tavşan");
        }

        if (birthDay%12==8)
        {
            System.out.println("Çin Zodyağınız: Ejderha");
        }

        if (birthDay%12==9)
        {
            System.out.println("Çin Zodyağınız: Yılan");
        }

        if (birthDay%12==10)
        {
            System.out.println("Çin Zodyağınız: At");
        }

        if (birthDay%12==11)
        {
            System.out.println("Çin Zodyağınız: Koyun");
        }

    }
}
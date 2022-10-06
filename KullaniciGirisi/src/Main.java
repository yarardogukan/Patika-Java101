import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        String username="patika", password="kodluyoruz";
        String inpUN, inpPass;
        Scanner input=new Scanner(System.in);
        System.out.println("**Patika.DEV Kullanıcı Girişi**");

        System.out.print("Kullanıcı Adınızı Giriniz: ");
        inpUN=input.nextLine();

        System.out.print("Şifrenizi Giriniz: ");
        inpPass=input.nextLine();

        if (inpPass.equals(password)){
            System.out.println("Başarılı bir şekilde giriş yaptınız.");
        } else{
            System.out.println("Şifrenizi sıfırlamak istiyor musunuz?");
            int secim;
            System.out.println("** 1- Evet **");
            System.out.println("** 2- Hayır **");
            secim=input.nextInt();
            switch (secim){
                case 1:
                    if (inpUN.equals(password)){
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz");
                        break;
                    }
                    else {
                        System.out.print("Yeni Şifrenizi Giriniz: ");
                        System.out.println("Şifre Başarılı bir şekilde oluşturuldu.");
                    }
                    break;
                case 2:
                    System.out.println("Sistem Kapatılıyor.");
                    System.exit(0);
                    break;
            }
        }

    }
}
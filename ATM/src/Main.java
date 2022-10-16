import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right=3,  balance=1500, secim;

        System.out.print("Kullanıcı Adınız :");
        userName = input.nextLine();
        System.out.print("Parolanız : ");
        password = input.nextLine();

        while (right > 0) {

            if (userName.equals("patika") && password.equals("dev123"))
            {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");

                System.out.println("1 - Para Yatırma");
                System.out.println("2 - Para Çekme");
                System.out.println("3 - Bakiye Sorgula");
                System.out.println("4 - Çıkış Yap");
                System.out.println("Lütfen seçim yapınız!");
                secim = input.nextInt();

                switch (secim) {
                    case 1:
                        System.out.print("Lütfen yatırmak istediğiniz Tutarı Giriniz: ");
                        int price = input.nextInt();
                        balance += price;

                        System.out.println("Yatırma işleminden sonraki hesap bakiyeniz: " + balance);
                        break;

                    case 2:
                        System.out.print("Lütfen çekmek istediğiniz Tutarı Giriniz: ");
                        int minus = input.nextInt();
                        if (minus > balance) {
                            System.out.println("Bakiyeniz Yetersiz!");

                        } else
                            balance -= minus;


                        System.out.println("Çekme işleminden sonraki hesap bakiyeniz: " + balance);

                        break;

                    case 3:
                        System.out.println("Bakiyeniz: " + balance);

                        break;

                    case 4:
                        System.exit(0);
                        break;
                }
            }
            else
            {
                right--;
            System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
            if (right == 0) {
                System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
            } else {
                System.out.println("Kalan Hakkınız : " + right);
            }
           }
        }

    }
}






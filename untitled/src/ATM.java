import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        int bakiye = 1000, input, miktar;
        Scanner scan = new Scanner(System.in);

        System.out.println("Hoşgeldiniz");
        System.out.println("Bakiyeniz : " + bakiye + "TL");

        while (bakiye > 0){
            System.out.println();
            System.out.println("1 - Para Yatırma");
            System.out.println("2 - Para Çekme");
            System.out.println("3 - Bakiye Sorulama");
            System.out.println("4 - Çıkış Yap");
            System.out.println("Yapmak İstediğiniz İşlemi Seçiniz : ");
            input = scan.nextInt();

            if(input == 1){
                System.out.println("Yatırmak İstediğiniz Miktarı Giriniz : ");
                miktar = scan.nextInt();
                bakiye += miktar;
                System.out.println("Yeni Bakiyeniz : " + bakiye + "TL");
            }else if (input == 2){
                System.out.println("Çekmek İstediğiniz Miktarı Giriniz : ");
                miktar = scan.nextInt();
                if (miktar > bakiye){
                    System.out.println("Yetersiz Bakiye ");
                }else {
                    bakiye -= miktar;
                    System.out.println("Yeni Bakiyeniz : " + bakiye + "TL");
                }
            }else if (input == 3) {
                System.out.println("Bakiyeniz : " + bakiye + "TL");
            }else if (input == 4){
                System.out.println("Çıkış Yapılıyor ");
                break;
            }else {
                System.out.println("Geçersiz İşlem Girdiniz");
            }
        }

    }
}

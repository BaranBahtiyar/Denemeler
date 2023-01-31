import java.util.Scanner;

public class SayiTahminOyunu3 {
    public static void main(String[] args) {

        int tahmin, can = 5;
        int sayi = (int) (Math.random()*10);
        Scanner scan = new Scanner(System.in);
        boolean oyunDurumu = false;

        System.out.println("Hoşgeldiniz : ");
        while (can > 0) {
            System.out.println("Tahmininiz : ");
            tahmin = scan.nextInt();
            if ((tahmin < 0) || (tahmin > 9)) {
                System.out.println("0-9 arası sayi giriniz");
                continue;
            }
            if (tahmin == sayi) {
                oyunDurumu = true;
                break;
            } else
                System.out.println("Yanlış tahmin , tekrar deneyin! \nKalan can : " + --can);
        }
        if (oyunDurumu) {
            System.out.println("Doğru tahmin \nSayı = " + sayi);
        } else {
            System.out.println("Başaramadınız \nSayı = " + sayi);
        }
    }
}

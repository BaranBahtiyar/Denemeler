import java.util.Scanner;

public class GirisKontrolu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String isim, parola;
        int girissayisi = 3;
        while (true) {
            System.out.println("Kullanıcı isminizi giriniz : ");
            isim = scanner.nextLine();
            System.out.println("Parolanızı giriniz : ");
            parola = scanner.nextLine();
            if (isim.equals("baran") && parola.equals("12345")) {
                System.out.println("Giriş yaptınız ");
                break;
            } else if (isim.equals("baran") && !parola.equals("12345")) {
                System.out.println("Parolanızı yanlış girdiniz ");
                girissayisi = girissayisi - 1;
                System.out.println("Kalan giriş sayınız : " + girissayisi);
            } else if (!isim.equals("baran") && parola.equals("12345")) {
                System.out.println("İsminizi yanlış girdiniz ");
                girissayisi = girissayisi - 1;
                System.out.println("Kalan giriş sayınız : " + girissayisi);
            } else {
                System.out.println("İsminizi ve parolanızı yanlış girdiniz");
                girissayisi = girissayisi - 1;
                System.out.println("Kalan giriş sayınız : " + girissayisi);
            }
            if (girissayisi == 0){
                break;
            }
        }
    }
}
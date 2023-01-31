import java.util.Scanner;

public class HesapMakinesi2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double sayi1, sayi2, secim =1;

        while (secim > 0) {
            System.out.print("İlk Sayıyı Giriniz : ");
            sayi1 = scan.nextInt();
            System.out.print("\nİkinci Sayıyı Giriniz : ");
            sayi2 = scan.nextInt();
            System.out.println("\nLütfen Yapmak İstediğiniz İşlemi Seçiniz : ");
            System.out.println("1- Toplama\n2- Çıkarma\n3- Çarpma\n4- Bölme\n5- Çıkış");
            System.out.println("Seçiminiz : ");
            secim = scan.nextInt();


            if (secim == 1) {
                System.out.println("Toplama : " + (sayi1 + sayi2));
            } else if (secim == 2) {
                System.out.println("Çıkarma : " + (sayi1 - sayi2));
            } else if (secim == 3) {
                System.out.println("Çarpma : " + (sayi1 * sayi2));
            } else if (secim == 4) {
                if (sayi2 == 0) {
                    System.out.println("Sonuç Tanımsızdır");
                } else {
                    System.out.println("Bölme : " + (sayi1 / sayi2));
                }
            } else if (secim == 5){
                System.out.println("Çıkış yapıldı");
                break;
            } else {
                System.out.println("Geçersiz Değer Girdiniz");
            }
        }
    }
}
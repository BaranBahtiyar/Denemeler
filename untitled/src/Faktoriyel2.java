import java.util.Scanner;

public class Faktoriyel2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int seçim, a = 1;


        while (a > 0) {
            System.out.println("\nLütfen Yapmak İstediğiniz İşlemi Seçiniz : ");
            System.out.println("1- İşlem yapmak\n2- Çıkış");
            seçim = scan.nextInt();
            if (seçim == 1) {
                System.out.println("Faktöriyeli hesaplanacak sayıyı giriniz : ");
                long sayi = scan.nextInt();
                long carpim = 1;

                for (long i = 1; i <= sayi; i++) {
                    carpim = carpim * i;
                }
                System.out.println("Girilen sayının faktöriyeli : " + carpim);
            } else if (seçim == 2) {
                System.out.println("Çıkış yaptınız.");
                break;
            } else {
                System.out.println("Geçersiz değer girdiniz.");
            }
        }
    }
}
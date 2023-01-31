import java.util.Scanner;

public class SayilarinToplami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kaç tane sayı gireceksiniz : ");
        int tane = scanner.nextInt();
        int toplam = 0;

        for (int i = 1; i <= tane; i++) {
            System.out.print(i + ". sayınızı giriniz : ");
            int sayi = scanner.nextInt();
            toplam = sayi + toplam;
        }
        System.out.println("Girdiğiniz sayıların toplam değeri : " + toplam);
    }
}

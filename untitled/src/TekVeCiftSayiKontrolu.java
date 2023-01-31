import java.util.Scanner;

public class TekVeCiftSayiKontrolu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kontrol edilecek sayıyı giriniz : ");
        int sayi = scanner.nextInt();

        if (sayi%2 == 0){
            System.out.println("Girilen sayı çift sayı ");
        }else {
            System.out.println("Girilen sayı tek sayı ");
        }

    }
}

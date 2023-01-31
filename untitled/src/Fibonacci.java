import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");

        int input = scan.nextInt();

        int sayi1=1;
        int sayi2=1;
        int toplam;
        System.out.println(input + " Sayısına kadar fibonacci serisi ");

        for (int i = 1; i <= input; i++){
            System.out.print(sayi1 + ",");
            toplam = sayi1 + sayi2;
            sayi1 = sayi2;
            sayi2 = toplam;

        }
    }
}

import java.util.Scanner;

public class FaktoriyelHesabi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Faktöriyeli hesaplanacak sayıyı giriniz : ");
        long sayi = scan.nextInt();
        long carpim = 1;

        for (long i = 1; i <= sayi; i++) {
            carpim = carpim * i;
        }
        System.out.println("Girilen sayının faktöriyeli : " + carpim);
    }
}
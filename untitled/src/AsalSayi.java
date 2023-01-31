import java.util.Scanner;

public class AsalSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz : ");
        int number = scanner.nextInt();
        int remainder = number % 2;
        boolean isPrime = true;

        for (int i = 2; i < number; i++){
            if(number % i == 0){
                isPrime = false;
            }
        }
        if (isPrime == true){
            System.out.println("Sayı asal");
        }else {
            System.out.println("Sayı asal değil");
        }
    }
}

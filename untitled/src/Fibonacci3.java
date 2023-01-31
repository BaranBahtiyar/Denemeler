import java.util.Scanner;

public class Fibonacci3 {
    public static int f(int n){

    if (n == 1 || n == 2)
        return 1;

    return f(n-1) + f(n-2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi1 = 0;
        System.out.println("İstediğiniz terimi giriniz : ");
        sayi1 = input.nextInt();
        System.out.println(f((sayi1)));

    }

}

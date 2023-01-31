import java.util.Scanner;

public class KomsuSayilar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a, b;
        System.out.println("İlk sayıyı giriniz : ");
        a = scanner.nextInt();
        System.out.println("İkinci sayıyı giriniz : ");
        b = scanner.nextInt();

        if (b == (a+1) || b == (a-1)){
            System.out.println("a ve b komşu sayı");
        }else{
            System.out.println("a ve b komşu değil");
        }

    }
}

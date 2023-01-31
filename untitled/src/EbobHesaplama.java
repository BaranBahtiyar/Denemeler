import java.util.Scanner;

public class EbobHesaplama {
    public static int ebobhesaplama(int deger1, int deger2) {
        int ebob = 1;

        for (int i = 1; i <= deger1 && i <= deger2; i++) {
            if ((deger1 % i == 0) && (deger2 % i == 0)) {
                ebob = i;
            }
        }
        return ebob;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Birinci değeri giriniz : ");
        int ilkdeğer = scanner.nextInt();
        System.out.println("İkinci değeri giriniz : ");
        int ikincideğer = scanner.nextInt();

        System.out.println("Girilen iki değerin ebobu : " + ebobhesaplama(ilkdeğer,ikincideğer));

    }
}

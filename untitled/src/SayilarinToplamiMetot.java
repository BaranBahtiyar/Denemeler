import java.util.Scanner;

public class SayilarinToplamiMetot {

    public static int toplam(int x, int y, int z){
        Scanner scanner = new Scanner(System.in);
        return(x + y + z);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Üç tane değer giriniz : ");
        int ilk = scanner.nextInt();
        int ikinci = scanner.nextInt();
        int üçüncü = scanner.nextInt();
        System.out.println("Toplam değerleriniz : " + toplam(ilk, ikinci, üçüncü ));

    }
}

import java.util.Scanner;

public class DaireninAlanVeCevresiniHesaplama {

    public static void main(String[] args) {
        double alan, çevre, r, pi = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.println("Dairenin Yarıçapını Giriniz : ");
        r = input.nextDouble();
        alan = pi * r * r;
        çevre = 2 * pi * r;
        System.out.println("Dairenin Çevresi : " + çevre);
        System.out.println("Dairenin Alanı : " + alan);
    }

    }


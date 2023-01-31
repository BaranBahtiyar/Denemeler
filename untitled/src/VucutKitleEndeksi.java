import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kütlenizi giriniz : ");
        double kütle = scanner.nextFloat();

        System.out.println("Boyunuzu giriniz : ");
        double boy = scanner.nextDouble();

        double vucutkitleindeksi = kütle/(boy*boy);

        System.out.println("Vücut kitle indeksi : " + vucutkitleindeksi);
    }
}

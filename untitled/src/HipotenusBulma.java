import java.util.Scanner;

public class HipotenusBulma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int birinciKenar, ikinciKenar;
        double hipotenüs;

        System.out.print("Birinci dik kenar uzunluğunu giriniz : ");
        birinciKenar = scanner.nextInt();
        System.out.print("İkinci dik kenar uzunluğunu giriniz : ");
        ikinciKenar = scanner.nextInt();

        hipotenüs = (double) Math.sqrt((birinciKenar * birinciKenar) + (ikinciKenar * ikinciKenar));

        System.out.println("Hipotenüs uzunluğu : " + hipotenüs);
    }
}

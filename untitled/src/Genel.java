import java.util.Scanner;

public class Genel {
    public void toplam(){
        Scanner scanner = new Scanner(System.in);
        int sayi1 , sayi2;
        System.out.println("Birinci sayıyı giriniz :");
        sayi1 = scanner.nextInt();
        System.out.println("İkinci sayıyı giriniz :");
        sayi2 = scanner.nextInt();

        DortIslem dortIslem = new DortIslem();
        System.out.println("toplam : " + dortIslem.topla(sayi1, sayi2) );

    }
}

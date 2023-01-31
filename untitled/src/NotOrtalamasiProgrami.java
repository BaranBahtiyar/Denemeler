import java.util.Scanner;

public class NotOrtalamasiProgrami {

    public static void main(String[] args) {
        int quiz , vize , ffinal ;
        double ortalama ;
        Scanner input = new Scanner(System.in);

        System.out.println("Quiz notunuzu giriniz : ");
        quiz = input.nextInt();
        System.out.println("Vize notunuzu giriniz : ");
        vize = input.nextInt();
        System.out.println("FFinal notunuzu giriniz : ");
        ffinal = input.nextInt();

        ortalama = (quiz * 0.2) + (vize * 0.35) + (ffinal * 0.45);
        System.out.println("Not ortalamanız :" + ortalama);
        String sonuç = (ortalama >= 50) ? "Geçtiniz" : "Kaldınız" ;
        System.out.println(sonuç);

    }

}

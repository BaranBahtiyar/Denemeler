import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, j, rows;
        System.out.print("Enter the number of rows you want to print : ");
        rows = scanner.nextInt();

        for (i = 0; i <= rows - 1; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
        for (i = rows - 1; i >= 0; i--) {
            for (j = 0; j <= i-1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
    }
}
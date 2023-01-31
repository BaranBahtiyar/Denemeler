public class Pattern3 {

    public static void main(String[] args) {
        int height = 5;
        Print(height);

    }

    public static void Print(int height) {
        int i, j;

        for (i = 1; i <= height; i++) {
            for (j = height; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (i * 2) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
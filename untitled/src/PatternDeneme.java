public class PatternDeneme {
    public static void main(String[] args) {

        int height = 5;
        int stars = 1;

        RecursivePrintPyramid(height, stars);

    }

    static void RecursivePrintPyramid(int height, int stars) {


        if (height == stars) {
            for (int i = 0; i < (stars * 2) - 1; i++) {
                System.out.print("");
            }
        } else {
            for (int i = 0; i < height - stars; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < (stars * 2) - 1; i++) {
                System.out.print("*");
            }
            System.out.println();
            RecursivePrintPyramid(height, stars + 1);
        }

    }
    }
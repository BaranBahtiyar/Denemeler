public class MatrixOperations {
    public static void main(String[] args) {

        int row = 4;
        int column = 4;

        int[][] matrix1 = new int[row][column];
        int[][] matrix2 = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix1[i][j] = (int) (Math.random() * 30) + 1;
                matrix2[i][j] = (int) (Math.random() * 30) + 1;
            }
        }

        System.out.println("First Matrix : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix1[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("************************");

        System.out.println("Second Matrix : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix2[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("************************");

        System.out.println("Summation : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print((matrix1[i][j] + matrix2[i][j]) + "\t");
            }
            System.out.println();
        }

        System.out.println("************************");

        System.out.println("Subtraction : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print((matrix1[i][j] - matrix2[i][j]) + "\t");
            }
            System.out.println();
        }

        System.out.println("************************");

        System.out.println("Multiplication : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print((matrix1[i][j] * matrix2[i][j]) + "\t");
            }
            System.out.println();
        }
    }
}

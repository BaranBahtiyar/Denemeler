public class Deneme {
    public static void main(String[] args) {

        int satır = 4;
        int sütun = 4;

        int[][] matris1 = new int[satır][sütun];
        int[][] matris2 = new int[satır][sütun];

        for (int i = 0; i < satır; i++) {
            for (int j = 0; j < sütun; j++) {
                matris1[i][j] = (int) (Math.random() * 30) + 1;
                matris2[i][j] = (int) (Math.random() * 30) + 1;
            }
        }
        System.out.println("matris1 : ");
        for (int i = 0; i < satır; i++) {
            for (int j = 0; j < sütun; j++) {
                System.out.print(matris1[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("matris2 : ");
        for (int i = 0; i < satır; i++) {
            for (int j = 0; j < sütun; j++) {
                System.out.print(matris2[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("toplam matris : ");
        for (int i = 0; i < satır; i++) {
            for (int j = 0; j < sütun; j++) {
                System.out.print((matris1[i][j] + matris2[i][j]) + "\t");
            }
            System.out.println();
        }

        System.out.println("matris farkı : ");
        for (int i = 0; i < satır; i++) {
            for (int j = 0; j < sütun; j++) {
                System.out.print((matris1[i][j] - matris2[i][j]) + "\t");
            }
            System.out.println();
        }

        System.out.println("matris çarpımı : ");
        for (int i = 0; i < satır; i++) {
            for (int j = 0; j < sütun; j++) {
                System.out.print((matris1[i][j] * matris2[i][j]) + "\t");
            }
            System.out.println();
        }
    }
}


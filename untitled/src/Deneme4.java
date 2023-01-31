public class Deneme4 {
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

        System.out.println("matris1: ");
        matrisYazdir(matris1);

        System.out.println("matris2 : ");
        matrisYazdir(matris2);

    }

    public static int matrisYazdir(int[][] matris) {
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                System.out.print(matris[i][j] + "\t");
            }
            System.out.println();
        }
        return 0;
    }
}

public class Lab_3 {
    static int Sum(int A[], int N) {
        //T(N) = 2N+2
        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum += A[i];
        }//end-for

        return sum;
    }//end-sum

    static int Sum_Recursive(int A[], int index, int N) {
        /* Base case */
        if (N == 1) return A[index];

        /* Divide & Conquer */
        int localSum = Sum_Recursive(A, index + 1, N - 1);

        /* Merge */
        return A[index] + localSum;
    }//end-sum

    /* Computes 1+2+3+…+N */
    static int Sum_Recursive(int N) {
        int partialSum = 0;

        /* Base case */
        if (N == 1) return 1;

        /* Divide and conquer */
        partialSum = Sum_Recursive(N - 1);

        /* Merge */
        return partialSum + N;
    } /* end-Sum */

    /* Computes the sum of an array of numbers A[0..N-1] */
    static int Sum_Recursive2(int A[], int index1, int index2) {
        /* Base case */
        if (index2 - index1 == 1) return A[index1];

        /* Divide & Conquer */
        int middle = (index1 + index2) / 2;
        int localSum1 = Sum_Recursive2(A, index1, middle);
        int localSum2 = Sum_Recursive2(A, middle, index2);

        /* Merge */
        return localSum1 + localSum2;
    } //end-Sum


    public static void main(String[] args) {

        int[] B = {9, 18, 25, 37, 49, 51, 58, 64, 68, 77, 83, 88, 95, 97, 99};

        int sumB = Sum(B, B.length);
        int sumB_recursive = Sum_Recursive(B, 0, B.length);
        int sumB_recursive2 = Sum_Recursive(10);
        System.out.println("Sum: " + sumB);
        System.out.println("Recursive Sum: " + sumB_recursive);
        System.out.println("Recursive Sum (1 to 10): " + sumB_recursive2);
    }
}



import java.sql.SQLOutput;

public class DataStructureLab {

    static int Sum(int A[], int N) {
        //T(N) = 2N+2
        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum += A[i];
        }//end-for

        return sum;
    }//end-sum

    static int LinearSearch(int A[], int N, int key) {
        //T(N) = 3L+2 (1 <= L <= N)
        int i = 0;
        while (i < N) {
            if (A[i] == key)
                break;
            i++;
        }//end while

        if (i < N)
            return i;
        else
            return -1;
    }//end LinearSearch

    // Return the index of the array containing the key or 1 if key not found
    static int BinarySearch(int A[], int N, int key) {
        //T(N) = log2N
        int left = 0;
        int right = N - 1;

        while (left <= right) {
            int middle = (left + right) / 2; // Index of the key to test against
            if (A[middle] == key) return middle; // Key found. Return the index
            else if (key < A[middle]) right = middle - 1; // Eliminate the right side
            else left = middle + 1; // Eliminate the left side
        }

        return -1; // Key not found
    } //end-BinarySearch

    public static void main(String[] args) {

        int[] A = {9, 18, 25, 37, 49, 51, 58, 64, 68, 77, 83, 88, 95, 97, 99};

        if (false) {
            int sumB = Sum(A, A.length);
            System.out.println("Sum: " + sumB);
        }

        //search key
        if (true) {
            int key = 83;
            int result;
            //result = LinearSearch(B, B.length, key);
            result = BinarySearch(A, A.length, key);

            if (result < 0) {
                System.out.println("Key not found!!");
            } else {
                System.out.println("Key " + key + " found in " + result + ". index.");
            }
        }
    }
}



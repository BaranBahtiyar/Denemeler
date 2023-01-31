import java.math.*;
import java.util.Scanner;

public class LargeFactorial {
    public static void main(String[] args) {
        int input;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value you want : ");
        input = scan.nextInt();
        System.out.println("Entered value is \n" + factorial(input));
    }

    public static BigInteger factorial(long n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++)
            result = result.multiply(new BigInteger(i+""));

        return result;
    }
}


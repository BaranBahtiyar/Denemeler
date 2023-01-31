import java.util.Scanner;

public class SayiTahmini {

    public static void main(String[] args){

        int number = (int)(Math.random()*101);
        int i=0;
        int total=0;

        Scanner input = new Scanner(System.in);
        System.out.println("Guess a magic number between 0 and 100");

        while(true){
            System.out.println("Enter your guess : ");
            int guess = input.nextInt();
            i = i+1;
            total += guess;
            System.out.println("total guess" + total);

            if(guess == number){
                System.out.println("Yes, number is " + number);
                System.out.println("Number of estimate: " + i);

                break ;
            }else if(guess > number)
                System.out.println("Your guess is too high");
            else
                System.out.println("Your guess is too low");
        }
    }
}
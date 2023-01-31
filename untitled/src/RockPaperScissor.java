import java.util.Scanner;

public class RockPaperScissor {

    public static void main (String[] args) {
        System.out.print("Let's Start");
        System.out.println("\n1- Rock\n2- Paper\n3- Scissor");
        Scanner number = new Scanner(System.in);
        int player = 0;
        int computer = 0;

        while (player != 5 && computer !=5) {
            int pc_choose = (int) ((Math.random() * 3) + 1 );
            System.out.print("Rock?, Paper? or Scissor?: ");
            int choose = number.nextInt();
            if (choose == 1) {
                if (pc_choose == 1) {
                    System.out.println("Choice of computer : Rock\nResult : Draw");
                    System.out.println("Your score : " + player + "\nComputer score : " + computer);
                } else if (pc_choose == 2) {
                    System.out.println("Choice of computer : Paper\nResult : You lost");
                    computer++;
                    System.out.println("Your score : " + player + "\nComputer score : " + computer);
                } else {
                    System.out.println("Choice of computer : Scissor\nResult : You win");
                    player++;
                    System.out.println("Your score : " + player + "\nResult : " + computer);
                }
            }
            else if (choose == 2) {
                if (pc_choose == 1) {
                    System.out.println("Choice of computer : Rock\nResult : You win");
                    player++;
                    System.out.println("Your score : " + player + "\nComputer score : " + computer);
                } else if (pc_choose == 2) {
                    System.out.println("Choice of computer : Paper\nResult : Draw");
                    System.out.println("Your score : " + player + "\nComputer score : " + computer);
                } else {
                    System.out.println("Choice of computer : Scissor\nResult : You lost");
                    computer++;
                    System.out.println("Your score : " + player + "\nComputer score : " + computer);
                }
            }
            else if (choose == 3) {
                if (pc_choose == 1) {
                    System.out.println("Choice of computer : Rock\nResult : You lost");
                    computer++;
                    System.out.println("Your score : " + player + "\nComputer score : " + computer);
                } else if (pc_choose == 2) {
                    System.out.println("Choice of computer : Paper\nResult : You win");
                    player++;
                    System.out.println("Your score : " + player + "\nComputer score : " + computer);
                } else {
                    System.out.println("Choice of computer : Scissor\nResult : Draw");
                    System.out.println("Your score : " + player + "\nComputer score : " + computer);
                }
            }
            else {
                System.out.println("Invalid login , try again");

                if (player == 5) {
                    System.out.println("Game over , You win");
                    break;
                } else if (computer == 5) {
                    System.out.println("Game over , You lost");
                    break;
                }
            }
        }
    }
}

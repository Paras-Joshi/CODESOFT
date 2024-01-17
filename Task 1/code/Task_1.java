import java.util.Random;
import java.util.Scanner;

public class Task_1 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        boolean another_game = true;
        int score = 0;
        System.out.println("\n \t ***** WELCOME TO NUMBER GAME *****");
        while(another_game)
        {
            int max_attempts = 3;
            int attempt=0;
            int randNumber = rand.nextInt(100)+1;
            while(attempt<max_attempts)
            {
                System.out.println("\n Enter your guess : ");
                int number = sc.nextInt();
                sc.nextLine();
                attempt++;
                if(number==randNumber)
                {
                    System.out.println("\n Perfect !! Your Guess is Correct !!");
                    score++;
                    break;
                }
                else if(number>randNumber)
                {
                    System.out.println("\n Guess is too High !! Try Again !!");
                }
                else
                {
                    System.out.println("\n Guess is too Low !! Try Again !!");
                }
            }
            if(attempt>=max_attempts){
                System.out.println("\n You have reached at your limit !!!"+" Number was "+randNumber);
            }
                
                System.out.println("\n Do You want to Continue ? (yes/no) :");
                String ch = sc.next();
                another_game = ch.equalsIgnoreCase("yes");
            
        }
        System.out.println("\n YOUR SCORE IS : "+score);
        sc.close();
    }    
}

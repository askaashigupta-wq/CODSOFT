//Thank You Codsoft for this opportunity
//task1: the number guessing game

import java.util.*;

public class Task1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int minRange  = 1;
        int maxRange = 100;
        
        //lets fix the maximum number of attempts

        int maxAttempts = 10;
        
        //every game is fun to play when you have a score to tally

        int score;

        boolean playGame = true;

        while(playGame){

            int target = random.nextInt(maxRange - minRange + 1) + minRange;

            System.out.println("Hey y'all! who's down for some lit number guessing?!");
            System.out.println("here's the deal: We're gonna pick a random number between " + minRange + " and "+ maxRange);
            System.out.println("You gotta guess it in "+ maxAttempts + " Attempts");
            System.out.println("Get ready to flex those guessing skills!");

            int attempt = 0;

            while (attempt < maxAttempts){
                System.out.println("Toss in your guess");
                int guess = sc.nextInt();
                attempt ++ ;

                if (guess< target){
                    System.out.println("Too lesss");
                }
                else if (guess>target){
                    System.out.println("Too highh");

                }

                else{
                    System.out.println("Lessssss Goooo!! You nailed it in " + attempt + " attempts");
                    score = maxAttempts - attempt + 1;
                    break;
                }

                if (attempt == maxAttempts){
                    System.out.println("Aw, snap! You've used up all your tries, fam.");
                }

              
            }
            score = maxAttempts-attempt+1;
            System.out.println("score: " +score);
            System.out.println("wanna hit it up again? (yes or no)");
            String answer = sc.next().toLowerCase();
            playGame = answer.equals("yes");
           
            score = maxAttempts - attempt +1;
            
        }
        
        System.out.println("thanks for playing bud! see ya later.");
        sc.close();

    }
    
}

//let's see if it works!!
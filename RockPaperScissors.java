import java.util.Random;
import java.util.Scanner;

public class RPS {
    public static String generateComputerChoice(Random random){
        int wordNum;
        wordNum = random.nextInt(3) + 1;
        String compCh = "";
        if(wordNum == 1){
            compCh = "rock";
        }
        else if(wordNum == 2){
            compCh = "paper";
        } else if(wordNum == 3){
            compCh = "scissors";
        }
        System.out.println("The Computer already made it's choice");
        return compCh;
    }
    //Function to show the list of available options
    public static void showMenu(){
        System.out.println("Options to choose from :\n1.Rock\n2.Paper\n3.Scissors");
    }
    public static String getUserChoice(Scanner scanner){
        String userCh = "";
        System.out.println("Please make yours : ");
        userCh = scanner.nextLine();
        return userCh;

    }
    public static String chooseWinner(String compCh,String userCh){
        String winner = "No Winner";
        String customMessage = "Both choose same";
        String finalMessage = "";

        String rockCustomMessage = "The rock smashes the scissor";
        String scissorsCustomMessage = "Scissors cuts paper";
        String paperCustomMessage = "Paper wraps rock";

        if( compCh.equals( "rock" ) && userCh.equalsIgnoreCase( "scissors" ) ){
            winner = "Computer";
            customMessage = rockCustomMessage;
        }else if( userCh.equalsIgnoreCase( "rock" ) && compCh.equals( "scissors" ) ){
            winner = "User";
            customMessage = rockCustomMessage;
        }

        if( compCh.equals( "scissors" ) && userCh.equalsIgnoreCase( "paper" ) ){
            winner = "Computer";
            customMessage = scissorsCustomMessage;
        }else if( userCh.equalsIgnoreCase( "scissors" ) && compCh.equals( "paper" ) ){
            winner = "User";
            customMessage = scissorsCustomMessage;
        }

        if( compCh.equals( "paper" ) && userCh.equalsIgnoreCase( "rock" ) ){
            winner = "Computer";
            customMessage = scissorsCustomMessage;
        }else if( userCh.equalsIgnoreCase( "paper" ) && compCh.equals( "rock" ) ){
            winner = "User";
            customMessage = paperCustomMessage;
        }

        //Winner Logic for the game ends
        finalMessage = winner + " won ( " + customMessage + " )";

        //Returning the final message
        return finalMessage;

    }

    //Main Function of the program
    public static void main( String [] args ){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String compCh;
        String userCh;
        String winner;

        showMenu();
        compCh = generateComputerChoice( random );
        userCh = getUserChoice( scanner );
        winner = chooseWinner( compCh, userCh );

        System.out.println( "\nYou choose : " + userCh + "\nComputer choose : " + compCh );
        System.out.println( winner );

    }

}


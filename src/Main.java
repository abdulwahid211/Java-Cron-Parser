import java.util.Scanner;



//  Input example:
//  */15 0 1,15 * 1-5 /usr/bin/find

public class Main {

    public static CronParser cronParser;

    public static Scanner userInput;

    public static void main(String[] args) {

        userInput = new Scanner(System.in);

        System.out.println("Please enter your expression :");

        String input = userInput.nextLine();

        cronParser = new CronParser(input);

        cronParser.runProcess();

        cronParser.output();


    }
}

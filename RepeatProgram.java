import java.util.Scanner;

public class RepeatProgram {

    public boolean exit = true;
    
    private final YES = 1;
    private final NO = 2;

    public void continueOrNot() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you want to repeat? 1 - YES, 2 - NO");
        int exitChoise = scanner.nextInt();

        switch (exitChoise) {
            case YES:
                break;
            case NO:
                exit = false;
                break;
            default:
                System.out.println("Wrong choise! Escaping...");
                exit = false;
        }
    }
}

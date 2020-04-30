import java.util.Scanner;

public class ProgramRepeater {

    private static final int EXIT_NO = 1;
    private static final int EXIT_YES = 2;

    private boolean exit = false;

    public void continueOrNot() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you want to leave? 1 - NO, 2 - YES");
        int exitChoise = scanner.nextInt();

        switch (exitChoise) {
            case EXIT_NO:
                break;
            case EXIT_YES:
                exit = true;
            default:
                exit = true;
                System.out.println("See you next time!");
                break;
        }
    }

    public boolean isExit() {
        return exit;
    }
}

import java.util.Scanner;

public class RepeatProgram {

    public boolean exit = true;

    public void continueOrNot() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you want to repeat? 1 - YES, 2 - NO");
        int exitChoise = scanner.nextInt();

        switch (exitChoise) {
            case 1:
                break;
            case 2:
                exit = false;
                break;
            default:
                System.out.println("Wrong choise! Escaping...");
                exit = false;
        }
    }
}

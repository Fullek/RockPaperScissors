import java.util.Scanner;

public class Menus {

    Scanner scanner = new Scanner(System.in);
    GetSet getSet = new GetSet();

    public void header() {

        System.out.println("Enter the first name: ");

        getSet.setFirstInput(scanner
                .nextLine()
                .toLowerCase());

        System.out.println("Enter the second one: ");

        getSet.setSecondInput(scanner
                .nextLine()
                .toLowerCase());
    }

    public void checker() {

        String firstInput = getSet.getFirstInput();
        String secondInput = getSet.getSecondInput();

        if ((firstInput.equals("rock") && secondInput.equals("paper")) ||
                (firstInput.equals("paper") && secondInput.equals("rock"))) {
            System.out.println("The Paper Wins!");

        } else if ((firstInput.equals("rock") && secondInput.equals("scissors")) ||
                (firstInput.equals("scissors") && secondInput.equals("rock"))) {
            System.out.println("The Rock Wins!");

        } else if ((firstInput.equals("scissors") && secondInput.equals("paper")) ||
                (firstInput.equals("paper") && secondInput.equals("scissors"))) {
            System.out.println("The Scissors Win!");

        } else {
            System.out.println("You have entered wrong names!");
        }
    }

}

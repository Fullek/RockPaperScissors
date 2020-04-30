public class Game {

    private InputManager inputManager;

    public Game(InputManager inputManager) {
        this.inputManager = inputManager;
    }

    public void rockPaperScissors() {

        String firstInput = inputManager.getFirstInput();
        String secondInput = inputManager.getSecondInput();


        if ((firstInput.equals("rock") && secondInput.equals("paper")) ||
                (firstInput.equals("paper") && secondInput.equals("rock"))) {
            System.out.println("Paper wins!");

        } else if ((firstInput.equals("rock") && secondInput.equals("scissors")) ||
                (firstInput.equals("scissors") && secondInput.equals("rock"))) {
            System.out.println("Rock Wins!");

        } else if ((firstInput.equals("scissors") && secondInput.equals("paper")) ||
                (firstInput.equals("paper") && secondInput.equals("scissors"))) {
            System.out.println("Scissors Win!");

        } else {
            System.out.println("You have input wrong names!");
        }
    }
}

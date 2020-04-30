public class GameController {

    public void programDemo() {
        InputManager inputManager = new InputManager();
        Header header = new Header(inputManager);
        ProgramRepeater repeat = new ProgramRepeater();
        Game game = new Game(inputManager);


        System.out.println("Let's play Rock, Paper, Scissors game!");

        do {
            header.headerDisplaying();
            game.rockPaperScissors();
            repeat.continueOrNot();
        } while (!repeat.isExit());
    }
}

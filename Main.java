public class Main {

    public static void main(String[] args) {

        Menus menus = new Menus();
        RepeatProgram repeat = new RepeatProgram();

        System.out.println("Let's play Rock, Paper, Scissors game!");

        do {
            menus.header();
            menus.checker();
            repeat.continueOrNot();
        } while (repeat.exit);
    }
}

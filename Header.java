import java.util.Scanner;

public class Header {
    private InputManager inputManager;
    private Scanner scanner = new Scanner(System.in);


    public Header(InputManager inputManager) {
        this.inputManager = inputManager;
    }

    public void headerDisplaying() {

        System.out.println("Please input first name: ");

        inputManager.setFirstInput(scanner
                .nextLine()
                .toLowerCase());

        System.out.println("Now input second name: ");

        inputManager.setSecondInput(scanner
                .nextLine()
                .toLowerCase());
    }

}

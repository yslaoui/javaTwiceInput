package twice;

import java.util.Scanner;

public class UserInterface {

    Scanner scanner;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start() {
        String word = "-1";
        while(!(word.equals("end"))) {
            System.out.print("Write a word: ");
            word = this.scanner.nextLine();
        }
        System.out.println("You wrote the word end !");

    }
}

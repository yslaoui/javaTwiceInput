package twice;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    Scanner scanner;
    WordSet wordset;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.wordset = new WordSet();
    }

    public void start() {
        String word = "-1";
        while(true) {
            System.out.print("Write a word: ");
            word = this.scanner.nextLine();
            if (this.wordset.contains(word)) {
                System.out.println("You entered this word twice !");
                break;
            }
            this.wordset.add(word);
        }
    }
}



package twice;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    Scanner scanner;
    ArrayList<String> words;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.words = new ArrayList<>();
    }

    public void start() {
        String word = "-1";
        while(true) {
            System.out.print("Write a word: ");
            word = this.scanner.nextLine();
            if (this.words.contains(word)) {
                System.out.println("You entered this word twice !");
                break;
            }
            words.add(word);
        }
    }
}



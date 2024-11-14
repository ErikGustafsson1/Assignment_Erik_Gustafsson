import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Write a sentence.");
        String text = input.nextLine();
        Logic logic = new Logic(text);
        logic.mainLogic();
        System.out.println("The string has " + logic.lineCounter() + " lines.");
        System.out.println("The string has " + logic.characterCounter() + " characters.");
        System.out.println("The word count is " + logic.wordCounter() + ".");
        System.out.println("The longest word in the string is " + logic.longestWord() + ".");
    }
}
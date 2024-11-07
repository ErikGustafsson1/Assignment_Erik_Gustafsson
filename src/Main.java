import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Write a sentence.");
        String text = input.nextLine();
        Logic logic = new Logic(text);
        logic.MainLogic();
        System.out.println("The string has " + logic.LineCounter() + " lines.");
        System.out.println("The string has " + logic.CharacterCounter() + " characters.");
        System.out.println("The word count is " + logic.WordCounter() + ".");
        System.out.println("The longest word in the string is " + logic.LongestWord() + ".");
    }
}
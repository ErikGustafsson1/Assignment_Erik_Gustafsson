//import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Logic {

    String textInput;
    String longestWord;
    List<String> stringList = new ArrayList<>();
    int enterCounter = 0;
    int wordCount = 0;
    char space = ' ';
    boolean disableInput = false;
    Scanner scanner = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();

    Logic (String text)
    {
        this.textInput = text;
    }

    void DisableInput()
    {
        // Only called for test purposes
        disableInput = true;
    }

    void MainLogic()
    {
        boolean characterCheck = false;
        while(textInput!=null) // Used to have value true
        {
            //Check if string only has space characters
            for (int i = 0; i < textInput.length(); i++)
            {
                if(textInput.charAt(i) != space)
                {
                    characterCheck = true;
                    break;
                }
//                else
//                {
//                    continue;
//                }
            }
            if (characterCheck)
            {
                // Character has been found
                if (textInput.equals("Stop"))
                {
                    break;
                }
                enterCounter++;
                sb.append(textInput + space); // Adds a space to last word, making the characters +1
                System.out.println("Input a new string:");
                System.out.println(sb);
            }
            if(!characterCheck)
            {
                System.out.println("Please enter a String with characters.");
            }
            characterCheck = false;
            if(!disableInput)
            {
                textInput = scanner.nextLine();
            }
            else
            {
                textInput = ("Stop");
            }
        }
    }

    public int CharacterCounter()
    {
        return sb.length() -1; // -1 to compensate final space
    }

    public int LineCounter()
    {
        return enterCounter;
    }

    public int WordCounter()
    {
        boolean spaceDetected = true; // boolean used to have big B
        for(int i = 0; i<sb.length(); i++) // Checks if the string has a space and counts each one
        {
            if (!spaceDetected)
            {
                // Handle multiple spaces
                if(sb.charAt(i)== space)
                {
                    // Multiple spaces detected
                    continue;
                }
                spaceDetected = true;
            }
            if(sb.charAt(i)== space)
            {
                // New word identified
                wordCount++;
                spaceDetected = false;
            }
        }
        return wordCount;

    }

    public String LongestWord()
    {
        int x = 0;
        int maxLength = 0;
        //boolean bool = true;

        for(int i = 0; i < sb.length(); i++)
        {
            if (sb.charAt(i) == space)
            {
                stringList.add(sb.substring(x,i));
                for (String str : stringList)
                {
                    if(str.length() > maxLength)
                    {
                        longestWord = str;
                        maxLength = str.length();
                    }
                }
                x = i + 1;
            }
        }
        return longestWord;
    }
}

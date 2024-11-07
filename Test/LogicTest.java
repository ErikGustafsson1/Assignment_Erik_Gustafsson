import org.junit.Test;

import static org.junit.Assert.*;
public class LogicTest {
    
    @Test
    public void characterCounterReturn_12() {
        Logic logic = new Logic("What is life");
        logic.DisableInput();
        logic.MainLogic();
        assertEquals(12,logic.CharacterCounter());
    }

    @Test
    public void lineCounterShouldReturn_1() {
        Logic logic = new Logic("What is life");
        logic.DisableInput();
        logic.MainLogic();
        assertEquals(1,logic.LineCounter());

    }

    @Test
    public void wordCounterShouldReturn_3() {
        Logic logic = new Logic("What is life");
        logic.DisableInput();
        logic.MainLogic();
        assertEquals(3,logic.WordCounter());
    }

    @Test
    public void stringShouldReturn_Clarification() {
        Logic logic = new Logic("I need some Clarification on this subject");
        logic.DisableInput();
        logic.MainLogic();
        assertEquals("Clarification",logic.LongestWord());
    }
}
import org.junit.Test;

import static org.junit.Assert.*;
public class LogicTest {
    
    @Test
    public void testStringCharacterCount() {
        Logic logic = new Logic("What is life");
        logic.DisableInput();
        logic.mainLogic();
        assertEquals(12,logic.characterCounter());
    }

    @Test
    public void testLineCounter() {
        Logic logic = new Logic("What is life");
        logic.DisableInput();
        logic.mainLogic();
        assertEquals(1,logic.lineCounter());

    }

    @Test
    public void testWordCountReturn() {
        Logic logic = new Logic("What is life");
        logic.DisableInput();
        logic.mainLogic();
        assertEquals(3,logic.wordCounter());
    }

    @Test
    public void testLongestWordInString() {
        Logic logic = new Logic("I need some Clarification on this subject");
        logic.DisableInput();
        logic.mainLogic();
        assertEquals("Clarification",logic.longestWord());
    }
}
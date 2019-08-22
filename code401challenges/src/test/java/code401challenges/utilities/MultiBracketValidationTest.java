package code401challenges.utilities;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiBracketValidationTest {
    MultiBracketValidation multiBracketValidation = new MultiBracketValidation();
    @Test
    public void multiBracketValidation() {
        assertTrue(multiBracketValidation.multiBracketValidation("{[(hello)]}"));
    }
    @Test
    public void multiBracketValidation_Fail() {
        assertFalse(multiBracketValidation.multiBracketValidation("{()]}"));
    }
    @Test
    public void multiBracketValidation_FailLastOpening() {
        assertFalse(multiBracketValidation.multiBracketValidation("{[(hello)]}{"));
    }
    @Test
    public void multiBracketValidation_FailFirstClosing() {
        assertFalse(multiBracketValidation.multiBracketValidation("}{[()]}{"));
    }
    @Test
    public void multiBracketValidation_TrueEmpty() {
        assertTrue(multiBracketValidation.multiBracketValidation(""));
    }
    @Test
    public void multiBracketValidation_TrueNoBrackets() {
        assertTrue(multiBracketValidation.multiBracketValidation("adfljdfl"));
    }
}
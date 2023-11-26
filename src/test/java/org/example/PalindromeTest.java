
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    Palindrome pal = new Palindrome();
    @BeforeEach
    public void setUp()
    {

    }
    @Test
    void testPalindromeTrue ()
    {
        assertTrue(pal.IsWordPalindrome("madam"));
    }

    @Test
    void testPalindromeFalse() {
        assertFalse(pal.IsWordPalindrome("bag"));
    }

    @Test
    void testPalindromeFalseWithTwoWords ()
    {
        assertFalse(pal.IsWordPalindrome("aga rur"));
    }


}
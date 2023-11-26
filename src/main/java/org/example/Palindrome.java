

public class Palindrome {

    public boolean IsWordPalindrome(String wd)
    {
        wd = wd.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();// This line remove non-alphanumeric characters and converts the string to lowercase.

        int start=0;
        int finish = wd.length()-1;

        while (start < finish) {//the while loop continues until the "start" index is less than the "finish" index.

            if (wd.charAt(start) != wd.charAt(finish)) {//check whether the characters in the string indices are not equal.
                return false;
            }
            start++;
            finish--;
        }

        return true;
    }
}

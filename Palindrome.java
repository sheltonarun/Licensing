public class PalindromeString {
    public static void main(String[] args) {
        String str = "madam"; // The string to check
        String reversedStr = "";

        // Reverse the string
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }

        // Compare the original and reversed strings (case-insensitive)
        if (str.equalsIgnoreCase(reversedStr)) {
            System.out.println(str + " is a palindrome string.");
        } else {
            System.out.println(str + " is not a palindrome string.");
        }
    }
}

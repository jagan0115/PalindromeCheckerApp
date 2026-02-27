public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Input string
        String input = "madam";
        String reverse = "";

        // Reverse the string using for loop
        for (int i = input.length() - 1; i >= 0; i--) {
            reverse = reverse + input.charAt(i);
        }

        // Compare original and reversed strings
        if (input.equals(reverse)) {
            System.out.println("The string \"" + input + "\" is a Palindrome");
        } else {
            System.out.println("The string \"" + input + "\" is Not a Palindrome");
        }
    }
}
package class_and_object.level2.palindrome_string;

public class Main {
    public static void main(String[] args) {
        PalindromeChecker text = new PalindromeChecker("ABBBA");
        Boolean flag = text.checkPalindrome();
        text.display(flag);
    }
}

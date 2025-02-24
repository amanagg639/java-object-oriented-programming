package class_and_object.level2.palindrome_string;

public class PalindromeChecker {
    String text;
    PalindromeChecker(String text){
        this.text = text;
    }
    public boolean checkPalindrome(){
        int i=0;
        int j=text.length()-1;
        while (i<j){
            if(text.charAt(i++) != text.charAt(j--))return false;
        }
        return true;
    }
    public void display(boolean check){
        if(check) System.out.println("this is palindrome");
        else System.out.println("this is not palindrome");
    }
}

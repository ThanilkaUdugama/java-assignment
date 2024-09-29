import java.util.*;
public class Question_1 {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    String inputWord;
    System.out.println("Enter Odd Length Word");
    inputWord = scanner.next();
    Integer wordLength = inputWord.length();
    if ( wordLength % 2 == 1){
        System.out.println("The middle character of '" + inputWord + "' is '" + inputWord.charAt((wordLength)/2) +"'.");
    }
    else{
        System.out.println("The word your entered has even number of characters");
    }
    
  }
}
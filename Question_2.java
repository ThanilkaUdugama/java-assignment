import java.util.*;
public class Question_2 {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    String name;
    System.out.println("Enter Full Name (format: first middle last)");
    name = scanner.nextLine();
    String [] nameParts = name.split(" ");
    
    if(nameParts.length == 3){
        System.out.println(nameParts[2] + ", " + nameParts[1] + " " + nameParts[0].charAt(0));
    }else{
        System.out.println("Invalid Input");
    }
    
  }
}
import java.util.*;
public class Question_3 {
  public static void main(String args[]) {
    final Double cmPerInch = 2.54;
    final Double cmPerFt = 30.48;
    Scanner scanner = new Scanner(System.in);
    Double lengthInCm;
    System.out.print("Enter Length in centimeters: ");
    lengthInCm = scanner.nextDouble();
    Integer ft = (int) Math.floor(lengthInCm / cmPerFt);
    Integer inches = (int) Math.round((lengthInCm % cmPerFt) / cmPerInch);
    
    System.out.println(lengthInCm+" cm = "+ ft +" ft "+ inches + " inches");

  }
}
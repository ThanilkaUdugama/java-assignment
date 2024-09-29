import java.util.*;

class Circle {
    private double radius;
    private final double PI = 3.141592653589793;

    public Circle(double radius) {
        this.radius = radius;
    }

    double computeArea() {
        return PI * Math.pow(this.radius, 2);
    }
    
    double computeCircumference(){
        return 2 * PI* this.radius;
    }

}

public class Question_5 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        double ro, ri;
        System.out.print("Enter the Inner Cricle radius: ");
        ri = scanner.nextDouble();
        System.out.print("Enter the Outer Cricle radius: ");
        ro = scanner.nextDouble();
        
        if (ro > ri){
            Circle outerCircle = new Circle(ro); 
            Circle innerCircle = new Circle(ri); 
            System.out.println("Area of a circular region is "+ (outerCircle.computeArea() - innerCircle.computeArea()) );
            
        }
        else{
            System.out.println("Invalid : Outer Radius is Larger Than Inner Radius");
        }
            
        }
        
        
}

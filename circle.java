import java.util.Scanner;
public class circle {
    public static void main(String[] args) {
        final double PI=3.1412;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        int r=input.nextInt();
        double radius=PI*r*r;
        double circumference=2*PI*r;
        System.out.print("Radius of circle is: "+radius+"\nCircumference of circle: "+circumference);
        
    }

    
}

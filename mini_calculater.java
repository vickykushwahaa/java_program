import java.util.Scanner;
public class mini_calculater {
    public static void main(String[] args) {
Scanner input =new Scanner(System.in);
System.out.println("Enter your first number: ");
int num1=input.nextInt();
System.out.println("Enter your second number: ");
int num2=input.nextInt();
System.out.println("Enter your opretion: ");
String operater=input.next();
int result =switch(operater){
    case"+" -> num1+num2;
    case"_" -> num1 - num2;
    default -> -1;

    };
    System.out.println(result);
   } 
}

import java.util.Scanner;
public class even_or_odd {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("Enter your number: ");
    int n =input.nextInt();
    String result=n%2==0?"even":"odd";
    System.out.println("Your Given Number is "+result);
    
}
}

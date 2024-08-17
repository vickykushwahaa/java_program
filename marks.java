import java.util.Scanner;
public class marks {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks =input.nextInt();
        String result = marks>80? "High":(marks>50? "Average":"low");
        System.out.println(result);
    }

}

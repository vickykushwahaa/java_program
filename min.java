import java.util.Scanner;
public class min {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1=input.nextInt();
        System.out.println("Enter the second number: ");
        int num2 =input.nextInt();
        min minimum =new min();
        int mini =minimum.mini(num1,num2);
        System.out.println("minimum number is "+mini);

    }
    public int mini(int num1,int num2){
       return num1<num2?num1:num2;
        
    
}
}

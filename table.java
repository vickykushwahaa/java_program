import java.util.Scanner;
public class table {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num=input.nextInt();
        for(int i=1;i<=10;i++){
       int number=i*num;
        System.out.println(number);
    }

    }
    
}

import java.util.Scanner;
public class prime_no {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num=input.nextInt();
        
        System.out.println("you number is "+(isPrime(num)?"prime":"not prime"));
    
    }
    public static boolean isPrime(int num){
        for(int i=2;i>num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    
}

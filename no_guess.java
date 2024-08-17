import java.util.Scanner;
public class no_guess {
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=5,guess;
        do
        {
            System.out.println("Guess your number: ");
              guess=input.nextInt();
        }while(num!=guess);
        System.out.println("you guess wright number");
    }
}

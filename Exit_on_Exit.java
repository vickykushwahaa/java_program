
import java.util.Scanner;
public class Exit_on_Exit {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(true){
        System.out.print("type your word: ");
        String word=input.next();
        if(word.equals("exit")){
            System.out.println("you hava successfully geussed");
            break;
        }
        }
        
    }
    
}

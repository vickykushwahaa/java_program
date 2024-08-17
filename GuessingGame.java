import java.util.Scanner;
class GuessingGame {
    int random;
    GuessingGame(){
        random= (int) Math.ceil(Math.random()*100);
    } 
    int Guess(int GuessNumber){
        return GuessNumber-random;
    }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        GuessingGame game=new GuessingGame();
        System.out.println("welcome to guessing game.\n guess number between 0 to 100.");
        int guess;
        int result;
        do{
           System.out.print("Enter you number: ");
           guess=input.nextInt();
           result=game.Guess(guess);
           if(result==0){
            System.out.println("congrats, you guessed right number");
           }else if(result>0){
            System.out.println("please guess lower");
           }else{
           System.out.println("please guess higher");
           }
        }while(result!=0);
    }
}

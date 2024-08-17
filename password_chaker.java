import java.util.Scanner;
public class password_chaker {
public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
   String password;
    do{
    System.out.print("Enter your password: ");
    password=input.next();
    }
    while(!validpassword(password));
    System.out.println("your password is valid");
}
public static boolean validpassword(String password){
    return password.length()>6;
}
    
}

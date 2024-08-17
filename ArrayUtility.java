import java.util.Scanner;
public class ArrayUtility {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int size=input.nextInt();
    int[] nums=new int[size];
    for(int i=0;i<size;i++){
        System.out.println("Enter your element no"+(i+1)+": ");
        nums[i]=input.nextInt();
    
    }
    
}
}

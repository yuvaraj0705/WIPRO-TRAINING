import java.util.*;
public class IntCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = scanner.nextInt();
        scanner.close();
        if(a<0){
            System.out.println("The number is negative");
        }
        else if(a>0){
            System.out.println("The number is positive");
        }
        else{
            System.out.println("The number is zero");
        }
    }

       
}

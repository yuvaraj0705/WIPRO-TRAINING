import java.util.*;
public class OddorEven {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = scanner.nextInt();
    scanner.close();
    if(num%2 == 0){
        System.out.println("The number is even.");
    }
    else{
        System.out.println("The number is odd.");
    }
    }
}

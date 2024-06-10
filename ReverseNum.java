public class ReverseNum {
    public static void main(String[] args) {
        int num = 2345;
        int reversed = reverse(num);
        System.out.printf("The reversed number is ", reversed);
    }
    public static int reverse(int num){
        int reversed = 0;
        while(num != 0){
            int digit = num % 10;
            reversed = reversed * 10 + digit;
        }
        return reversed;    
    }
}

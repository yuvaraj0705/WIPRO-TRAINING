public class SameLastDigit {
    public static void main(String[] args){
        int a = 34;
        int b = 25;
        int lastd1 = a%10;
        int lastd2 = b%10;
        if(lastd1 == lastd2){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}

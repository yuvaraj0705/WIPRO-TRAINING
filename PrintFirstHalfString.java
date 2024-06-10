public class PrintFirstHalfString {
    public static void main(String[] args) {
        String input = "Helloo";
        int len = input.length();
        
        if(len%2 == 0){
            for(int i = 0; i<len/2;i++){
                System.out.print(input.charAt(i));
            }
        }
        else{
            System.out.println("null");
        }
    }
    
}

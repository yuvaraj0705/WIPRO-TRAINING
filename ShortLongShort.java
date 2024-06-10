public class ShortLongShort {
    public static void main(String[] args) {
        String s = "hi";
        String l = "hello";
        int len1 = s.length();
        int len2 = l.length();

        if(len1<len2){
            System.out.println(s + l + s);
        }
        else if(len2<len1){
            System.out.println(l + s + l);
        }
        else{
            System.out.println("no string is longer");
        }

    }
    
}

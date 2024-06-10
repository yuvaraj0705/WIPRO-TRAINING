class Dimensions{
    float height;
    float width;
    float depth;
    float volume(){
        return height * width * depth;
    }
}
class Volume{
    public static void main(String[] args) {
        Dimensions box = new Dimensions();
        box.height= 20;
        box.width=10;
        box.depth=5;
        System.out.println(box.volume());
    }
}
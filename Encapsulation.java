class Author{
    private String  name;
    private String email;
    private char gender;
    public Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;      
    }
    public String toString() {
        return 
                "Author name= " + name + 
                "  email= " + email  +
                "  gender= " + gender ;
    }
}
class Book{
    private String name;
    private Author author;
    private Double price;
    private int qtyInStock;
    public Book(String name, Author author, Double price, int qtyInStock){
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    
    }
    public String toString() {
        return "Book: \n" +
                "name='" + name + '\'' +
                "\n author=" + author +
                "\n price=" + price +
                "\n qtyInStock=" + qtyInStock;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Author author = new Author("nidhish", "nidhish@gmail.com", 'M');

        Book book = new Book("Book about book", author, 1200.4, 4);
 
        System.out.println("Author Details:");
        System.out.println("---------------");
        System.out.println( author.toString());
 
        System.out.println("\nBook Details:");
        System.out.println("------------");
        System.out.println( book.toString());
     }
}
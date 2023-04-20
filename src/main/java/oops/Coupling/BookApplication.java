package oops.Coupling;

public class BookApplication {
    public static void main(String[] args) {
        Author author= new Author();
        author.name="Bootcoding";
        author.education="B.Tech";
        author.Phone=8055669881l;

        Book book= new Book();
        book.title="Good Logic";
        book.publisher="Navneet";
        book.price=500.00;
        book.author=author;

        System.out.println("BookTitle"+ book.title);
        System.out.println("Book Publisher"+ book.publisher);
        System.out.println("Book Price"+ book.price);
        System.out.println("Book Author"+ book.author.name);

    }

}

import java.util.*;
class Book{
    String title;
    String author;
    String isbn;
        
    //Q3 constructor
    public Book(String title,String author, String isbn){
         this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    public String getTitle() {
            return title;
    }
    public void setTitle(String title){  //Q4 setter
            this.title = title;
    }
    public String getauthor(){    //Q4 getter
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public String getIsbn() {
        return isbn;
    }
    
    public void setIsbn(String isbn) {
         this.isbn = isbn;
    }
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn;
    }    
}
    //Q2 inheritance
    class Ebook extends Book{
        int size;
        String format;
        //Q3 constructor
        public Ebook(String title,String author, String isbn, int size, String format){
            super(title, author, isbn);
            this.size = size;
            this.format = format;
        }
        public int getSize(){
            return size;
        }
        public void setSize(int size){
            this.size = size;
        }
        public String getFormat(){
            return format;
        }
        public void setFormat(String format){
            this.format = format;
        }
        public String toString(){
            return super.toString() +" File Size: "+size+"MB  "+"Format: "+format;
        }
    }
class Library{
    List<Book> book;
   //constructor
    public Library(){
     book = new ArrayList<>();
    }
    public void addBook(Book b){
      book.add(b);
    }
    public void removeBook(String author){
      book.removeIf(book -> book.getauthor().equals(author));
    }
    public void displayBooks(){
      if(book.isEmpty()){
          System.out.println("No books are available in the library! ");
        }
        else{
          for(Book book :book){
          System.out.println(book);
        }
       }
    }
    public static void main(String[] args) {
        Library lib = new Library();
        Book book1 = new Book("Science", "heloo", "1010");
        Book book2 = new Book("Math", "hiii", "1009");
        Book book3 = new Book("Science", "Hello", "1011");
        Book book4 = new Book("Computer1", "world", "1000");

        lib.addBook(book1);
        lib.addBook(book2);
        lib.addBook(book3);
        lib.addBook(book4);

        System.out.println("Present books in Library : ");
        lib.displayBooks();
        System.out.println();
        System.out.println("Books in Lib After removal :");
        lib.removeBook("heloo");
        lib.displayBooks();
        System.out.println();
        Ebook ebook1 = new Ebook("Social Science", "hjhj", "09090", 78, "text");
        System.out.println("Extend by ebook :");
        lib.addBook(ebook1);
        lib.displayBooks();
    }
}
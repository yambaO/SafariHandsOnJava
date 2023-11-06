package ClassObject;

public class BookDemo {
    public static void main(String[] args) {
        Book gameOfThrones = new Book("George Martin", "Game of Thrones", "fantasy" , 864);
        Book mathBook = new Book("james Stewart", "Calculus", "Math", 1392);
        gameOfThrones.printBookDetails();
        mathBook.printBookDetails();
//printBookDetails(gameOfThrones);
//printBookDetails(mathBook);
    }
//    public static void printBookDetails (Book book){
//        System.out.println(book.getAuthor());
//        System.out.println(book.getNumPages());
//        System.out.println(book.getTitle());
//        System.out.println(book.getNumPages());
//    }
}
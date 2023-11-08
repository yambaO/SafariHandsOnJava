package ClassObject;

public class BookDemo {
    public static void main(String[] args) {
        Book gameOfThrones = new Book("George Martin", "Game of Thrones", "fantasy", 864);
        Book mathBook = new Book("james Stewart", "Calculus", "Math", 1392);
        gameOfThrones.printBookDetails();
        mathBook.printBookDetails();
    }
}
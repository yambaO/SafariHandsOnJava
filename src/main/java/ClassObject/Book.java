package ClassObject;

public class Book {
    private String author;
    private String title;
    private String genre;

    private int numPages;
    public Book(){

    }
    public Book(String author, String title, String genre, int numPages){
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.numPages = numPages;
    }
    public String getAuthor(){
        return author;
    }
    public String getTitle(){
        return  title;

    }
    public String getGenre(){
        return genre;
    }
    public int getNumPages(){
        return numPages;
    }

    public void printBookDetails(){
        System.out.println(getAuthor());
        System.out.println(getNumPages());
        System.out.println(getTitle());
        System.out.println(getNumPages());
    }
}


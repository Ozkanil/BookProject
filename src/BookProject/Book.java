package BookProject;

public abstract class Book {

    private String name;
    private String content;
    private String author;
    private int publicationYear;



    abstract String getAuthor();

    abstract String getName();

    abstract String getContent();

    abstract int getPublicationsYear();


}

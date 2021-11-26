package BookProject;

public class Poetry extends Book implements Price {

    private String name= "Mountain Interval";
    private String author= "Robert Frost";
    private String content= "The book was republished in 1920, and after making several alterations in the sequencing of the collection, Frost released a new edition in 1924. Five lyrics of the earlier collection were compiled next under the title \"The Hill Wife\". In this volume only three poems are written in dramatic monologue.";
    private int publicationYear= 1916;
    private double price= 10.50;


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getAuthor() {
        return this.author;
    }

    @Override
    public String getContent() {
        return this.content;
    }

    @Override
    int getPublicationsYear() {
        return 0;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }
    @Override
    public boolean isPrintBook() {
        return true;
    }

    @Override
    public String toString() {
        return "Novel:" + "\n"+
                "Name: " + name +"\n"+
                "Author: " + author + "\n" +"Publication Year: " +
                publicationYear +"\n"+
                "About the book: " + content + "\n"+"Print book:"+isPrintBook()+"\n"+" Price is "+price+" USD";
    }

}

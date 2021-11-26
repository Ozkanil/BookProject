package BookProject;

public class Novel extends Book implements Price {

    private String name= "Pride and Prejudice";
    private String author= "Jane Austin";
    private String content= "Pride and Prejudice is an 1813 novel of manners written by Jane Austen. Though it is mostly called a romantic novel, it is also a satire. The novel follows the character development of Elizabeth Bennet, the dynamic protagonist of the book who learns about the repercussions of hasty judgments and comes to appreciate the difference between superficial goodness and actual goodness.";
    private int publicationYear= 1813;
    double price=15.00;


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
                "About the book: " + content + "\n"+"Print book:"+ isPrintBook()+"\n"+"Price is "+price+" USD";
    }

}


package BookProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Book book2= new Poetry();
        Book book= new Novel();
        Poetry book3= new Poetry();
        book3.setPrice(5.00);

        //Printing with HashMap

       HashMap<String, Book> myBook= new HashMap<>();
         myBook.put(book.getName(), book);
         myBook.put(book2.getName(),book3);
         myBook.put(book.getAuthor(),book);
         myBook.put(book2.getAuthor(),book3);
         System.out.println(myBook.get("Pride and Prejudice"));
         System.out.println(myBook.get("Robert Frost"));

       //Printing with List

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter book name");
        String bookEntered=scan.nextLine();

        ArrayList<Book> bookArray= new ArrayList<>();

        bookArray.add(book);
        bookArray.add(book3);

        Book match= null;
        for (Book w: bookArray){
            if (w.getAuthor().equalsIgnoreCase(bookEntered)){
                match=w;
                System.out.println(match);

        }

    }
}}

package srp.good;

import java.util.ArrayList;
import java.util.List;



public class BookTest {


    public static void main(String[] args) {
        Book book;
        List<String> pages = new ArrayList<String>();
        pages.add("Hello 1");
        pages.add("Hello 2");
        pages.add("Hello 3");
        pages.add("Hello 4");
        book = new Book("Test", "Serdar", pages);
        Printer htmlPrinter = new HtmlPrinter();
        System.out.println(htmlPrinter.print(book.getPages().get(book.getCurrentPage())));
        book.turnPage();
        Printer plainPrinter = new PlainTextPrinter();
        System.out.println(plainPrinter.print(book.getPages().get(book.getCurrentPage())));

    }


}
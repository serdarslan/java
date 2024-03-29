package srp.good;

import java.util.List;

public class Book {
    private String title;
    private String author;
    private List<String> pages;
    private int currentPageIndex = 0;

    public Book(String title, String author, List<String> pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void turnPage() {
        if (currentPageIndex < pages.size() - 1) {
            currentPageIndex++;
        }
    }

    public int getCurrentPage() {
        return currentPageIndex;
    }

    public List<String> getPages() {
        return pages;
    }

    public void setPages(List<String> pages) {
        this.pages = pages;
    }
}
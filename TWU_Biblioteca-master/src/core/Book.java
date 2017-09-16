package core;

public class Book {
    private String bookName;
    private String publishTime;
    private String author;

    public Book(String bookName, String publishTime, String author) {
        this.bookName = bookName;
        this.publishTime = publishTime;
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

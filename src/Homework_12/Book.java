package Homework_12;

public class Book {
    private final String bookName;
    private  int publishingYear;
    private Author author;
    public Book(String bookName, Author author, int publishingYear) {
        this.bookName = bookName;
        this.author = author;
        this.publishingYear = publishingYear;
    }
    public String getBookName() {
        return this.bookName;
    }
    public int getPublishingYear() {
        return this.publishingYear;
    }
    public Author getAuthor() {
        return author;
   }
    public void setPublishingYear(int publishingYear){
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString(){
        return bookName + "; " + author + "; " + publishingYear;
    }
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book book = (Book) other;
        return bookName.equals(book.getBookName()) && author.equals(book.getAuthor());
    }
}

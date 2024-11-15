
public class Book {
	
	    private int id;
	    private String title;
	    private String author;
	    private String publisher;

	    public Book(int id, String title, String author, String publisher) {
	        this.id = id;
	        this.title = title;
	        this.author = author;
	        this.publisher = publisher;
	    }

	    public int getId() {
	        return id;
	    }

	    public void setTitle(String title) {
	        this.title = title;
	    }

	    public void setAuthor(String author) {
	        this.author = author;
	    }

	    public void setPublisher(String publisher) {
	        this.publisher = publisher;
	    }

	    @Override
	    public String toString() {
	        return "ID: " + id + ", Title: " + title + ", Author: " + author + ", Publisher: " + publisher;
	    }
	}
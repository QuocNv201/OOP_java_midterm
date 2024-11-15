

import java.util.ArrayList;

public class BookManager {
	    private ArrayList<Book> books;

	    public BookManager() {
	        this.books = new ArrayList<>();
	    }

	    public void displayBooks() {
	        if (books.isEmpty()) {
	            System.out.println("Danh sách sách trống.");
	        } else {
	            for (Book book : books) {
	                System.out.println(book);
	            }
	        }
	    }

	    public void addBook(int id, String title, String author, String publisher) {
	        books.add(new Book(id, title, author, publisher));
	        System.out.println("Đã thêm sách thành công.");
	    }

	    public void editBook(int id, String title, String author, String publisher) {
	        boolean found = false;
	        for (Book book : books) {
	            if (book.getId() == id) {
	                found = true;
	                book.setTitle(title);
	                book.setAuthor(author);
	                book.setPublisher(publisher);
	                System.out.println("Đã sửa thông tin sách thành công.");
	                break;
	            }
	        }
	        if (!found) {
	            System.out.println("Không tìm thấy sách với ID đã nhập.");
	        }
	    }
	}
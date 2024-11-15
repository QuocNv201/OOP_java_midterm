
import java.util.Scanner;

public class LibraryManagement {
	    private static Scanner scanner = new Scanner(System.in);
	    private static BookManager bookManager = new BookManager();

	    public static void main(String[] args) {
	        while (true) {
	            System.out.println("\nMenu:");
	            System.out.println("1. Hien thi danh sach các quyen sach");
	            System.out.println("2. Them sach vao danh sach");
	            System.out.println("3. Sua thong tin sach theo ID");
	            System.out.println("4. Thoat chuong trinh");
	            System.out.print("Chon muc: ");

	            int choice = scanner.nextInt();
	            scanner.nextLine(); 

	            switch (choice) {
	                case 1:
	                    bookManager.displayBooks();
	                    break;
	                case 2:
	                    addBook();
	                    break;
	                case 3:
	                    editBook();
	                    break;
	                case 4:
	                    System.out.println("Thoat chuong trinh.");
	                    return;
	                default:
	                    System.out.println("Lua chon khong hop le, vui long thu lai.");
	            }
	        }
	    }

	    private static void addBook() {
	        System.out.print("Nhap ID sach: ");
	        int id = scanner.nextInt();
	        scanner.nextLine();
	        System.out.print("Nhap ten sach: ");
	        String title = scanner.nextLine();
	        System.out.print("Nhap ten tac gia: ");
	        String author = scanner.nextLine();
	        System.out.print("Nhap ten nha xuat ban: ");
	        String publisher = scanner.nextLine();

	        bookManager.addBook(id, title, author, publisher);
	    }

	    private static void editBook() {
	        System.out.print("Nhap ID sach can sua: ");
	        int id = scanner.nextInt();
	        scanner.nextLine();
	        System.out.print("Nhap ten sach moi: ");
	        String title = scanner.nextLine();
	        System.out.print("Nhap ten tac gia moi: ");
	        String author = scanner.nextLine();
	        System.out.print("Nhap ten nha xuat ban moi: ");
	        String publisher = scanner.nextLine();

	        bookManager.editBook(id, title, author, publisher);
	    }
}

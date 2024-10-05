import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Author author1 = new Author("Franz Kafka");
		author1.addBook("La metemorfosis", 50);
		author1.addBook("Carta al Padre", 45);
		Book book = new Book("Cartas a Milena",author1,30);
		author1.addBook(book);
		author1.getBooks();
		for(int i=0;i<author1.getBooks().size();i++) {
			author1.getBooks().get(i).getInfo();
		}
		
	}

}

package oopPractice;

public class BookTest {

	public static void main(String... args){
		
		Author auth = new Author("Gabriel García Marquez", "g.marquez@gmail.com", 'M');
		Book book = new Book("La celestina", auth, 9.99, 999);
		printStats(book);
		
		Author gotAuth = new Author("George R.R. Martin","g.martin@gmail.com",'M');
		Book got = new Book("A game of thrones. Song of ice and fire 1", gotAuth,19.99, 1100);
		printStats(got);
		
	}
	
	static void printStats(Book book){		
		
		System.out.println("Author name: "+book.getAuthor().getName()+"\nE-mail: "+book.getAuthor().getEmail());
		System.out.println("Author name with getters from book class:"+book.getAuthorName()+" ("+book.getAuthorGender()+")\nE-mail: "+book.getAuthorEmail());
		
	}
	
}

package oopPractice;

public class AuthorTest {

	public static void main(String... args){
		
		Author auth = new Author("Juan Ortiz P.", "j.ortiz@globant.com", 'M');
		System.out.println(auth);
		auth.setEmail("juan.ortiz@glbnt.com");
		System.out.println(auth);
		
	}
	
	
}


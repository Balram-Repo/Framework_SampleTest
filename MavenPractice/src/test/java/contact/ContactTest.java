package contact;

import org.testng.annotations.Test;

public class ContactTest {

	@Test
	public void createContactTest() {
		String BROWSER = System.getProperty("browser", "chrome");
		String URL = System.getProperty("url", "http://49.249.28.218:8888/");
		String USERNAME = System.getProperty("username", "admin");
		String PASSWORD = System.getProperty("password", "admin");

		System.out.println(BROWSER);
		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);

		System.out.println("Contact Created");
	}

	@Test
	public void deleteContactTest() {
		System.out.println("Contact Deleted");
	}

}

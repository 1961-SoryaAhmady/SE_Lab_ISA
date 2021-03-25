package indian_plants;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class user_testing {

	@Test
	void test() {
		User usr = new User("Sorya","Ahmady@123","sorya.ahmady@gmail.com");
		Boolean response= usr.user_register("Sorya","Ahmady@123","sorya.ahmady@gmail.com");
		Boolean actualresponses = true;
		assertEquals(actualresponses,response);
	}

}

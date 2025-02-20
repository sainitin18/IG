package Task_UnitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class VoterValidatorTest {
	VoterValidator v ;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
//		v = null;
	}

	@BeforeEach
	void setUp() throws Exception {
		v = new VoterValidator();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		Exception e = assertThrows(Exception.class,()->{
			 v.validateVoterAge(-1);
		});
		assertEquals("Invalid age", e.getMessage());
		
	}
	@ParameterizedTest
	@ValueSource(ints = { 19,20,45,78})
	public void validateVoterAgeTestParameter123(int age) throws Exception {
		
		Assertions.assertTrue(v.validateVoterAge(age));
	}

}

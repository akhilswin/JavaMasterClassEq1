package yaksha;

//import static org.junit.jupiter.api.Assertions.*;
import static yaksha.TestUtils.businessTestFile;
import static yaksha.TestUtils.currentTest;
import static yaksha.TestUtils.yakshaAssert;
//import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainClassTest {

	@Test
	public void testExceptionConditon() throws Exception {

		TestUtils.yakshaAssert(TestUtils.currentTest(), true, TestUtils.boundaryTestFile);
	}

	@Test
	public void testBoundaryCondition() throws Exception {

		TestUtils.yakshaAssert(TestUtils.currentTest(), true, TestUtils.exceptionTestFile);
	}

	@Test
	void testCheckSumOfOddEvenDigits() throws Exception {
		// Test will pass
		Number number1 = new Number(56895);
		yakshaAssert(currentTest(), (MainClass.checkSumOfOddEvenDigits(number1.getNumber()) == 1 ? "true" : "false"),
				businessTestFile);
	}

	@Test
	void testSumOfOddDigits() throws Exception {
		// Test will pass
		Number number1 = new Number(56895);
		yakshaAssert(currentTest(), (MainClass.SumOfOddDigits(number1.getNumber()) == 1 ? "true" : "false"),
				businessTestFile);
	}

	@Test
	void testSumOfEvenDigits() throws Exception {
		// Test will pass
		Number number2 = new Number(56896);
		yakshaAssert(currentTest(), (MainClass.SumOfEvenDigits(number2.getNumber()) == 1 ? "true" : "false"),
				businessTestFile);
	}
}

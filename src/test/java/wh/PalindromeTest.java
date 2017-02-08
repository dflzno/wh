package wh;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PalindromeTest {
	
	private final Palindrome testSubject = new Palindrome();

	@Test
	public void shouldSayItIsNotPalindromeIfStringIsEmpty() {
		// given
		String testString = "";
		
		// when
		boolean result = testSubject.test(testString);
		
		// then
		assertFalse(result);
	}
	
	@Test
	public void shouldSayItIsNotPalindromeIfStringIsNull() {
		// given
		String testString = null;
		
		// when
		boolean result = testSubject.test(testString);
		
		// then
		assertFalse(result);
	}
	
	
	@Test
	public void shouldSayItIsPalindromeIfStringIsOnly1Character() {
		// given
		String testString = "A";
		
		// when
		boolean result = testSubject.test(testString);
		
		// then
		assertTrue(result);
	}
	
	@Test
	public void shouldSayItIsNotPalindromeForStringBA() {
		// given
		String testString = "BA";
		
		// when
		boolean result = testSubject.test(testString);
		
		// then
		assertFalse(result);
	}
	
	@Test
	public void shouldSayItIsPalindromeForStringABCDEFEDCBA() {
		// given
		String testString = "ABCDEFEDCBA";
		
		// when
		boolean result = testSubject.test(testString);
		
		// then
		assertTrue(result);
	}
	
	@Test
	public void shouldSayItIsPalindromeForStringABCDEFFEDCBA() {
		// given
		String testString = "ABCDEFFEDCBA";
		
		// when
		boolean result = testSubject.test(testString);
		
		// then
		assertTrue(result);
	}
	
	@Test
	public void shouldSayItIsNotPalindromeForStringBCDEFFEDCBA() {
		// given
		String testString = "BCDEFFEDCBA";
		
		// when
		boolean result = testSubject.test(testString);
		
		// then
		assertFalse(result);
	}
	
	@Test
	public void shouldSayItIsPalindromeForStringABCDEEFEDCBA() {
		// given
		String testString = "ABCDEEFEDCBA";
		
		// when
		boolean result = testSubject.test(testString);
		
		// then
		assertFalse(result);
	}

}

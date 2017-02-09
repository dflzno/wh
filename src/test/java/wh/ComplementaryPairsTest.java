package wh;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ComplementaryPairsTest {
	
	private ComplementaryPairs cp;

	@Test(expected = IllegalArgumentException.class)
	public void shouldThrowExceptionIfArrayIsEmpty() {
		// given
		cp = new ComplementaryPairs(null);
		
		// when
		cp.findKComplementaryPairs(1);
		
		//then
		// handled on definition
	}
	
	@Test
	public void shouldReturnOIfArrayIsEmpty() {
		// given
		cp = new ComplementaryPairs(new Integer[]{});
		
		// when
		int cK = cp.findKComplementaryPairs(1);
		
		// then
		assertEquals(0, cK);
	}
	
	@Test
	public void shouldReturn0IfArrayHas1ElementOnly() {
		// given
		cp = new ComplementaryPairs(new Integer[]{1});
		
		// when
		int cK = cp.findKComplementaryPairs(1);
		
		// then
		assertEquals(0,  cK);
	}
	
	@Test
	public void shouldReturn2() {
		// given
		cp = new ComplementaryPairs(new Integer[]{1, 2});
		
		// when
		int cK = cp.findKComplementaryPairs(3);
		
		// then
		assertEquals(2, cK);
	}
	
	@Test
	public void shouldReturn4() {
		// given
		cp = new ComplementaryPairs(new Integer[]{1, 2, 1});
		
		// when
		int cK = cp.findKComplementaryPairs(3);
		
		// then
		assertEquals(4, cK);
	}
	
	@Test
	public void shouldReturn14AlsoTakingIntoAccountsNegativeNumbers() {
		// given
		cp = new ComplementaryPairs(new Integer[]{1, 2, 1, -1, 0, 2, 3, -1, 4});
		
		// when
		int cK = cp.findKComplementaryPairs(3);
		
		// then
		assertEquals(14, cK);
	}

}

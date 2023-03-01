package Cong2So;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Sum2NumberTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
    public void testSumWithSmallNumbers() {
        Sum2Number mbn = new Sum2Number();
        String result = mbn.sum("12", "34");
        assertEquals("46", result);
    }

    @Test
    public void testSumWithLargeNumbers() {
    	Sum2Number mbn = new Sum2Number();
        String result = mbn.sum("99999999999999999999999999999999999999999999999999", "1");
        assertEquals("100000000000000000000000000000000000000000000000000", result);
    }

    @Test
    public void testSumWithLeadingZeros() {
    	Sum2Number mbn = new Sum2Number();
        String result = mbn.sum("0012", "0034");
        assertEquals("0046", result);
    }

    @Test
    public void testSumWithEmptyString() {
    	Sum2Number mbn = new Sum2Number();
        String result = mbn.sum("", "");
        assertEquals("0", result);
    }

}

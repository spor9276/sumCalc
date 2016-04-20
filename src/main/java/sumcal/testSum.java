package sumcal;

import static org.junit.Assert.*;

import org.junit.Test;

public class testSum {
	private Hello exam;
	
	
	@Test
	public void testingSum() {
		exam = new Hello();
		exam.sum(5);
		assertEquals(15, exam.getResult());
	}

}

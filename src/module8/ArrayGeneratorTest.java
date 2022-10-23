package module8;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayGeneratorTest {

	@Test
	public void test() {
		int length = ArrayGenerator.arrayGenerator().length;
		assertEquals(200000000,length);
	}

}

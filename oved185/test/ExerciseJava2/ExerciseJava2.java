package ExerciseJava2;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;

import org.junit.jupiter.api.Test;

class ExerciseJava2 {

	@Test
	void testAddBigNUmbers() {
		BigInteger [] values = { new BigInteger("5"),
				new BigInteger("10000000001"),
				new BigInteger("10000000002"),
				new BigInteger("10000000003"),
				new BigInteger("10000000004"),
				new BigInteger("10000000005"), };
		
		BigInteger result = SumCounter.addBigNumbers(values);
		BigInteger expected = new BigInteger ("50000000020");
		assertEquals(expected, result);
		}
	
	
	
	
	
	
	
	}



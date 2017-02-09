package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataPrimeFactorsTest {
private KataPrimeFactors prime;
	
	@Before
	public void setup(){
		prime = new KataPrimeFactors();
	}
	
	@Test
	public void given_2_return_2() {
		int [] results = prime.factorize(2);
		
		//Assert
		Assert.assertEquals("The length should be 1", 1, results.length);
		Assert.assertEquals("This should result 2", 2, results[0]);
	}
	
	@Test
	public void given_3_return_3() {
		int [] results = prime.factorize(3);
		
		//Assert
		Assert.assertEquals("The length should be 1", 1, results.length);
		Assert.assertEquals("This should result 3", 3, results[0]);
	}
	
	@Test
	public void given_4_return_2_2() {
		int [] results = prime.factorize(4);
		
		//Assert
		Assert.assertEquals("The length should be 2", 2, results.length);
		Assert.assertEquals("The first result should be 2", 2, results[0]);
		Assert.assertEquals("The second result should be 2", 2, results[1]);

	}
	
	@Test
	public void given_6_return_2_3() {
		int [] results = prime.factorize(6);
		
		//Assert
		Assert.assertEquals("The length should be 2", 2, results.length);
		Assert.assertEquals("The first result should be 2", 2, results[0]);
		Assert.assertEquals("The second result should be 3", 3, results[1]);

	}
	@Test
	public void given_7_return_7() {
		int [] results = prime.factorize(7);
		
		//Assert
		Assert.assertEquals("The length should be 1", 1, results.length);
		Assert.assertEquals("The first result should be 7", 7, results[0]);

	}
	
	@Test
	public void given_8_return_2_2_2() {
		int [] results = prime.factorize(8);
		
		//Assert
		Assert.assertEquals("The length should be 3", 3, results.length);
		Assert.assertEquals("The first result should be 2", 2, results[0]);
		Assert.assertEquals("The second result should be 2", 2, results[1]);
		Assert.assertEquals("The third result should be 2", 2, results[2]);

	}
	
	@Test
	public void given_9_return_3_3() {
		int [] results = prime.factorize(9);
		
		//Assert
		Assert.assertEquals("The length should be 2", 2, results.length);
		Assert.assertEquals("The first result should be 3", 3, results[0]);
		Assert.assertEquals("The second result should be 3", 3, results[1]);

	}
	@Test
	public void given_10_return_2_5() {
		int [] results = prime.factorize(10);
		
		//Assert
		Assert.assertEquals("The length should be 2", 2, results.length);
		Assert.assertEquals("The first result should be 2", 2, results[0]);
		Assert.assertEquals("The second result should be 5", 5, results[1]);

	}
	
	@Test
	public void given_45_return_3_3_5() {
		int [] results = prime.factorize(45);
		
		//Assert
		Assert.assertEquals("The length should be 3", 3, results.length);
		Assert.assertEquals("The first result should be 3", 3, results[0]);
		Assert.assertEquals("The second result should be 3", 3, results[1]);
		Assert.assertEquals("The third result should be 5", 5, results[2]);

	}
}

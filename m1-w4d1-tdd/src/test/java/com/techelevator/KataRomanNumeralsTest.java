package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class KataRomanNumeralsTest {
	private KataRomanNumerals romanNum;

	@Before
	public void setup() {
		romanNum = new KataRomanNumerals();
	}

	@Test
	public void convert_1_to_I(){ 
		String result = romanNum.decimalToRoman(1);

		//Assert
		Assert.assertEquals("The value should be I","I", result);
	}

	@Test
	public void convert_4_to_IV(){ 
		String result = romanNum.decimalToRoman(4);

		//Assert
		Assert.assertEquals("The value should be IV","IV", result);
	}

	@Test
	public void convert_13_to_XIII(){ 
		String result = romanNum.decimalToRoman(13);

		//Assert
		Assert.assertEquals("The value should be XIII","XIII", result);
	}

	@Test
	public void convert_47_to_XLVII(){ 
		String result = romanNum.decimalToRoman(47);

		//Assert
		Assert.assertEquals("The value should be XLVII","XLVII", result);
	}

	@Test
	public void convert_98_to_XCVIII(){ 
		String result = romanNum.decimalToRoman(98);

		//Assert
		Assert.assertEquals("The value should be XCVIII","XCVIII", result);
	}

		@Test
		public void convert_100_to_C(){ 
			String result = romanNum.decimalToRoman(100);
	
			//Assert
			Assert.assertEquals("The value should be C","C", result);
		}

	@Test
	public void convert_126_to_CXXVI(){ 
		String result = romanNum.decimalToRoman(126);

		//Assert
		Assert.assertEquals("The value should be CXXVI","CXXVI", result);
	}
	@Test
	public void convert_774_to_CLXXIV(){ 
		String result = romanNum.decimalToRoman(774);

		//Assert
		Assert.assertEquals("The value should be DCCLXXIV","DCCLXXIV", result);
	}

	@Test
	public void convert_1568_to_MDLXVIII(){ 
		String result = romanNum.decimalToRoman(1568);

		//Assert
		Assert.assertEquals("The value should be MDLXVIII","MDLXVIII", result);
	}





}

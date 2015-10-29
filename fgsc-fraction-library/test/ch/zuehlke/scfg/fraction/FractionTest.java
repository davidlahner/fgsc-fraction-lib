package ch.zuehlke.scfg.fraction;

import static org.junit.Assert.*;

import org.junit.Test;

public class FractionTest {

	@Test
	public void gleicher_nenner() {
		//arrange
		Fraction aThird = new Fraction(1,3);
		//act
		Fraction result = aThird.add(aThird);
		//assert
		assertEquals(new Fraction(2,3), result);
	}

	@Test
	public void gleicher_nenner_vollerBruch() {
		//arrange
		Fraction twoThird = new Fraction(2,3);
		//act
		Fraction result = twoThird.add(twoThird);
		//assert
		assertEquals(new Fraction(4,3), result);
	}
	
	@Test
	public void vollerBruch_toString() {
		//arrange
		Fraction fourThird = new Fraction(4,3);
		//act
		String result = fourThird.toString();
		//assert
		assertEquals("4/3", result);
	}
	
	@Test
	public void unterschiedlicher_nenner() {
		//arrange
		Fraction oneThird = new Fraction(1,3);
		//act
		Fraction result = oneThird.add(new Fraction(1,2));
		//assert
		assertEquals(new Fraction(5,6), result);
	}
	
	@Test
	public void reduzieren() {
		//arrange
		Fraction oneEight = new Fraction(1,8);
		//act
		Fraction result = oneEight.add(new Fraction(5,8));
		//assert
		assertEquals(new Fraction(3,4), result);
	}
	
}

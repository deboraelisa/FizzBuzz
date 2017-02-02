package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FruitTreeTest {
	private FruitTree tree;
	
	@Before
	public void setup() {
		//Arrange
		tree = new FruitTree("Apple", 10);
	}
	
	@Test
	public void get_type_of_fruit_returns_apple(){
		//Arrange
		//FruitTree tree = new FruitTree("Apple", 10); ****this was moved up to before
		
		//Act
		String typeOfFruit = tree.getTypeOfFruit();
		
		//Assert
		Assert.assertEquals("Tree  should contain apples", "Apple", typeOfFruit);
		//First the message,then what you expected
	}
	
	@Test
	public void after_construction_there_should_be_10_pieces_of_fruit_left(){
		//Act
		int piecesOfFruitLeft = tree.getPiecesOfFruitLeft();
		
		//Assert
		Assert.assertEquals("There should be 10 pieces of fruit left",10, piecesOfFruitLeft); 
	}
	
	@Test
	public void should_be_able_to_pick_5_fruits(){
		//Act
		boolean success = tree.PickFruit(5);
		
		//Assert
		Assert.assertTrue("We should have been able to pick 5 fruit", success);
		Assert.assertEquals("We should have 5 pieces of fruit left", 5, tree.getPiecesOfFruitLeft());
	}
	
	@Test //the "sad" path :(
	public void should_not_be_able_to_pick_more_fruit_that_is_available() {
		//Arrange
		tree.PickFruit(7);
		
		//Act
		boolean success = tree.PickFruit(5);
		
		//Assert
		Assert.assertFalse("We should not be able to pick more fruit than the tree has", success);
		Assert.assertEquals("Failing to pick fruit should not adjust the number left", 3, tree.getPiecesOfFruitLeft());
		}
}

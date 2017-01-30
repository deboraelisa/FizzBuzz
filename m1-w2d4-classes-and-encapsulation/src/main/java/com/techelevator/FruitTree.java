package com.techelevator;

/* ### Data Members

fruitType
piecesOfFruitLeft

### Methods

bool pickFruit(int numberOfPieces)

 **Notes**
-`pickFruit()` is a method 
-returns `true` if more fruit was picked or `false` if no fruit was picked.
-when picking fruit, remember to update the number of remaining pieces
 */

public class FruitTree {
	String fruitType;
	int piecesOfFruitLeft;

	public FruitTree() {
		piecesOfFruitLeft = 0;
	}

	public String getFruitType() { 
		return fruitType;
	}

	public String setFruitType(String fruitType) {
		if(fruitType != null && !fruitType.isEmpty()) { 
			this.fruitType = fruitType;
		}
		return fruitType;
	}

	public int getPiecesOfFruitLeft() { 
		return piecesOfFruitLeft;
	}

	public void setPiecesOfFruitLeft(int piecesOfFruitLeft) { 
		if(piecesOfFruitLeft >= 0) {
			this.piecesOfFruitLeft = piecesOfFruitLeft;
		}
	}

	public boolean pickFruit(int units) {
		if(piecesOfFruitLeft > units){
			piecesOfFruitLeft -= units;
			return true;
		} else {
			return false;
		}
	}	
}

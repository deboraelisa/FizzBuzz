package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class WordSearchSensitiveCase {

	static boolean caseSensitive = true;
	public static void main(String[] args) {
		try(Scanner userInput = new Scanner(System.in)) {
			System.out.print("Enter search term >>> ");
			String searchTerm = userInput.nextLine();
			String adjustedSearchTerm = searchTerm;
			String adjustedLine = "";
			
			System.out.print("Enter File Path >>> ");
			String filePath = userInput.nextLine();
			System.out.print("Do you want the search to be case sensitive? (y or n) >>> ");
			String userCase = userInput.nextLine();
			if(userCase.equals("n")){
				caseSensitive = false;
				adjustedSearchTerm = adjustedSearchTerm.toLowerCase();
			}
			try {
				File searchFile = getSearchFile(filePath);
				try(Scanner fileInput = new Scanner(searchFile)) {
					int lineNumber = 1;
					while(fileInput.hasNextLine()) {
						String line = fileInput.nextLine();
						adjustedLine = line;
						if(caseSensitive == false) {
							adjustedLine = adjustedLine.toLowerCase();
						}
						if(adjustedLine.contains(adjustedSearchTerm)) {
							System.out.println(lineNumber + ")"+ line);
						}
						lineNumber ++;
					}
					
				}
		
			} catch (FileNotFoundException ex) {
				System.out.println(ex.getMessage());
				System.exit(1);
			} catch (IOException ex) {
				System.out.println(ex.getMessage());
				System.exit(1);
			}
		}
	}
	private static File getSearchFile(String filePath) throws IOException {
		File searchFile = new File(filePath);
		
		if(!searchFile.exists()) { //handle more specific case first
			throw new FileNotFoundException("Search file: " + filePath + " does not exist!");
			
		}
		if(!searchFile.isFile()) {
			throw new IOException("Search file: " + filePath + " exists but is not a file!");
			
		}
		
		return searchFile;
	}
}

//#### Part 2
//
//Modify the program so the user can choose to execute a case insensitive search.
//
//```
//Enter the search term >>> Alice
//Enter the file system path >>> /Users/Bob/alices_adventures_in_wonderland.txt
//Do you want the search to be case sensitive? (y or n) >>> n
//
//1) Project Gutenberg's Alice's Adventures in Wonderland, by Lewis Carroll
//9) Title: Alice's Adventures in Wonderland
//41) ALICE'S ADVENTURES IN WONDERLAND
//43) [Illustration: "Alice"]
//
//...and the output continues
//
//```

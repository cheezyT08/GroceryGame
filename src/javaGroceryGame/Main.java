package javaGroceryGame;

//@author: Torin

import java.util.*;
public class Main {

	public static void main(String[] args) throws InterruptedException {
		//Initializing variables
		boolean playing = true, skipped = false;
		Scanner scan = new Scanner(System.in);
		int score = 0, lives = 3, usedSize = GameTools.usedList.size();
		
		//Printing rules and waiting
		System.out.println("RULES: \nYour goal is to remember all of the words said "
				+"so far, all of which would be something bought at a grocery store."
				+ "\nEach turn you will add one word after repeating all reviously "
				+ "said words, same with the computer.\nPress enter to continue...");
		scan.nextLine();
		
		System.out.println("AI starts");
		
		//Game loop
		while(playing) {
			//AI's Turn
			//Making sure that the arraylist ins't empty
			if(usedSize != 0) {
				System.out.println("\n\nI went to the grocery store and bought: ");
			}
			//Printing items
			for(int i = 0; i < usedSize; i++) {
				System.out.println(GameTools.usedList.get(i));
				//Delaying random amount from 0.5 seconds to 2.5 seconds
				Thread.sleep((GameTools.getRandInt(5, 25)*100));
			}
			//Setting usedSize variable, delaying and printing\adding random word
			usedSize = GameTools.usedList.size();
			Thread.sleep(1000);
			System.out.println("AI adds: "+GameTools.getRandWord());
			Thread.sleep(3000);
			
			//Clearing Console
			for(int i = 0; i < 3000; i++) {
				System.out.println("\n\n\n\n\n\n\n\n\n\n");
			}
			
			//Players Turn
			//Setting usedSize variable
			usedSize = GameTools.usedList.size();
			//Boolean turn skipped for if it should prompt to add word after
			skipped = false;
			//Getting input for previously said words
			System.out.println("Please repeat used words back:");
			for(int i = 0; i < usedSize; i++) {
				//Printing how many words are remaining
				System.out.print((usedSize - i)+" words remaining: ");
				String input = scan.nextLine();
				
				//Testing if input is correct ignoring case
				if(input.equalsIgnoreCase(GameTools.usedList.get(i))) {
					System.out.println("Correct!! +5 points, "+lives+" live remaining");
					//Adding to score
					score += 5;
				} else {
					System.out.println("Incorrect!! The rest of your turn is skipped!");
					i = usedSize;
					skipped = true;
					lives--;
				}
			}
			//Testing if out of lives, then letting player add a word if not
			if(lives < 1) {
				System.out.println("Game over!! AI won!!");
				System.out.println("Score: "+score);
				System.exit(0);
			} else if(!skipped) {
				//Letting player add word
				System.out.print("Please add a word: ");
				String addWord = scan.nextLine();
				usedSize = GameTools.usedList.size();
				GameTools.addWord(addWord);
				System.out.println("Turn complete, Score: "+score);
				usedSize = GameTools.usedList.size();
				Thread.sleep(1000);
			}
		}
		
		//Closing scanner
		scan.close();
	}

}

package javaGroceryGame;

import java.util.*;
public abstract class GameTools {
	//Initializing random generator
	private static Random rand = new Random();

	//Initializing variables and arrays
	public static ArrayList<String> usedList = new ArrayList<String>();
	public static String[] startStringArr = {"Asparagus"
			,"Broccoli"
			,"Carrots"
			,"Cauliflower"
			,"Celery"
			,"Corn"
			,"Cucumbers"
			,"Lettuce"
			,"Mushrooms"
			,"Onions"
			,"Peppers"
			,"Potatoes"
			,"Spinach"
			,"Squash"
			,"Zucchini"
			,"Tomatoes"
			,"Apples"
			,"Avocados"
			,"Bananas"
			,"Berries"
			,"Cherries"
			,"Grapefruit"
			,"Grapes"
			,"Kiwis"
			,"Lemons"
			,"Melon"
			,"Oranges"
			,"Peaches"
			,"Nectarines"
			,"Pears"
			,"Plums"
			,"Bagels"
			,"Chip dip"
			,"English muffins"
			,"Eggs"
			,"Fruit juice"
			,"Hummus"
			,"Tortillas"
			,"Burritos"
			,"Fish sticks"
			,"Ice cream"
			,"Juice concentrate"
			,"Pizza"
			,"Popsicles"
			,"Fries"
			,"TV dinners"
			,"Vegetables"
			,"Veggie burgers"
			,"BBQ sauce"
			,"Gravy"
			,"Honey"
			,"Hot sauce"
			,"Pasta sauce"
			,"Relish"
			,"Salad dressing"
			,"Salsa"
			,"Soy sauce"
			,"Steak sauce"
			,"Syrup"
			,"Cereal"
			,"Coffee beans"
			,"Lemon juice"
			,"Mac & cheese"
			,"Olive oil"
			,"Pancake mix"
			,"Pasta"
			,"Peanut butter"
			,"Pickles"
			,"Rice"
			,"Tea"
			,"Vegetable oil"
			,"Vinegar"
			,"Applesauce"
			,"Baked beans"
			,"Chili"
			,"Fruit"
			,"Olives"
			,"Tinned meats"
			,"Tuna"
			,"Soups"
			,"Tomatoes"
			,"Veggies"
			,"Basil"
			,"Black pepper"
			,"Cilantro"
			,"Cinnamon"
			,"Garlic"
			,"Ginger"
			,"Mint"
			,"Oregano"
			,"Paprika"
			,"Parsley"
			,"Red pepper"
			,"Salt"
			,"Spice mix"
			,"Vanilla extract"
			,"Butter"
			,"Cottage cheese"
			,"Milk"
			,"Sour cream"
			,"Whipped cream"
			,"Yogurt"
			,"Blue cheese"
			,"Cheddar cheese"
			,"Cottage cheese"
			,"Cream cheese"
			,"Feta cheese"
			,"Goat cheese cheese"
			,"Mozzarella cheese"
			,"Parmesan cheese"
			,"Provolone cheese"
			,"Ricotta cheese"
			,"Sandwich slices"
			,"Swiss"
			,"Bacon"
			,"Beef"
			,"Chicken"
			,"Ground beef"
			,"Ham"
			,"Hot dogs"
			,"Turkey"
			,"Catfish"
			,"Crab"
			,"Lobster"
			,"Mussels"
			,"Oysters"
			,"Salmon"
			,"Shrimp"
			,"Tuna"
			,"Beer"
			,"Club soda"
			,"Champagne"
			,"Gin"
			,"Juice"
			,"Mixers"
			,"Wine"
			,"Rum"
			,"Soda pop"
			,"Sports drink"
			,"Bagels"
			,"Croissants"
			,"Buns"
			,"Rolls"
			,"Cake"
			,"Cookies"
			,"Donuts"
			,"Bread"
			,"Pie"
			,"Pita bread"
			,"Baking powder"
			,"Bread crumbs"
			,"Brownie mix"
			,"Cake icing"
			,"Chocolate chips"
			,"Flour"
			,"Sugar"
			,"Sugar substitute"
			,"Yeast"
			,"Candy"
			,"Cookies"
			,"Crackers"
			,"Dried fruit"
			,"Granola bars"
			,"Nuts"
			,"Oatmeal"
			,"Popcorn"
			,"Potato chips"
			,"Pretzels"
			,"Lotion"
			,"Wipes"
			,"Cat food"
			,"Cat litter"
			,"Dog food"
			,"Flea treatment"
			,"Pet shampoo"
			,"Soap"
			,"Cosmetics"
			,"Cotton swabs"
			,"Facial cleanser"
			,"Facial tissue"
			,"Floss"
			,"Hair gel"
			,"Lip balm"
			,"Moisturizing lotion"
			,"Mouthwash"
			,"Razors"
			,"Shampoo"
			,"Sunblock"
			,"Toilet paper"
			,"Toothpaste"
			,"Aluminum foil"
			,"Napkins"
			,"Non-stick spray"
			,"Paper towels"
			,"Plastic wrap"
			,"Sandwich"
			,"Wax paper"
			,"Air freshener"
			,"Bleach"
			,"Dishwasher soap"
			,"Garbage bags"
			,"Glass cleaner"
			,"Notepad"
			,"Glue"
			,"Printer paper"
			,"Pens"
			,"Postage stamps"
			,"Batteries"
			,"Charcoal"
			,"Propane"
			,"Flowers"
			,"Bug spray"
			,"Light bulbs"
			,"Newspaper"};
	
	//Generate random int
	public static int getRandInt(int max) {
		return rand.nextInt(max - 1);
	}
	
	public static int getRandInt(int min, int max) {
		while(true) {
			//Generating random integer
			int r = rand.nextInt(max - 1);
			//Testing if less than minimum, if so reseting random, else return random
			if(r < min) {
				r = rand.nextInt(max - 1);
			} else {
				return r;
			}
		}
	}
	
	//Method for adding words to used arraylist
	public static void addWord(String s) {
		usedList.add(s);
	}
	
	//Get random unused word and add to used arraylist
	public static String getRandWord() {
		int r;
		boolean rep = true, used = false;
		String tempWord = "Error!, Please Terminate Program";
		while(rep) {
			r = getRandInt(217);
			tempWord = startStringArr[r];
			for(int i = 0; i < usedList.size(); i++) {
				if(tempWord.equalsIgnoreCase(usedList.get(i))) {
					i = usedList.size();
				} else {
					used = false;
				}
			}
			if(!used) {
				rep = false;
			}
		}
		usedList.add(tempWord);
		return tempWord;
	}
}

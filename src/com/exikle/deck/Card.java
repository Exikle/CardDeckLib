package com.exikle.deck;

import java.util.HashMap;
import java.util.Map;

import android.media.Image;

/**
 * Instance of a playing card.
 * Contains the value and suit of the card.
 * 
 * @author Dixon D'Cunha
 * @param none
 */
public class Card {

	/**
	 * Enum of the car's suits
	 */
	private Suit suit;

	/**
	 * Map which holds the card's corresponding value
	 */
	private Map<Integer, String> valMap;

	/**
	 * Value of the card
	 */
	private int value;

	private Image cardFace;

	/**
	 * The Card's (**TODO FORGOT THE WORD, FIX**) which calls {@link #createMap()}
	 */
	public Card() {
		createMap();
	}

	/**
	 * Creates and fills a Hashmap to mirror the playing card values & names
	 */
	private void createMap() {// Card Value Map
		valMap = new HashMap<Integer, String>();
		valMap.put(1, "1");
		valMap.put(2, "2");
		valMap.put(3, "3");
		valMap.put(4, "4");
		valMap.put(5, "5");
		valMap.put(6, "6");
		valMap.put(7, "7");
		valMap.put(8, "8");
		valMap.put(9, "9");
		valMap.put(10, "10");
		valMap.put(11, "Jack");
		valMap.put(12, "Queen");
		valMap.put(13, "King");
	}

	/**
	 * Sets the Suit depending on the given value. 0 to 3
	 * 
	 * @param suitVal
	 */
	public void setSuit(int suitVal) {
		switch (suitVal) {
			case 0:
				suit = Suit.CLUBS;
				break;
			case 1:
				suit = Suit.DIAMONDS;
				break;
			case 2:
				suit = Suit.HEARTS;
				break;
			case 3:
				suit = Suit.SPADES;
				break;
		}
	}

	/**
	 * Sets the card's value depending on the given value. 0 to 12
	 * 
	 * @param cardVal
	 */
	public void setNumber(int cardVal) {
		value = (cardVal + 1);
	}

	/**
	 * @return Card's suit
	 */
	public Suit getSuit() {
		return suit;
	}

	/**
	 * Card's corresponding value from the map.
	 * 
	 * @return valMap.get(value)
	 */
	public String getValue() {
		return valMap.get(value) + "";
	}

	public void importCardFace() {
		//import cardface
		cardFace = null;
		
	}
}

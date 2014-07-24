package com.exikle.deck;

import java.util.Random;

/**
 * The instance of a Deck.
 * Contains 52 unique cards with the option of "re-shuffling" them.
 * 
 * @author Dixon D'Cunha
 */

public class Deck {

	/**
	 * A final amount of cards the deck needs
	 */
	private final int CARDS_AMOUNT = 52;

	/**
	 * An array of Cards
	 */
	private Card cards[];

	/**
	 * Creates a new Deck
	 */
	public Deck() {
		newDeck();
	}

	/**
	 * Creates a new instance of the deck
	 */
	private void newDeck() {
		cards = new Card[CARDS_AMOUNT];
		for (int x = 0; x < CARDS_AMOUNT; x++) {
			cards[x] = new Card();
		}
		assignCardValue();
	}

	/**
	 * Create 52 unique cards with no repetitions and then assignes them to the array, {@link #cards}.
	 */
	private void assignCardValue() {
		int cardMask[][] = new int[13][4];
		int flagCount = 0;
		boolean cOkay = false;
		while (flagCount != CARDS_AMOUNT) {
			cOkay = false;
			do {
				Random rndCard = new Random();
				int x = rndCard.nextInt(13);

				Random rndSuit = new Random();
				int y = rndSuit.nextInt(4);
				if (cardMask[x][y] == 0) {
					cOkay = true;
					cardMask[x][y] = 1;
					cards[flagCount].setSuit(y);
					cards[flagCount].setNumber(x);
					cards[flagCount].importCardFace();
					flagCount++;
				}
			} while (!cOkay);

		}

	}

	/**
	 * Gets the selected card
	 * 
	 * @param n
	 * @return the need card
	 */
	public Card getCard(int n) {
		return cards[n - 1];
	}

	/**
	 * Resets and creates a new instance of the deck and then informs the user that it has shuffled
	 */
	public void shuffleDeck() {
		newDeck();
		System.out.println("Shuffled!");
		System.out.println("----");
	}
}

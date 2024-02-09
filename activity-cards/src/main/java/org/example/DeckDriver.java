package org.example;

public class DeckDriver {
    public static void main(String[] args) {
        Deck cards = new StandardDeck();
        displayDeck(cards);

        cards.shuffle();
        displayDeck(cards);

        System.out.println(cards.size());

        Card card = new Card(Suit.CLUBS, FaceValue.JACK);
        System.out.println(cards.search(card));

        System.out.println(cards.size());
        cards.cut(1);
        System.out.println(cards);
        System.out.println(cards.size());

    }

    private static void displayDeck(Deck cards) {
        System.out.println(cards);
    }

}

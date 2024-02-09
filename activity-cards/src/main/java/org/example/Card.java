package org.example;
import java.util.Objects;

public class Card implements Comparable<Card>{

    private Suit suit;
    private FaceValue faceValue;

    @SuppressWarnings("unused")
    private Card() {
    }

    public Card(Suit suit, FaceValue faceValue) {
        this.suit = suit;
        this.faceValue = faceValue;
    }

    public Suit getSuit() {
        return this.suit;
    }

    public FaceValue getFaceValue() {
        return this.faceValue;
    }

    @Override
    public int compareTo(Card card) {
        if (this.getSuit().ordinal() > card.getSuit().ordinal()) {
            return 1;
        }

        else if (this.getSuit().ordinal() < card.getSuit().ordinal()) {
            return -1;
        }

        else {
            if (this.getFaceValue().ordinal() > card.getFaceValue().ordinal()) {
                return 1;
            }

            else if (this.getFaceValue().ordinal() < card.getFaceValue().ordinal()) {
                return -1;
            }

            else return 0;
        }
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Card)) {
            return false;
        }
        Card card = (Card) o;
        return Objects.equals(suit, card.suit) && Objects.equals(faceValue, card.faceValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, faceValue);
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Card{");
        sb.append(faceValue);
        sb.append(" of ").append(suit);
        sb.append("}");
        return sb.toString();
    }

}

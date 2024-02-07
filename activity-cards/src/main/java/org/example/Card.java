package org.example;
import java.util.Objects;

public class Card implements Comparable<Card>{

    private Suit suit;
    private FaceValue faceValue;

    private Card() {
    }

    public Card(Suit suit, FaceValue faceValue) {
        this.suit = suit;
        this.faceValue = faceValue;
    }

    public Suit getSuit() {
        return this.suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public FaceValue getFaceValue() {
        return this.faceValue;
    }

    public void setFaceValue(FaceValue faceValue) {
        this.faceValue = faceValue;
    }

    @Override
    public String toString() {
        return "{" +
            " suit='" + getSuit() + "'" +
            ", value='" + getFaceValue() + "'" +
            "}";
    }

}

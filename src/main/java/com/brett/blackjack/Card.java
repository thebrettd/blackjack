package com.brett.blackjack;

public class Card {

    private Value value;
    private Suit suit;

    public Card(Suit suit, Value value) {
        this.value = value;
        this.suit = suit;
    }

    public Value getIntValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }
}

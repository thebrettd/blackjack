package com.brett.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Hand {

    private List<Card> myCards;

    public Hand(){
        myCards = new ArrayList<Card>();
    }

    public void addCard(Card card){
        myCards.add(card);
    }

    public List<Card> getCards() {
        return myCards;
    }

    public int size() {
        return myCards.size();
    }
}

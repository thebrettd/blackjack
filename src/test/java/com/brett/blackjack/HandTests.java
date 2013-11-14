package com.brett.blackjack;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class HandTests {

    @Test
    public void testAddCard(){
        Hand testHand = new Hand();
        testHand.addCard(new Card(Suit.CLUB, Value.ACE));

        List<Card> cards = testHand.getCards();
        assertTrue(cards.size() == 1);
        assertTrue(cards.get(0).getSuit().equals(Suit.CLUB));
        assertTrue(cards.get(0).getValue().equals(Value.ACE));
    }




}

package com.brett.blackjack;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class HandTests {

    @Test
    public void testAddCard(){
        Hand testHand = new Hand();
        testHand.addCard(new Card(Suit.CLUB, Value.TEN));
        assertTrue(testHand.totals().size() == 1);
        assertTrue(testHand.totals().get(0) == 10);

        List<Card> cards = testHand.getCards();
        assertTrue(cards.size() == 1);
        assertTrue(cards.get(0).getSuit().equals(Suit.CLUB));
        assertTrue(cards.get(0).getIntValue().equals(Value.TEN));

        testHand.addCard(new Card(Suit.SPADE, Value.ACE));
        assertTrue(testHand.totals().size() == 2);
        assertTrue(testHand.totals().contains(11));
        assertTrue(testHand.totals().contains(21));

    }




}

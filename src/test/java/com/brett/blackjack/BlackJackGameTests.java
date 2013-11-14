package com.brett.blackjack;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BlackJackGameTests {

    @Test
    public void testConstructor(){
        BlackJackGame game = new BlackJackGame();
        assertTrue(game.getDealersHand().size() == 1);
        assertTrue(game.getPlayersHand().size() == 2);

    }

    @Test
    public void testHit(){
        BlackJackGame game = new BlackJackGame();
        game.hit();
        assertTrue(game.getPlayersHand().size() == 3);
    }

}

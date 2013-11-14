package com.brett.blackjack;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
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

    @Test
    //After resolving the hand, dealer cannot have a total less than 17
    public void testResolveDealerHand(){
        BlackJackGame game = new BlackJackGame();
        game.resolveDealerHand();

        boolean totalBelowSeventeenFound = false;
        for(Integer total : game.getDealersHand().totals()){
            if (total < 17){
                totalBelowSeventeenFound = true;
            }
        }
        assertFalse(totalBelowSeventeenFound);

    }

    @Test
    //After resolving the hand, dealer cannot have a total less than 17
    public void testDealerHitSoftSeventeen(){
        BlackJackGame game = new BlackJackGame();
        game.resolveDealerHand();
    }


}

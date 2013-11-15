package com.brett.blackjack;

import com.brett.blackjack.DealerStrategies.DealerHitSoftSeventeen;
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
        game.playerHit();
        assertTrue(game.getPlayersHand().size() == 3);
    }

    @Test
    //After resolving the hand, dealer cannot have a total less than 17
    //todo: figure out how to force dealers hand to soft 17..
    public void testDealerHitSoftSeventeen(){
        BlackJackGame game = new BlackJackGame();
        DealerHitSoftSeventeen resolver = new DealerHitSoftSeventeen(game);
        resolver.resolveDealerHand();

        boolean totalBelowSeventeenFound = false;
        for(Integer total : game.getDealersHand().getTotals()){
            if (total < 17){
                totalBelowSeventeenFound = true;
            }
        }
        assertFalse(totalBelowSeventeenFound);
    }


}

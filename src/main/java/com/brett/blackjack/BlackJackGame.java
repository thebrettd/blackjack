package com.brett.blackjack;


import com.brett.blackjack.DealerStrategies.DealerHandResolver;
import com.brett.blackjack.DealerStrategies.DealerHitSoftSeventeen;
import org.springframework.beans.factory.annotation.Autowired;

public class BlackJackGame {

    private Shoe shoe;
    private Hand dealersHand;
    private Hand playersHand;

    @Autowired
    private DealerHandResolver dealerHandResolver;

    public BlackJackGame(){
        this.shoe = new Shoe(6);

        dealersHand = new Hand();
        dealersHand.addCard(shoe.draw());

        playersHand = new Hand();
        playersHand.addCard(shoe.draw());
        playersHand.addCard(shoe.draw());

    }


    public Hand getDealersHand() {
        return dealersHand;
    }

    public Hand getPlayersHand() {
        return playersHand;
    }

    public void playerHit(){
        playersHand.addCard(shoe.draw());
    }

    public void dealerHit(){
        dealersHand.addCard(shoe.draw());
    }

    public void resolveDealerHand(){
        dealerHandResolver.resolveDealerHand();
    }

}

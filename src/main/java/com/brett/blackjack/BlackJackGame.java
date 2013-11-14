package com.brett.blackjack;

import java.nio.channels.FileLock;

public class BlackJackGame {

    private Hand dealersHand;
    private Hand playersHand;

    public BlackJackGame(){
        Shoe shoe = new Shoe(6);

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
}

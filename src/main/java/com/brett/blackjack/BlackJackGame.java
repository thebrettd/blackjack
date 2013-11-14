package com.brett.blackjack;

import java.nio.channels.FileLock;

public class BlackJackGame {

    private Shoe shoe;
    private Hand dealersHand;
    private Hand playersHand;

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

    public void hit(){
        playersHand.addCard(shoe.draw());
    }


}

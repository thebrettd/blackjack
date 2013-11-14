package com.brett.blackjack;


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

    private void dealerHit(){
        dealersHand.addCard(shoe.draw());
    }

    public void resolveDealerHand(){
        while(dealerBelowSeventeen()){
            dealerHit();
        }
    }

    //Dealer should hit soft seventeen because one total is less than 17..
    private boolean dealerBelowSeventeen() {
        boolean belowFound = false;
        for(Integer totals : dealersHand.totals()){
            if (totals < 17){
                return true;
            }
        }
        return belowFound;
    }


}

package com.brett.blackjack;


import com.brett.blackjack.DealerStrategies.DealerHandResolver;
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


    public boolean playerBusted() {
        boolean allTotalsBusted = true;
        for(Integer totals : playersHand.getTotals()){
            if (totals <= 21){
                allTotalsBusted = false;
            }
        }
        return allTotalsBusted;
    }

    public void resolveDealerHand() {
        while (dealerBelowSeventeen()) {
            dealerHit();
        }
    }

    //Dealer should hit soft seventeen because one total is < 17
    boolean dealerBelowSeventeen() {
        boolean belowFound = false;
        for (Integer totals : getDealersHand().getTotals()) {
            if (totals < 17) {
                return true;
            }
        }
        return belowFound;
    }

    public String result(){
        if (playerBusted()){
            return "You lose! :(";
        }else if (playersHand.finalTotal().equals(dealersHand.finalTotal())){
            return "Push";
        }else if ((playersHand.finalTotal() < dealersHand.finalTotal()) && dealersHand.finalTotal() < 22){
            return "You lose! :(";
        }else{
            return "Win!";
        }
    }

}

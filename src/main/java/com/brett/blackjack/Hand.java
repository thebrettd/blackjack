package com.brett.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Hand {

    private List<Card> myCards;
    private List<Integer> myTotals;

    public Hand(){
        myTotals = new ArrayList<Integer>();
        myTotals.add(0);

        myCards = new ArrayList<Card>();
    }

    public void addCard(Card card){
        myCards.add(card);

        if(card.getIntValue().equals(Value.ACE)){
            //increment each total by value
            List<Integer> newTotals = new ArrayList<Integer>();
            for(Integer oldTotal : myTotals){
                newTotals.add(oldTotal + 1);
                newTotals.add(oldTotal + 11);
            }
            myTotals = newTotals;
        }else{
            //increment each total by value
            List<Integer> newTotals = new ArrayList<Integer>();
            for(Integer oldTotal : myTotals){
                newTotals.add(oldTotal + card.getIntValue().value());
            }
            myTotals = newTotals;
        }



    }

    public List<Card> getCards() {
        return myCards;
    }

    public int size() {
        return myCards.size();
    }

    public List<Integer> totals(){
        return myTotals;
    }
}

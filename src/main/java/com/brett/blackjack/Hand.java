package com.brett.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Hand {

    private List<Card> cards;
    private List<Integer> totals;

    public Hand(){
        totals = new ArrayList<Integer>();
        totals.add(0);

        cards = new ArrayList<Card>();
    }

    public void addCard(Card card){
        cards.add(card);

        if(card.getIntValue().equals(Value.ACE)){
            //increment each total by value
            List<Integer> newTotals = new ArrayList<Integer>();
            for(Integer oldTotal : totals){
                newTotals.add(oldTotal + 1);
                newTotals.add(oldTotal + 11);
            }
            totals = newTotals;
        }else{
            //increment each total by value
            List<Integer> newTotals = new ArrayList<Integer>();
            for(Integer oldTotal : totals){
                newTotals.add(oldTotal + card.getIntValue().value());
            }
            totals = newTotals;
        }



    }

    public List<Card> getCards() {
        return cards;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (Card card : cards){
            sb.append(card.toString());
        }
        return sb.toString();
    }

    public int size() {
        return cards.size();
    }

    public List<Integer> getTotals(){
        return totals;
    }
}

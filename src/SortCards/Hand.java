package SortCards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand implements Comparable<Hand> {
    List<Card> cards;
    int handRank;

    public Hand() {
        this.cards = new ArrayList<>();
        this.handRank = 0;
    }

    public void add(Card card) {
        cards.add(card);
        calcRank();
    }

    public void print() {
        cards.stream().forEach(System.out::println);
    }

    public void sort() {
        Collections.sort(cards);
    }

    public void sortBySuitInValueOrder() {
        Collections.sort(cards, new BySuitInValueOrder());
    }

    public int getHandRank() {
        return handRank;
    }

    private void calcRank () {
        for (Card card : cards) {
            handRank += card.getValue();
        }
    }

    @Override
    public int compareTo(Hand hand) {
        return hand.getHandRank() - this.getHandRank();
    }
}

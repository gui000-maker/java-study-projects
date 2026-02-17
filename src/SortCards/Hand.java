package SortCards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand {
    List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void add(Card card) {
        cards.add(card);
    }

    public void print() {
        cards.stream().forEach(System.out::println);
    }

    public void sort() {
        Collections.sort(cards);
    }
}

package PlayerAndBot;

import java.util.ArrayList;
import java.util.List;

public class Bot extends Player {
    private List<String> moves = new ArrayList<>();

    public void addMove(String move) {
        this.moves.add(move);
    }
}

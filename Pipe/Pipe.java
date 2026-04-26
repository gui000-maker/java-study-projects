package Pipe;

import java.util.List;

public class Pipe<T> {
    private List<T> pipe = new java.util.ArrayList<>();

    public void putIntoPipe(T value) {
        pipe.add(value);
    }

    public T takeFromPipe() {
        if (pipe.isEmpty()) {
            return null; // Return null if the pipe is empty
        }

        T temp = pipe.getFirst(); // Get the first element
        pipe.removeFirst(); // Remove the first element from the pipe
        return temp;
    }

    public boolean isInPipe() {
        return !pipe.isEmpty(); // Return true if there are elements in the pipe
    }
}

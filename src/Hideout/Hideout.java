package Hideout;

public class Hideout<T> {
    private T hidden;

    public void putIntoHideout(T toHide) {
        if (toHide == null) {
            return;
        }
        this.hidden = toHide;
    }

    public T takeFromHideout() {
        T temp = this.hidden;
        this.hidden = null;
        return temp;
    }

    public boolean isInHideout() {
        return this.hidden != null;
    }
}

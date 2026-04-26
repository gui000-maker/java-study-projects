package ShowAndTicket;

public class Ticket {
    private int seat;
    private int code;
    private int quantity;
    private Show show;

    public Ticket(Show show) {
        this.show = show;
        this.quantity++;
    }

    public void moreTicket() {
        this.quantity++;
    }
}

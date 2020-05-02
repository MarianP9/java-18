package homework;

public class FestivalAttendeeThread extends Thread {

    private FestivalGate gate;
    private TicketType ticketType;

    public FestivalAttendeeThread(TicketType ticketType, FestivalGate gate){
        this.ticketType = ticketType;
        this.gate = gate;
    }

    public void run() {
        try {
            sleep(2000);
            synchronized (gate){
                gate.addToQueue(ticketType);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
